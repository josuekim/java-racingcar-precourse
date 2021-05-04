package racingcar;

public class RoundNumber {
    private static final int MIN_NO = 1;
    private static final String ROUND_RANGE_ERROR = "시도 횟수는 1회 이상이어야 합니다.";
    private final int round;

    public RoundNumber(int round) {
        if (round < MIN_NO) {
            throw new IllegalArgumentException(ROUND_RANGE_ERROR);
        }
        this.round = round;
    }

    public int getRound() {
        return round;
    }
}
