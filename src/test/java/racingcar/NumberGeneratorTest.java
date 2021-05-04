package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberGeneratorTest {
    @Test
    @DisplayName("0 ~ 9 사이 숫자 검증 테스트")
    public void numberTest() {
        NumberGenerator number = new NumberGenerator();
        assertThat(number.getNumber()).isBetween(0,9);
    }
}
