package ru.itsjava.services;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {
    private final ClientService clientService;
    private final Scanner scanner;

    @Override
    public void menu() {
        while (true) {
            printMenu();
            System.out.println("Введите номер меню");
            int menuNum = scanner.nextInt();

            if (menuNum == 1) {
                System.out.println("Вы выбрали купить машину");
                clientService.byeCar();
            } else if (menuNum == 2) {
                System.out.println("Вы выбрали вернуть машину");
                clientService.bringCar();
            } else if (menuNum == 3) {
                System.out.println("Список машин в наличии");
                clientService.listCar();
            } else {
                System.out.println("До встречи");
                break;
            }

        }
    }

    @Override
    public void printMenu() {
        System.out.println("1 - Купить машину; 2 - Вернуть машину; 3 - Список машин; Все остальное выход ");
    }
}