package by.training.java.module_3.string;

import java.util.Scanner;

public class Task2_08 {

    public static void main(String[] args) {
        // 8. Вводится строка слов, разделенная пробелами.
        // Найти самое длинное слово и вывести его на экран.
        // Случай, когда самых длинных слов может быть несколько, не обрабатывать.

        Scanner sc = new Scanner(System.in);          // По условиию строка вводится
        String sb = " ";          // Строка проверки на символы, любое значение для первоночального входа в цикл
        String st = " ";

        while (sb.length() != 0) {   // По условию вводится строка слов, делаем цикл пока в строке не будет цифр или символов

            System.out.print("Enter the string >> ");
            st = "" + sc.nextLine();
            sb = st.replaceAll("[a-zA-Z & а-яА-Я & \\s]", "");
        }
        line(st);
    }

    public static void line(String st) {
        String[] s = st.split(" ");
        int maxWord = 0;    // индекс самого длинного слова
        int repeat = 2;    // переменная кол-ва повторов, 2, т.к. при прохождении цикла maxWord встретит хоть раз само себя
        int max = 0;

        for (int i = 0; i < s.length; i++) {
            for (int k = 0; k < s.length; k++) {
                if (s[i].length() <= s[k].length() && s[k].length() > max) {
                    maxWord = k;
                    max = s[k].length();
                }
            }
        }
        for (int i = 0; i < s.length; i++) {
            if (s[i].length() == s[maxWord].length()) { // проверяем кол-во слов с макс длинной, если только само слово, то repeat = 1
                repeat -= 1;
            }
        }
        if (repeat > 0) {      // если больше одного повтора, т.е. repeat = 2 - 1 - 1 ... то не обрабатываем по условию
            System.out.println("Самое длинное слово: " + s[maxWord]);
        }
    }
}
