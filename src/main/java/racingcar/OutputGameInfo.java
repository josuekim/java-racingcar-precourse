package racingcar;

import java.util.List;
import java.util.StringJoiner;

public class OutputGameInfo {
    private static final String WINNER_ANNOUNCE_MESSAGE = "%s가 최종 우승했습니다.";

    public static void printWinners(Cars cars) {
        CarFinalResult carFinalResult = new CarFinalResult(cars.getCars());
        String result = String.format(WINNER_ANNOUNCE_MESSAGE, joinWinnerString(carFinalResult.getWinners()));
        System.out.println();
        System.out.println(result);
    }

    public static String joinWinnerString(List<String> winners) {
        StringJoiner winnerJoiner = new StringJoiner(", ");
        for (String winner : winners) {
            winnerJoiner.add(winner);
        }
        return winnerJoiner.toString();
    }

    public static void printProgress(Cars cars) {
        System.out.println();
        for (Car car : cars.getCars()) {
            CarResult carResult = new CarResult(car);
            System.out.println(carResult.printMovePosition());
        }
    }
}
