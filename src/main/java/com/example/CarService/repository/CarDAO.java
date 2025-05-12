package com.example.CarService.repository;

import com.example.CarService.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

/**
 1. The List for adding car is already created for you.
 2. Implement the interface DAO and override the method save() in CarDAO.
*/
@Repository
@Scope("singleton")
public class CarDAO implements DAO<Car> {

    private List<Car> carList= new ArrayList<>();
    private int id;

    @Override
    public int save(Car car) {
        car.setCarId(carList.size() + 1);
        carList.add(car);
        return car.getCarId();
    }
}
