package ru.itsjava.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Класс Car должен ")
public class CarTest {

    public static final String DEFAULT_BRAND = "BMW";
    public static final String DEFAULT_MODEL = "i8";

    @DisplayName(" корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor() {
        Car actualCar = new Car(DEFAULT_BRAND, DEFAULT_MODEL);

//     assertEquals(DEFAULT_BRAND, actualCar.getBrand());
//     assertEquals(DEFAULT_MODEL, actualCar.getModel());
        assertAll("actualCar", () -> assertEquals(DEFAULT_BRAND, actualCar.getBrand()),
                () -> assertEquals(DEFAULT_MODEL, actualCar.getModel()));

    }

}
