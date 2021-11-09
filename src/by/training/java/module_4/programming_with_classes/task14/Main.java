package by.training.java.module_4.programming_with_classes.task14;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
        //счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
        //всем счетам, имеющим положительный и отрицательный балансы отдельно.

        BankClient client = new BankClient(Arrays.asList(
                new BankAccount(4444, "Ivanov", 0, "locked"),
                new BankAccount(2222, "Ivanov", 1000, "unlocked"),
                new BankAccount(3333, "Ivanov", 2000, "unlocked"),
                new BankAccount(1111, "Ivanov", -500, "unlocked")));

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String number;

        System.out.println("Текущий список счетов:");
        client.toSting();

        do {
            System.out.print("\nВыберите пункт меню:"
                    + "\n1. Найти счет по номеру"
                    + "\n2. Отсортировать счета по возрастанию номера"
                    + "\n3. Вычислить общую сумму по всем счетам"
                    + "\n4. Вычислить отдельную сумму по положительным и отрицательным счетам"
                    + "\n0. Окончание работы программы.");

            System.out.print("\nПожалуйста, сделайте свой выбор в меню >> ");
            number = sc.nextLine();

            switch (number) {
                case "1":
                    System.out.print("Задайте номер счета >> ");
                    client.findByNumber(sc.nextLine());
                    break;
                case "2":
                    client.getSortAccountNumber();
                    client.toSting();
                    break;
                case "3":
                    System.out.print("Общая сумма по всем счетам: " + client.getTotalSum());
                    break;
                case "4":
                    client.getSeparateSum();
                    break;
                case "0":
                    System.out.print("Завершение работы приложения");
            }
            System.out.println("");
        } while (!number.matches("[0]"));
    }
}