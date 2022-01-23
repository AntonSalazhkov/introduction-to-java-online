package by.training.java.module_1.basics;

public class Task3_02 {

    public static void main(String[] args) {
        // 2. Вычислите значение функции на отрезке [a, b] с шагом h

        int a, b, h, x, y;

        a = -5;
        b = 8;
        h = 2;

        for (x = a; x <= b; x += h) {

            if (x > 2) {

                y = x;

            } else {

                y = x * (-1);

            }

            System.out.println("При x = " + x + ", y = " + y);

        }
    }
}
