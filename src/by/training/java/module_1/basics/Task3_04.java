package by.training.java.module_1.basics;

public class Task3_04 {

    public static void main(String[] args) {
        // 4. Составить программу нахождения произведения квадратов первых двухсот чисел

        long y, i, z;

        z = 1;

        for (i = 1; i <= 200; ) {

            y = i * i;

            System.out.println("Квадрат числа " + i + " = " + y);

            i++;

            z = z * y;

        }

        if (z == 0) {

            System.out.println("Произведения квадратов первых " + (i - 1) + " чисел больше заданного предела");
        } else {

            System.out.println("Произведения квадратов первых " + (i - 1) + " чисел = " + z);

        }
    }
}
