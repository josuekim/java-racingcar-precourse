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

    @Test
    @DisplayName("자동차 위치 초기값 테스트")
    public void initPositionTest() {
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    @DisplayName("자동차 이동 테스트")
    public void goAndStopTest() {
        CarStatus status = car.checkMove(4);
        assertThat(status).isEqualTo(CarStatus.GO);
        car.play(4);
        car.play(1);
        assertThat(car.getPosition()).isEqualTo(1);
    }
}
