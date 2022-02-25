package ru.itsjava.services;

import ru.itsjava.domain.Car;

public interface CarService {

    Car takeCarByModel(String model);

    void returnCar(Car car);

    boolean hasCar(String model);

    void listCar();

}
