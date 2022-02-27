package ru.itsjava.services;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.domain.Car;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarServiceImplTest {
    public static final String DEFAULT_BRAND = "BMW";
    public static final String DEFAULT_MODEL = "M5";
    List<Car> carList = new ArrayList<>();

    @DisplayName("Проверка Take Car")
    @Test
    public void shouldHaveCorrectTakeCarByModel() {
        Car actualCar = new Car(DEFAULT_BRAND, DEFAULT_MODEL);
        carList.add(actualCar);
        CarServiceImpl carService = new CarServiceImpl(carList);

        assertAll("carList", ()-> assertEquals(actualCar, carService.takeCarByModel(DEFAULT_MODEL)));

    }
}
