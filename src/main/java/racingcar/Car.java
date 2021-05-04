package racingcar;

public class Car {
    private static final int INIT_POSITION = 0;
    private static final int MIN_NAME_LENGTH = 1;
    private static final int MAX_NAME_LENGTH = 5;
    private static final int MOVABLE = 4;
    private static final String CAR_NAME_LENGTH_ERROR = "자동차 이름은 1 ~ 5자 사이여야 합니다.";

    private final String carName;
    private int position;

    public Car(String carName) {
        validateLength(carName);
        this.carName = carName;
        this.position = INIT_POSITION;
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

    public int getPosition() {
        return position;
    }

    public void play(int number) {
        CarStatus status = checkMove(number);
        if (status.isGo()) {
            position++;
        }
    }

    public CarStatus checkMove(int number) {
        if (number >= MOVABLE) {
            return CarStatus.GO;
        }
        return CarStatus.STOP;
    }
}
