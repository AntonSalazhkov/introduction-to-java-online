package by.training.java.module_1.basics;

public class Task1_05 {

    public static void main(String[] args) {
        // 5. Дано натуральное число T, которое представляет длительность прошедшего
        // времени в секундах.
        // Вывести значение длительности в часах, минутах и секундах в следующем
        // формате:
        // ННч ММмин SSс

        int T;

        T = 4567;

        System.out.println("Заданное время: " + T + "с");

        String b = String.format("%02dч %02dмин %02dс", T / 3600, (T / 60) % 60, T % 60);

        System.out.println("Полученное время: " + b);

    }
}
