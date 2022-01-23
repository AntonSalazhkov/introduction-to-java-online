package by.training.java.module_1.basics;

import java.util.Scanner;

public class Task3_07 {

    public static void main(String[] args) {
        // 7. Для каждого натурального числа в промежутке от m до n вывести все делители,
        // кроме единицы и самого числа. m и n вводятся с клавиатуры.

        int m, n, i, x;

        Scanner sc1 = new Scanner(System.in);

        System.out.print("m >> ");

        while (!sc1.hasNextInt()) {  // Если число не Int то цикл повторяется пока не станет Int

            sc1.nextLine();

            System.out.print("m >> ");
        }

        m = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);

        System.out.print("n >> ");

        while (!sc2.hasNextInt()) {

            sc2.nextLine();

            System.out.print("n >> ");
        }

        n = sc2.nextInt();

        while (m <= n) {

            System.out.print("Делители числа " + m + ": ");

            x = 0; // Сообщение для чисел у которых нет делителей

            for (i = 2; i < m; i++) {

                if (m % i == 0) {

                    System.out.print(i + ", ");

                    x += 1; // Сообщение для чисел у которых нет делителей
                }
            }

            if (x == 0) { // Сообщение для чисел у которых нет делителей

                System.out.print("Нет");
            }

            m += 1;

            System.out.println("");
        }
    }
}
