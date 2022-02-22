package by.training.java.module_3.string;

import java.util.Arrays;

public class Task2_10 {

    public static void main(String[] args) {
        // 10. Строка Х состоит из нескольких предложений, каждое из которых
        // кончается точкой, восклицательным или вопросительным знаком.
        // Определить количество предложений в строке Х.

        String X = "What's Tom drinking? Tom drinks tea.";
        int number = 0;

        System.out.println("Заданная строка: " + X);

        for (int i = 0; i < X.length(); i++) {
            if (X.charAt(i) == '?' || X.charAt(i) == '!' || X.charAt(i) == '.') {
                number += 1;
            }
        }
        System.out.println("Количество предложений в строке: " + number);
    }
}
