package view;

import java.util.List;
import java.util.Scanner;

public class InputView {
    private final static Scanner scan = new Scanner(System.in);

    public static String getCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        // TODO : split은 model에서 해야할까?
        String carNames = scan.nextLine();
        return carNames;
    }

    public static int getRaceTime() {
        System.out.println("시도할 회수는 몇회인가요?");
        int count = scan.nextInt();
        return count;
    }
}
