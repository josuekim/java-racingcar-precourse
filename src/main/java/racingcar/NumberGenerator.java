package racingcar;

import java.util.Random;

public class NumberGenerator {
    private static final int MIN_NO = 0;
    private static final int MAX_NO = 9;
    private static final int RANDOM_BOUND = 10;
    private static final String NUMBER_RANGE_ERROR = "숫자는 0부터 9의 값이어야 합니다.";

    private final int no;

    public NumberGenerator() {
        Random rand = new Random();
        int no = rand.nextInt(RANDOM_BOUND) ;
        if (no < MIN_NO || no > MAX_NO) {
            throw new IllegalArgumentException(NUMBER_RANGE_ERROR);
        }
        this.no = no;
    }

    public int getNumber() {
        return no;
    }
}
