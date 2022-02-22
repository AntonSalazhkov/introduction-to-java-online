package by.training.java.module_3.string;

import java.util.Scanner;

public class Task2_07 {

    public static void main(String[] args) {
        // 7. Вводится строка. Требуется удалить из нее повторяющиеся
        // символы и все пробелы. Например, если было введено "abc cde def",
        // то должно быть выведено "abcdef".

        Scanner sc = new Scanner(System.in);          // По условиию строка вводится

        System.out.print("Enter the string >> ");

        String st = "" + sc.nextLine();

        System.out.println("Полученная строка: " + line(st));
    }

    public static String line(String st) {

        StringBuilder sb = new StringBuilder();
        int x;

        for (int i = st.length() - 1; i >= 0; i--) {      // Проверка с конца, т. к. удалятся первые встреченные повторы, а мы в итоговой строке хотим удалить как раз следующие повторы
            x = 0;                                        // Если х не равен нулю значит проверяемый символ либо пробел либо имеет повтор
            for (int k = i - 1; k >= 0; k--) {
                if (st.charAt(i) == ' ' || st.charAt(i) == st.charAt(k)) {
                    x += 1;
                }
            }
            if (x == 0) {
                sb.append(st.charAt(i));     // Новая строка заносится задом наперед
            }
        }
        st = "" + sb.reverse();              // Переворачиваем обьект StringBuilder и заносим в возвращаемую строку
        return st;
    }
}
