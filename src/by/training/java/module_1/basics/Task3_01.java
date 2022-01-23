package by.training.java.module_1.basics;

import java.util.Scanner;

public class Task3_01 {

    public static void main(String[] args) {
        // 1. Напишите программу, где пользователь вводит любое целое положительное
        // число. А программа суммирует все числа от 1 до введенного пользователем
        // числа.

        int x, y, z;

        z = 0;       // сумма всех чисел

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        do {

            System.out.print(">> ");

            while (!sc.hasNextInt()) {

                sc.nextLine();

                System.out.print(">> ");

            }

            x = sc.nextInt();

        } while (x < 0);

        for (y = 1; y <= x; y++) {

            z = z + y;

            System.out.println(y);

        }
        System.out.println("Сумма всех цифр от 1 до введенного числа " + x + " = " + z);
    }
}
