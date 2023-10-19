package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    void saveCar(int id, String brandName, String model, String color);
    List<Car> getAllCars();
}
