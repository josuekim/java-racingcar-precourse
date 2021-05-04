package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarFinalResultTest {
    private Cars cars;

    @BeforeEach
    public void setUpCar() {
        cars = new Cars("pobi,konan,josue");
    }

    @Test
    @DisplayName("우승자 찾기 테스트")
    public void winnerTest() {
        Car car1 = cars.getCars().get(0);
        car1.play(4);
        car1.play(1);
        Car car2 = cars.getCars().get(1);
        car2.play(4);
        car2.play(6);
        Car car3 = cars.getCars().get(2);
        car3.play(4);
        car3.play(6);

        CarFinalResult carFinalResult = new CarFinalResult(cars.getCars());
        List<String> winners = carFinalResult.getWinners();
        assertThat(winners.get(0)).isEqualTo("konan");
        assertThat(winners.get(1)).isEqualTo("josue");
    }
}
