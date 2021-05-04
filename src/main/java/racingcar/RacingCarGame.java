package racingcar;

public class RacingCarGame {
    private final InputGameInfo inputGameInfo = new InputGameInfo();
    private Cars cars;
    private RoundNumber roundNumber;

    private void init() {
        do {
            setRacingCar();
        } while (cars == null);

        do {
            roundNumber = inputGameInfo.inputRound();
        } while (roundNumber == null);
    }

    private void setRacingCar() {
        try {
            cars = new Cars(inputGameInfo.inputCarsName());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    private void runRound() {
        for (int i = 0; i < roundNumber.getRound(); i++) {
            setRandomNumber();
            OutputGameInfo.printProgress(cars);
        }
    }

    private void setRandomNumber() {
        for (Car car : cars.getCars()) {
            car.play(new NumberGenerator().getNumber());
        }
    }

    private void awardWinner() {
        OutputGameInfo.printWinners(cars);
    }

    public void run() {
        init();
        runRound();
        awardWinner();
    }
}
