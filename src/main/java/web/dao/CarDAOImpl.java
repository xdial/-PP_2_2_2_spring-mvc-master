package web.dao;

import org.springframework.stereotype.Component;
import web.model.Cars;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAOImpl implements CarDAO {
    private List<Cars> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Cars(1, "toyota", 2000));
        cars.add(new Cars(2, "audi", 100));
        cars.add(new Cars(3, "bmw", 5));
        cars.add(new Cars(4, "Lada", 2110));
        cars.add(new Cars(5, "Lexus", 300));
    }


    @Override
    public List<Cars> index() {
        return cars;
    }

}
