package by.training.java.module_1.basics;

public class Task3_05 {

    public static void main(String[] args) {
        // 5. Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, модуль
        // которых больше или равен заданному e.

        double a, n, e, i, z;

        z = 0; // сумма членов ряда

        e = 0.1;

        n = 9;

        for (i = 0; i <= n; i++) {

            a = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);

            if (Math.abs(a) >= e) {

                z += a;

            }
        }

        System.out.println("Сумма членов ряда модуль которых больше " + e + " = " + z);
    }
}
