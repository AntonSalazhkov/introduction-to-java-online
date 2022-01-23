package by.training.java.module_1.basics;

public class Task1_02 {

    public static void main(String[] args) {
        // 2. Вычислить значение выражения по формуле (все переменные принимают
        // действительные значения)

        double a, b, c, x;

        a = 5.1;
        b = 7.3;
        c = 4.4;

        x = b + Math.sqrt((b * b + 4 * a * c));

        x = x / (2 * a);

        x = x - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println("Значение заданного выражения = " + x);

    }
}
