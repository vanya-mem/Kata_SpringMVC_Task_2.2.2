package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO {

    private static int CARS_COUNT;

    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(++CARS_COUNT, "Ferrari", "F40", "Red"));
        carList.add(new Car(++CARS_COUNT, "Mercedes", "C-klasse", "Brown"));
        carList.add(new Car(++CARS_COUNT, "Volkswagen", "Passat CC", "White"));
        carList.add(new Car(++CARS_COUNT, "BMW", "X5", "Blue"));
        carList.add(new Car(++CARS_COUNT, "Nissan", "Tiida", "Metallic-silver"));
        carList.add(new Car(++CARS_COUNT, "Zhiguli", "2106", "Cream-white"));
    }

    @Override
    public void saveCar(int id, String brandName, String model, String color) {
        carList.add(new Car(id, brandName, model, color));
    }

    @Override
    public List<Car> getAllCars() {
        return carList;
    }
}
