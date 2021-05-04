package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoundNumberTest {
    @Test
    @DisplayName("시도 횟수 1회 이상인지 테스트")
    public void roundNumberTest() {
        RoundNumber roundNumber = new RoundNumber(5);
        assertThat(roundNumber.getRound()).isGreaterThan(0);
    }
}
