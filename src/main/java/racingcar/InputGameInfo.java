package racingcar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputGameInfo {
    private static final String INPUT_CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분";
    private static final String INPUT_ROUND_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String INPUT_ERROR_MESSAGE = "숫자를 입력해 주세요";
    private final Scanner scan;

    public InputGameInfo() {
        this.scan = new Scanner(System.in);
    }

    public String inputCarsName() {
        System.out.println(INPUT_CAR_NAME_MESSAGE);
        String carsName = scan.nextLine();
        return carsName;
    }

    public RoundNumber inputRound() {
        RoundNumber roundNumber = null;
        try {
            System.out.println(INPUT_ROUND_MESSAGE);
            int round = scan.nextInt();
            roundNumber = new RoundNumber(round);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println(INPUT_ERROR_MESSAGE);
        }

        return roundNumber;
    }
}
