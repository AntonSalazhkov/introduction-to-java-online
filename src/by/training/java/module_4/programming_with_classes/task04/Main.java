package by.training.java.module_4.programming_with_classes.task04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
        // Создайте данные в массив из пяти элементов типа Train,
        // добавьте возможность сортировки элементов массива по номерам поездов.
        // Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
        // Добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами назначения
        // должны быть упорядочены по времени отправления.

        Train[] trains = new Train[5];

        trains[0] = new Train("Витебск", 456, "20:15");
        trains[1] = new Train("Гомель", 765, "12:35");
        trains[2] = new Train("Брест", 303, "14:15");
        trains[3] = new Train("Минск", 989, "21:30");
        trains[4] = new Train("Гомель", 123, "19:20");
        System.out.println("Текущие поезда: ");

        for (int i = 0; i < trains.length; i++) {
            System.out.println("Пункт назначения: " + trains[i].getDestinationName() + ". № поезда: "
                    + trains[i].getTrainNumber() + ". Время отправления: " + trains[i].getDepartureTime());
        }
        Menu(trains);
    }

    public static void Menu(Train trains[]) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("\nВыберите пункт меню:"
                + "\n1. Сортировка поездов по номерам (по возрастанию)."
                + "\n2. Информация о поезде по номеру."
                + "\n3. Сортировка поездов по пункту назначения."
                + "\n0. Окончание работы программы.\n");

        String number;

        do {
            System.out.print("\nПожалуйста, сделайте свой выбор в меню >> ");
            number = sc.nextLine();

            switch (number) {
                case "1":
                    Train.sortByNumbers(trains);
                    break;
                case "2":
                    String choiceNumber;
                    do {
                        System.out.print("\nВыберите номер поезда >> ");
                        choiceNumber = sc.nextLine();
                    } while (!Train.informationByNumbers(trains, choiceNumber));   //при вводе нужного номера выход из данного меню
                    break;
                case "3":
                    Train.sortByDestination(trains);
                    break;
                case "0":
                    System.out.println("Завершение работы приложения");
            }
        } while (!number.matches("[0]"));
    }
}
