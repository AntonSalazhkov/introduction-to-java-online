package by.training.java.module_4.programming_with_classes.task07;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 7. Описать класс, представляющий треугольник.
        // Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.

        Coordinate coordinate = new Coordinate();
        Coordinate coordinate2 = new Coordinate();
        Coordinate coordinate3 = new Coordinate();

        System.out.print("Введите координату x1 >> ");
        coordinate.setX(setCoordinates());

        System.out.print("Введите координату y1 >> ");
        coordinate.setY(setCoordinates());

        System.out.print("Введите координату x2 >> ");
        coordinate2.setX(setCoordinates());

        System.out.print("Введите координату y2 >> ");
        coordinate2.setY(setCoordinates());

        System.out.print("Введите координату x3 >> ");
        coordinate3.setX(setCoordinates());

        System.out.print("Введите координату y3 >> ");
        coordinate3.setY(setCoordinates());

        Triangle triangle = new Triangle(coordinate, coordinate2, coordinate3);

        System.out.println("Периметр равен: " + triangle.getPerimeter());

        System.out.println("Площадь равна: " + triangle.getArea());

        System.out.println("Точка пересечения медиан: " + triangle.getMedianCrossPoint(coordinate, coordinate2, coordinate3));
    }

    public static double setCoordinates() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.print("Повторите ввод >> ");
        }
        return sc.nextDouble();
    }
}

