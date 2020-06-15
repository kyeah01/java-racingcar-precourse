package view;

import java.util.List;
import java.util.StringJoiner;

import domain.Car;
import domain.Cars;

public class OutputView {
    public static void printRaceTrack(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.print(car.getName() + " : ");
            for (int j = 0; j < car.getPosition(); j++) {
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printWinner(List<Car> winners) {
        StringJoiner strJoiner = new StringJoiner(",");
        for (Car car: winners) {
            strJoiner.add(car.getName());
        }
        System.out.print(strJoiner.toString() + "가 최종 우승했습니다.");
    }
}
