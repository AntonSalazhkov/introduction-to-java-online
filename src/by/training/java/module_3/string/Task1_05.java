package by.training.java.module_3.string;

public class Task1_05 {

    public static void main(String[] args) {
        // 5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов
        // заменить на одиночные пробелы. Крайние пробелы в строке удалить.

        String st = "   Task  Task   Task ";
        System.out.println("Заданная строка: " + st);

        st = st.replaceAll("\\s+", " ");

        System.out.println("Полученная строка:" + st.strip());
    }
}
