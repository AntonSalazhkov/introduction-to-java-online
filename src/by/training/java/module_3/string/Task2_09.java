package by.training.java.module_3.string;

import java.util.Scanner;

public class Task2_09 {

    public static void main(String[] args) {
        // 9. Подсчитать количество строчных (маленьких) и прописных (больших)
        // букв в введенной строке. Учитывать только английские буквы.

        Scanner sc = new Scanner(System.in);          // По условиию строка вводится
        String sb = " ";          // Строка проверки на символы, любое значение для первоночального входа в цикл
        String st = " ";

        while (sb.length() != 0) {   // По условию вводится строка слов, делаем цикл пока в строке не будет цифр или символов

            System.out.print("Enter the string >> ");
            st = "" + sc.nextLine();
            sb = st.replaceAll("[a-zA-Z & \\s]", "");   // учитываются только английские буквы и пробелы
        }
        line(st);
    }

    public static void line(String st) {

        int number = st.replaceAll("[A-Z & \\s]", "").length();

        System.out.println("Количество строчных букв в строке: " + number);

        number = st.replaceAll("[a-z & \\s]", "").length();

        System.out.println("Количество прописных букв в строке: " + number);
    }
}
