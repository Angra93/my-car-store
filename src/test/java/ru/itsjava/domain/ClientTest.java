package ru.itsjava.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс Client должен ")
public class ClientTest {

    public static final String DEFAULT_NAME = "Vova";
    public static final ArrayList<Car> DEFAULT_CAR = new ArrayList<>();

    @DisplayName(" корректно создаваться конструктором")
    @Test
    public void shouldHaveCorrectConstructor() {
        Client actualClient = new Client(DEFAULT_NAME, DEFAULT_CAR);

        assertAll("actualClient", () -> assertEquals(DEFAULT_NAME, actualClient.getName()),
                () -> assertEquals(DEFAULT_CAR, actualClient.getCars()));
    }
}
