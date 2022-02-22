package by.training.java.module_3.string;

public class Task2_04 {

    public static void main(String[] args) {
        // 4. С помощью функции копирования и операции конкатенации составить
        // из частей слова "информатика" слово "торт".

        String st = "информатика";
        String t = "торт";

        System.out.println("Заданное слово: " + st);
        word(st, t);
    }

    public static void word(String st, String t) {
        StringBuffer sb = new StringBuffer();
        char[] ch = new char[t.length()];

        for (int i = 0; i < t.length(); i++) {
            for (int k = 0; k < st.length(); k++) {
                if (t.charAt(i) == st.charAt(k)) {
                    st.getChars(k, k + 1, ch, i);  // Копируем нужный символ в массив чаров
                }
            }
        }
        sb.append(ch);
        System.out.println("Полученное слово: " + sb);
    }
}
