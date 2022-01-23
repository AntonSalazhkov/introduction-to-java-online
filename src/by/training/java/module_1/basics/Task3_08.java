package by.training.java.module_1.basics;

public class Task3_08 {

    public static void main(String[] args) {
        // 8. Даны два числа. Определить цифры, входящие в запись как первого так и
        // второго числа.

        int x = 4263;
        int y = 230;
        int x1;
        int y1;
        int y2;

        System.out.println("Заданное число x = " + x);
        System.out.println("Заданное число y = " + y);

        if (x < 0) { // Делает положительным
            x *= -1;
        }
        if (y < 0) { // Делает положительным
            y *= -1;
        }

        System.out.print("Совподающие цифры в числах: ");

        for (; x > 0; x /= 10) {
            x1 = x % 10;
            y1 = y; // возвращает исходное значение в y1
            for (; y1 > 0; y1 /= 10) { // Цикл в цикле, сравнивает каждую цифру первого числа с каждой цифрой второго
                y2 = y1 % 10;
                if (x1 == y2) {
                    System.out.print(x1 + ", ");
                }
            }
        }
    }
}
