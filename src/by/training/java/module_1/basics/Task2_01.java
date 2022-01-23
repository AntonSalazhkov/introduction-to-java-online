package by.training.java.module_1.basics;

public class Task2_01 {

    public static void main(String[] args) {
        // 1. Даны два угла треугольника (в градусах). Определить, существует ли такой
        // треугольник,
        // и если да, то будет ли он прямоугольным

        double a1, a2, a3;

        a1 = 90;
        a2 = 89;

        a3 = 180 - (a1 + a2);     // определение 3-его угла

        if (a1 + a2 + a3 == 180 && a1 > 0 && a2 > 0 && a3 > 0) {

            System.out.println("Такой треугольник существует");

        } else {

            System.out.println("Такой треугольник не существует");

        }

        if (a1 == 90 || a2 == 90 || a3 == 90) {

            System.out.println("Данный треугольник - прямоугольный");

        } else {

            System.out.println("Данный треугольник - не прямоугольный");

        }
    }
}
