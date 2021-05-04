package racingcar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarFinalResult {
    private final List<Car> cars;
    private int maxPosition;
    private List<String> winners;

    public CarFinalResult(List<Car> cars) {
        this.cars = cars;
        this.winners = new ArrayList<>();
    }

    public List<String> getWinners() {
        sortCarRanking();
        return winners;
    }

    private void sortCarRanking() {
        Collections.sort(cars, (s1, s2) -> s2.getPosition() - s1.getPosition());
        maxPosition = cars.get(0).getPosition();
        setWinners();
    }

    private void setWinners() {
        for (Car car : cars) {
            setWinner(car);
        }
    }

    private void setWinner(Car car) {
        if (car.getPosition() == maxPosition) {
            winners.add(car.getCar());
        }
    }
}
