package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
@Qualifier("CarServiceImpl")
public class CarServiceImpl implements CarService {
    List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Car1", 1, 2020));
        cars.add(new Car("Car2", 2, 2020));
        cars.add(new Car("Car3", 3, 2020));
        cars.add(new Car("Car4", 4, 2020));
        cars.add(new Car("Car5", 5, 2020));
    }

    @Autowired
    public CarServiceImpl() {
    }

    public List<Car> carListService(int n) {
        List<Car> newCarList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i == cars.size()) {
                break;
            }
            newCarList.add(cars.get(i));
        }
        return newCarList;
    }
}