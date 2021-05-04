package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    private Cars cars;

    @BeforeEach
    public void setUpCar() {
        cars = new Cars("pobi,konan");
    }

    @Test
    @DisplayName("자동차 등록 대수 테스트")
    public void getCarsListTest() {
        assertThat(cars.getCars().size()).isEqualTo(2);
    }

    @Test
    @DisplayName("자동차 이름 중복 테스트")
    public void duplicateCarNameTest() {
        assertThat(cars.validateDuplicateName(cars.getCars())).isTrue();
    }
}
