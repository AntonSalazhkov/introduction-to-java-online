package by.training.java.module_5.basics_of_OOP.task05.launch;

import by.training.java.module_5.basics_of_OOP.task05.logic.Bouquet;
import by.training.java.module_5.basics_of_OOP.task05.logic.Gift;

import java.util.Scanner;

public class Client {

    String number;

    public Client() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("1. Создать цветочную композицию " + "| 2. Создать подарки "
                    + "| 0. Окончание работы программы.");

            System.out.print("\nСделайте свой выбор >> ");
            number = sc.nextLine();

            switch (number) {
                case "1":
                    Bouquet bouquet = new Bouquet();
                    break;
                case "2":
                    Gift gift = new Gift();
                    break;
                case "0":
                    System.out.print("Завершение работы программы");
            }
        } while (!number.matches("[0]"));
    }
}
