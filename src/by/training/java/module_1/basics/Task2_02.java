package by.training.java.module_1.basics;

public class Task2_02 {

    public static void main(String[] args) {
        // 2. Найти max{min(a,b), min(c,d)}

        double a, b, c, d, min1, min2;

        a = 2;
        b = 3;
        c = 5;
        d = 4;

        if (a >= b) {

            min1 = b;

        } else {

            min1 = a;

        }

        if (c >= d) {

            min2 = d;

        } else {

            min2 = c;

        }

        if (min1 >= min2) {

            System.out.println("Максимальное значение ввыражения max{min(" + a + "," + b + "), min(" + c + "," + d + ") = " + min1);

        } else {

            System.out.println("Максимальное значение ввыражения max{min(" + a + "," + b + "), min(" + c + "," + d + ") = " + min2);

        }
    }
}
