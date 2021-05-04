package racingcar;

public class Car {
    private static final int MIN_NAME_LENGTH = 1;
    private static final int MAX_NAME_LENGTH = 5;
    private static final String CAR_NAME_LENGTH_ERROR = "자동차 이름은 1 ~ 5자 사이여야 합니다.";
    private final String carName;

    public Car(String carName) {
        validateLength(carName);
        this.carName = carName;
    }

    public String getCar() {
        return carName;
    }

    public boolean validateLength(String carName) {
        if (carName.length() < MIN_NAME_LENGTH ||
                carName.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(CAR_NAME_LENGTH_ERROR);
        }
        return true;
    }
}
