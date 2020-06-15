package domain;

import java.util.Scanner;

public class Race {
    private final static Scanner scan = new Scanner(System.in);

    public String[] getCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String[] carNames = scan.nextLine().split(",");
        return carNames;
    }

    public int getRaceTime() {
        System.out.println("시도할 회수는 몇회인가요?");
        int count = scan.nextInt();
        return count;
    }

}
