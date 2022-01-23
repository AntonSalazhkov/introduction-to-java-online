package by.training.java.module_1.basics;

public class Task3_03 {

    public static void main(String[] args) {
        // 3. Найти сумму квадратов первых ста чисел

        int y, i, z;

        z = 0;

        for (i = 0; i <= 100; ) {

            y = i * i;

            System.out.println("Квадрат числа " + i + " = " + y);

            i++;

            z = z + y;

        }

        System.out.println("Сумма квадратов первых ста чисел = " + z);
    }
}
