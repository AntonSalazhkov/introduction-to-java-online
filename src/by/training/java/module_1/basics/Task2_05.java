package by.training.java.module_1.basics;

public class Task2_05 {

    public static void main(String[] args) {
        // 5. Вычислить значение функции

        double x, y;

        x = 4;

        if (x <= 3) {
            y = Math.pow(x, 2) - 3 * x + 9;

        } else {

            y = 1 / (Math.pow(x, 3) + 6);

        }
        System.out.println(y);
    }
}