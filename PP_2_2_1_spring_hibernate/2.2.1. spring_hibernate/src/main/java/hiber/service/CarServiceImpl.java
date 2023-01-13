package hiber.service;

import hiber.dao.CarDao;
import hiber.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDao carDao;
    @Transactional
    @Override
    public void addCar(Car car) {
        carDao.addCar(car);
    }
}
