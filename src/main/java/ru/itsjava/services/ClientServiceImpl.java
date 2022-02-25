package ru.itsjava.services;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Car;
import ru.itsjava.domain.Client;

import java.util.Scanner;

@Data
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final Client client;
    private final Scanner scanner;
    private final CarService carService;

    @Override
    public void byeCar() {
        System.out.println("Введите название модели");
        String model = scanner.next();
        if (carService.hasCar(model)) {
            System.out.println("Купить машину");
            carService.takeCarByModel(model);
            System.out.println("Вы купили машину " + model);
        } else {
            System.out.println("Покупка не удалась. Такой модели нет");
        }
    }

    @Override
    public void bringCar() {
        System.out.println("Введите название модели");
        String model = scanner.next();

        System.out.println("Введите марку машины");
        String brand = scanner.next();

        Car car = new Car(model, brand);

        carService.returnCar(car);
        System.out.println("Вы вернули машину");
    }

    @Override
    public void listCar() {
        System.out.println("Уважаемый " + client.getName());
        System.out.println("Это список доступных на сегодня машин: ");
        carService.listCar();
    }
}
