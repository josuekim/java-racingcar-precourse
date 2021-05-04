package racingcar;

public class RoundNumber {
    private static final int MIN_NO = 1;
    private static final String ROUND_RANGE_ERROR = "시도 횟수는 1회 이상이어야 합니다.";
    private final int round;

    public RoundNumber(String round) {
        this.round = stringToInteger(round);
        if (this.round < MIN_NO) {
            throw new IllegalArgumentException(ROUND_RANGE_ERROR);
        }
    }

    public int stringToInteger(String round) {
        return Integer.parseInt(round);
    }

    public int getRound() {
        return round;
    }
}
