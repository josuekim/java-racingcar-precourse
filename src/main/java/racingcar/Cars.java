package racingcar;

import java.util.*;

public class Cars {
    private static final String CAR_NAME_DUPLICATE_ERROR = "중복 된 자동차 이름을 입력 하셨습니다.";
    private final List<Car> cars;

    public Cars(String inputCars) {
        this.cars = mapCar(inputCars);
        validateDuplicateName(this.cars);
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> mapCar(String inputCars) {
        List<Car> carList = new ArrayList<>();
        String[] splitCarName = inputCars.split(",");
        for (String carName : splitCarName) {
            carList.add(new Car(carName));
        }
        return carList;
    }

    public boolean validateDuplicateName(List<Car> carList) {
        Set<String> carSet = new HashSet<>();
        for (Car car : carList) {
            carSet.add(car.getCar());
        }
        if (carSet.size() != carList.size()) {
            throw new RuntimeException(CAR_NAME_DUPLICATE_ERROR);
        }
        return true;
    }
}
