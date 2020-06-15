package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cars {
//     일급 컬렉션의 규칙
//     wrapping : 멤버변수로 컬렉션만 가진다.
//     1.
//    private final List<Car> cars;
//
//    public Cars(List<Car> cars) {
//        this.cars = cars;
//    }

//    2. 검증이 안됐을수 있음.
    private final List<Car> cars = new ArrayList<>();

    public Cars(List<String> carNames) {
        for (String name : carNames) {
            cars.add(new Car(name));
        }
    }

    public int getMaxPosition() {
        int maxPosition = 0;
        for (Car car : cars) {
            maxPosition = car.getBiggerPosition(maxPosition);
        }
        return maxPosition;
    }

    public List getWinner() {
        List winners = new ArrayList<>();
        int maxPosition = getMaxPosition();
        for (Car car : cars) {
            if (car.isMaxPosition(maxPosition)) {
                winners.add(car);
            }
        }
        return winners;
    }

    public void oneMinuiteRater() {
        for (Car car : cars) {
            car.move();
        }
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(cars);
    }
}
