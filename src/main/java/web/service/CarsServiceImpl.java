package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.dao.CarDAOImpl;
import web.model.Cars;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsServiceImpl implements CarsService {
    private CarDAO carDAO = new CarDAOImpl();

    @Override
    public List<Cars> index() {
        return carDAO.index();
    }

    @Override
    public List<Cars> listCars(int count) {
        List<Cars> carList = null;
        if (count < 5) {
            return carList = carDAO.index().stream().limit(count).collect(Collectors.toList());
        } else {
            return carDAO.index();
        }
    }
}
