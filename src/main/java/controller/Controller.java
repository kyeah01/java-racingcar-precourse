package controller;

import domain.Car;
import domain.Cars;
import view.InputView;
import view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static List<String> getCarNames(String carNamesString) {
        List<String> carNames = new ArrayList<String>();
        for (String name : carNamesString.split(",")) {
            carNames.add(name);
        }
        return carNames;
    }

    public static void raceStart(Cars cars, int count) {
        for (int k = 0; k < count; k++) {
            cars.oneMinuiteRater();
            OutputView.printRaceTrack(cars);
        }
    }

    public static void race() {
        String carNamesString = InputView.getCarName();
        List<String> carNames = getCarNames(carNamesString);

        int count = InputView.getRaceTime();

        Cars cars = new Cars(carNames);

        raceStart(cars, count);

        List<Car> winners = cars.getWinner();
        OutputView.printWinner(winners);
    }

}
