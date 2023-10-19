package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAOImpl;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private final CarDAOImpl carDAO;

    @Autowired
    public CarServiceImpl(CarDAOImpl carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public void saveCar(int id, String brandName, String model, String color) {
        carDAO.saveCar(id, brandName, model, color);
    }

    @Override
    public List<Car> getCarByCount(String count) {
        int carsCount = Integer.parseInt(count);
        if (carsCount == 0 || carsCount >= 5) {
            return carDAO.getAllCars();
        }
        else {
            return carDAO.getAllCars().stream().limit(carsCount).collect(Collectors.toList());
        }
    }
}
