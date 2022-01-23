package by.training.java.module_1.basics;

public class Task2_04 {

    public static void main(String[] args) {
        // 4. Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича.
        // Определить, пройдет ли кирпич через отверстие.

        double A, B, x, y, z;

        A = 10;
        B = 5;
        x = 12;
        y = 5;
        z = 6;

        if (A >= x && B >= y || A >= x && B >= z || A >= y && B >= x || A >= y && B >= z || A >= z && B >= x || A >= z && B >= y) {

            System.out.println("Кирпич с размерами: " + x + "x" + y + "x" + z + " пройдет в отверстие с размерами: " + A + "x" + B);

        } else {

            System.out.println("Кирпич с размерами: " + x + "x" + y + "x" + z + " не пройдет в отверстие с размерами: " + A + "x" + B);

        }
    }
}
