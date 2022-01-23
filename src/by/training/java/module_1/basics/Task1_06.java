package by.training.java.module_1.basics;

public class Task1_06 {

    public static void main(String[] args) {
        // 6. Для данной области составить линейную программу, которая печатает true,
        // если точка с координатами (x, y) принадлежит закрашенной области,
        // и false - в противном случае

        int x, y;

        x = 2;
        y = -2;

        System.out.println("Заданная точка: (" + x + ", " + y + ")");

        if (x <= 4 && x >= -4 && y >= -3 && y <= 0) {

            System.out.println("true");

        } else if (x <= 2 && x >= -2 && y >= 0 && y <= 4) {

            System.out.println("true");

        } else {

            System.out.println("false");

        }
    }
}
