package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarResultTest {
    private Car car;

    @BeforeEach
    public void setUpCar() {
        car = new Car("pobi");
    }

    @Test
    public void moveResultTest() {
        car.play(3);
        CarResult result = new CarResult(car);
        assertThat(result.getMovePosition().length()).isEqualTo(0);
    }
}
