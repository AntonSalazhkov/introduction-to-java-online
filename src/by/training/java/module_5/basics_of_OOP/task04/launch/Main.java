package by.training.java.module_5.basics_of_OOP.task04.launch;

import by.training.java.module_5.basics_of_OOP.task04.logic.Choice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
          Создать консольное приложение, удовлетворяющее следующим требованиям:
          -Приложение должно быть объектно-, а не процедурно-ориентированным.
          -Каждый класс должен иметь отражающее смысл название и информативный состав.
          -Наследование должно применяться только тогда, когда это имеет смысл.
          -При кодировании должны быть использованы соглашения об оформлении кода java code convention.
          -Классы должны быть грамотно разложены по пакетам.
          -Консольное меню должно быть минимальным
          -Для хранения данных можно использовать файлы.

          Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
          Реализовать возомжность просмотра сокровищ, выбора самого дорогого по стоимости сокровища
          и выбора сокровищ на заданную сумму.
         */

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Choice choice = new Choice();
        String number;

        do {
            if (!choice.create()) {   // Создаем файл с сокровищами, если неудача - то выход из программы
                System.out.println("Сокровища не были созданы");
                number = "0";
            } else {
                System.out.print("1. Просмотр сокровищ "
                        + "| 2. Самое дорогое по стоимости сокровище "
                        + "| 3. Выбор сокровища по сумме "
                        + "| 0. Окончание работы программы.");

                System.out.print("\nСделайте свой выбор >> ");
                number = sc.nextLine();
            }

            switch (number) {
                case "1":
                    choice.viewingTreasures();
                    break;
                case "2":
                    choice.choosingTheExpensive();
                    break;
                case "3":
                    String inputAmount;
                    do {
                        System.out.print("Введите сумму >> ");
                        inputAmount = sc.nextLine();
                    } while (!choice.choiceByAmount(inputAmount));
                    break;
                case "0":
                    System.out.print("Завершение работы программы");
                    choice.deleteFile();
            }
        } while (!number.matches("[0]"));
    }
}
