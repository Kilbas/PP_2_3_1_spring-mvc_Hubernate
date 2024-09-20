package web.Service;

import model.Car;

import java.io.IOException;
import java.util.List;

public interface CarService {
    public List<Car> showCars(String count) throws IOException;

}
