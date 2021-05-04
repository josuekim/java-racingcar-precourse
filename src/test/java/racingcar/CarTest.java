package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    private Car car;

    @BeforeEach
    public void setUpCar() {
        car = new Car("pobi");
    }

    @Test
    @DisplayName("자동차 이름 테스트")
    public void carNameTest() {
        assertThat(car.getCar()).isEqualTo("pobi");
    }

    @Test
    @DisplayName("자동차 이름 길이 테스트")
    public void carNameLengthTest() {
        assertThat(car.validateLength(car.getCar())).isTrue();
    }
}
