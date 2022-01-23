package by.training.java.module_1.basics;

public class Task2_03 {

    public static void main(String[] args) {
        // 3. Даны три точки А(x1,y1), B(x2,y2) и C(x3, y3). Определить, будут ли они
        // расположены на одной прямой.

        double x1, y1, x2, y2, x3, y3;

        x1 = 2;
        y1 = 8;
        x2 = -3;
        y2 = 8;
        x3 = 1;
        y3 = 8;

        if ((y3 - y1) / (y2 - y1) == (x3 - x1) / (x2 - x1) || y1 == y2 && y2 == y3 || x1 == x2 && x2 == x3) {

            System.out.println("Точки с координатами: A(" + x1 + "," + y1 + "), B(" + x2 + "," + y2 + "), C(" + x3 + "," + y3 + ") - лежат на одной прямой");

        } else {

            System.out.println("Точки с координатами: A(" + x1 + "," + y1 + "), B(" + x2 + "," + y2 + "), C(" + x3 + "," + y3 + ") - не лежат на одной прямой");

        }
    }
}
