package web.dao;

import model.Car;

import java.util.List;

public interface CarDao {
    public List<Car> showCars(int count);
}
