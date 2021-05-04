package racingcar;

public class CarResult {
    private static final String POSITION_STATE_MESSAGE = "%s : %s";
    private final Car car;
    public CarResult(Car car) {
        this.car = car;
    }

    public String getMovePosition() {
        StringBuilder printPosition = new StringBuilder();

        for (int i = 0; i < car.getPosition(); i++) {
            printPosition.append("-");
        }

        return printPosition.toString();
    }

    public void printMovePosition() {
        String result = String.format(POSITION_STATE_MESSAGE, car.getCar(), getMovePosition());
        System.out.println(result);
    }
}
