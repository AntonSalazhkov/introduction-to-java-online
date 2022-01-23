package by.training.java.module_1.basics;

public class Task1_03 {

    public static void main(String[] args) {
        // 3. Вычислить значение выражения по формуле (все переменные принимают
        // действительные значения)

        double x, y, z;

        x = 1;
        y = 2;

        z = Math.sin(x) + Math.cos(y);

        z = z / (Math.cos(x) - Math.sin(y));

        z = z * Math.tan(x * y);

        System.out.println("Значение заданного выражения = " + z);

    }
}
