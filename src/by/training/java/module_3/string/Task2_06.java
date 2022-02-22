package by.training.java.module_3.string;

public class Task2_06 {

    public static void main(String[] args) {
        // 6. Из заданной строки получить новую, повторив каждый символ дважды.

        String st = "asdfg12!";

        System.out.println("Заданная строка: " + st);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < st.length(); i++) {
            sb.append(st.charAt(i));
            sb.append(st.charAt(i));
        }
        System.out.println("Полученная строка: " + sb);
    }
}
