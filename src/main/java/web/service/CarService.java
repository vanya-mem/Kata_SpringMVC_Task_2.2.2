package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    void saveCar(int id, String brandName, String model, String color);
    List<Car> getCarByCount(String count);
}
