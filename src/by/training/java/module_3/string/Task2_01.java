package by.training.java.module_3.string;

public class Task2_01 {

    public static void main(String[] args) {
        // Работа со строками как с обьектами типа String или StringBuilder

        // 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

        String st = "234  4 56g 77   ng";
        int sum = 0;
        int space = 0;

        System.out.println("Заданная строка:" + st);

        char[] ch = st.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ') {
                space = 0;
            } else {
                space += 1;
            }
            if (space > sum) {
                sum = space;
            }
        }
        System.out.println("Наибольшее количество подряд идущих пробелов: " + sum);
    }
}
