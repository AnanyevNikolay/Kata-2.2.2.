package web.service;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> createCarsList(int count) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            carList.add(new Car("Audi", String.valueOf(i + 1), 1980 + i));
        }
        return carList;
    }

}
