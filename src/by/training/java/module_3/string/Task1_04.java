package by.training.java.module_3.string;

import java.util.Arrays;

public class Task1_04 {

    public static void main(String[] args) {
        // 4. В строке найти количество чисел.

        // Считает десятичные числа тоже

        String st = ".00.2gbfb?!+,00456.001nn.nn32vi_,  00.";
        System.out.println("Заданная строка: " + st);

        st = st.replaceAll("[^0-9.]+", " ");     // . - для десятичных чисел

        char[] ch = st.toCharArray();
        if (ch[0] == '.' || ch[0] == '0' && ch[1] == '0') {    // Если точка или двойной ноль вначале
            ch[0] = ' ';
        }
        if (ch[ch.length - 1] == '.') {                        // Если точка вконце
            ch[ch.length - 1] = ' ';
        }
        for (int i = 1; i < ch.length - 1; i++) {             // Удаляем лишние точки или нули
            if (ch[i] == '.' && ch[i + 1] == ' ' || ch[i] == '.' && ch[i - 1] == ' ' || ch[i] == '.' && ch[i + 1] == '.') {
                ch[i] = ' ';
            }
            if (ch[i] == '0' && ch[i - 1] == ' ' && ch[i + 1] != ' ' && ch[i + 1] != '.') {   // Удаление лишних нулей пере числом
                ch[i] = ' ';
            }
        }
        String str = String.valueOf(ch);
        str = str.replaceAll("\\s+", " ");     // Все двойные пробелы заменяет одинарными
        str = str.strip();                                       // Удаляем лишние пробелы вначале или в конце (если там были точки)

        String[] stArray = str.split(" ");
        int amountOfNumbers = stArray.length;

        System.out.println("Полученная строка с числами: " + Arrays.toString(stArray));
        System.out.println("Количество чисел в строке: " + amountOfNumbers);
    }
}
