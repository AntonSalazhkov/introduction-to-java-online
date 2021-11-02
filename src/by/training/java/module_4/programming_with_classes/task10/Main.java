package by.training.java.module_4.programming_with_classes.task10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
        и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
        методами. Задать критерии выбора данных и вывести эти данные на консоль.
        Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
        Найти и вывести:
        a) список рейсов для заданного пункта назначения;
        b) список рейсов для заданного дня недели;
        c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
        */

        Airline[] airline = new Airline[5];

        airline[0] = new Airline("Dubai", 101, "AIRBUS", "19:00", "Monday");
        airline[1] = new Airline("Berlin", 444, "BOEING", "21:25", "Saturday");
        airline[2] = new Airline("Minsk", 999, "AIRBUS", "19:40", "Tuesday");
        airline[3] = new Airline("Moscow", 666, "BOEING", "11:15", "Tuesday");
        airline[4] = new Airline("Dubai", 777, "AIRBUS", "10:30", "Sunday");

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String number;

        System.out.println("Текущий список авиорейсов:");
        Airline.toString(airline);

        do {
            System.out.print("\nВыберите пункт меню:"
                    + "\n1. Вывести список рейсов для заданного пункта назначения"
                    + "\n2. Вывести список рейсов для заданного дня недели"
                    + "\n3. Вывести список рейсов для заданного дня недели, время вылета для которых больше заданного"
                    + "\n0. Окончание работы программы.");

            System.out.print("\nПожалуйста, сделайте свой выбор в меню >> ");
            number = sc.nextLine();

            switch (number) {
                case "1":
                    System.out.print("Задайте пункт назначения >> ");
                    Airport.getFlightList(airline, sc.nextLine(), 1, "");  //"" - пустой параметр необходим только для case "3"
                    break;
                case "2":
                    System.out.print("Задайте день недели >> ");
                    Airport.getFlightList(airline, sc.nextLine(), 2, "");
                    break;
                case "3":
                    System.out.print("Задайте день недели >> ");
                    String days = sc.nextLine();
                    System.out.print("Задайте время вылета (через двоеточие) >> ");
                    String time = sc.nextLine();
                    Airport.getFlightList(airline, days, 3, time);
                    break;
                case "0":
                    System.out.print("Завершение работы приложения");
            }
        } while (!number.matches("[0]"));
    }
}