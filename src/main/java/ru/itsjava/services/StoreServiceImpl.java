package ru.itsjava.services;

import ru.itsjava.domain.Car;
import ru.itsjava.domain.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreServiceImpl implements StoreService {


    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше ФИО");
        String clientName = scanner.next();

        Client client = new Client(clientName, new ArrayList<>());

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Audi", "RS_Q8"));
        carList.add(new Car("Mercedes", "S580"));

        CarService carService = new CarServiceImpl(carList);

        ClientService clientService = new ClientServiceImpl(client, scanner, carService);

        MenuService menuService = new MenuServiceImpl(clientService, scanner);

        menuService.menu();
    }
}
