package by.training.java.module_4.programming_with_classes.task01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1 .Создайте класс Test1 двумя переменными.
        // Добавьте метод вывода на экран и методы изменения этих переменных.
        // Добавьте метод, который находит сумму значений этих переменных,
        // и метод, который находит наибольшее значение из этих двух переменных.

        Test1 test = new Test1();

        do {
            System.out.println("Введите число без букв, символов и пробелов");
            test.numberOne = enterFromConsole();
            test.numberTwo = enterFromConsole();

            test.showInConsole();

            System.out.println("Сумма значений переменных: " + test.sum());
            System.out.println("Переменная с наибольшим значением: " + test.findMax());
            System.out.println("Введите любое число для продолжения или 0 для окончания работы программы");

        } while (enterFromConsole() != 0);

        System.out.println("Окончание работы программы");
    }

    public static int enterFromConsole() {
        @SuppressWarnings("resource")
        Scanner numberInput = new Scanner(System.in);
        int value;

        System.out.print("Введите число >> ");
        while (!numberInput.hasNextInt()) {
            numberInput.nextLine();
            System.out.print("Введите число >> ");
        }
        value = numberInput.nextInt();
        return value;
    }
}

