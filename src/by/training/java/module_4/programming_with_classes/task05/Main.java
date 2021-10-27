package by.training.java.module_4.programming_with_classes.task05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
        // на единицу в заданном диапазоне.
        // Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
        // Счетчик имеет методы увеличения и уменьшения состояния,
        // и метод позволяющий получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

        Counter counter = new Counter();

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("\nВыберите пункт меню:"
                + "\n1. Запустить счетчик с увеличением на единицу в заданном диапазоне"
                + "\n2. Запустить счетчик с уменьшением на единицу в заданном диапазоне"
                + "\n3. Запустить счетчик по умолчанию (0 - 100)"
                + "\n4. Текущее значение счетчика"
                + "\n0. Окончание работы программы.\n");

        String number;
        do {
            System.out.print("\nПожалуйста, сделайте свой выбор в меню >> ");
            number = sc.nextLine();

            switch (number) {
                case "1":
                    inputNumbers(counter, 1);
                    break;
                case "2":
                    inputNumbers(counter, 2);
                    break;
                case "3":
                    counter = new Counter();
                    counter.ascendingCounter();
                    break;
                case "4":
                    System.out.println("Текущее значение счетчика: " + counter.getCurrentState());
                    break;
                case "0":
                    System.out.println("Завершение работы приложения");
            }
        } while (!number.matches("[0]"));
    }

    public static void inputNumbers(Counter counter, int parameter) {

        counter.setMin(getIntFromConsole("Укажите начальный диапазон счетчика >> "));
        counter.setMax(getIntFromConsole("Укажите конечный диапазон счетчика >> "));

        if (parameter == 1) {
            counter.ascendingCounter();
        } else {
            counter.decreasingCounter();
        }
    }

    public static int getIntFromConsole(String message) {
        Scanner sc = new Scanner(System.in);

        System.out.print(message);
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print(message);
        }
        return sc.nextInt();
    }
}
