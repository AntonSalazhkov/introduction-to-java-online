package by.training.java.module_4.programming_with_classes.task08;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
        //и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
        //и методами. Задать критерии выбора данных и вывести эти данные на консоль.
        //Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
        //Найти и вывести:
        //a) список покупателей в алфавитном порядке;
        //b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

        Customer[] customer = new Customer[5];

        customer[0] = new Customer(1111, "Petrov", "Maksim", "Ivanovich", "Gomel", new BigInteger("1111222233334444"), 12344567);
        customer[1] = new Customer(2222, "Petrov", "Anton", "Ivanovich", "Gomel", new BigInteger("2222333344445555"), 12344567);
        customer[2] = new Customer(3333, "Ivanov", "Anton", "Ivanovich", "Gomel", new BigInteger("3333444455556666"), 12344567);
        customer[3] = new Customer(4444, "Sviridov", "Maksim", "Ivanovich", "Gomel", new BigInteger("4444555566667777"), 12344567);
        customer[4] = new Customer(5555, "Bogdanov", "Artem", "Ivanovich", "Gomel", new BigInteger("5555666677778888"), 12344567);

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String number;

        System.out.println("Текущий список покупателей:");
        Customer.toString(customer);
        do {
            System.out.print("\nВыберите пункт меню:"
                    + "\n1. Вывести список покупателей в алфавитном порядке"
                    + "\n2. Вывести список покупателей, у которых номер кредитной карточки находится в заданном интервале"
                    + "\n0. Окончание работы программы.");

            System.out.print("\nПожалуйста, сделайте свой выбор в меню >> ");
            number = sc.nextLine();

            switch (number) {
                case "1":
                    Shop shop = new Shop();
                    shop.sortAlphabetically(customer);
                    break;
                case "2":
                    System.out.println("\nУстановите начальный и конечный интервал: ");
                    shop = new Shop();
                    shop.sortByInterval(customer, setInterval(), setInterval());

                    break;
                case "0":
                    System.out.print("Завершение работы приложения");
            }
        } while (!number.matches("[0]"));
    }

    public static BigInteger setInterval() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print(">> ");
        while (!sc.hasNextBigInteger()) {
            sc.nextLine();
            System.out.print(">> ");
        }
        return sc.nextBigInteger();
    }
}
