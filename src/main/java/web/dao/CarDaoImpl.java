package web.dao;

import model.Car;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", 1, "5"));
        cars.add(new Car("YAZ", 2, "Red"));
        cars.add(new Car("BAZ", 3, "blue"));
        cars.add(new Car("AUDI", 4, "Grey"));
        cars.add(new Car("INFINITI", 5, "Black"));
    }
    @Override
    public List<Car> showCars (int count){
        return  cars.stream().limit(count).toList();
    }


}
