package by.training.java.module_1.basics;

public class Task3_06 {

    public static void main(String[] args) {
        // 6. Вывести на экран соответствий между символами и их численными обозначениями в
        // памяти компьютера.

        int i;

        char ch;

        for (i = 33; i <= 126; i++) {

            ch = (char) i;

            System.out.println("Число соответствует символу " + i + " = " + ch);
        }
    }
}
