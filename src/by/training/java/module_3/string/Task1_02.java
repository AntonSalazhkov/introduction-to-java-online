package by.training.java.module_3.string;

public class Task1_02 {

    public static void main(String[] args) {
        //2. Замените в строке все вхождения 'word' на 'letter'.

        String st = "word, letter, letter, word";
        System.out.println("Заданная строка: " + st);

        st = st.replaceAll("word", "letter");
        System.out.println("Полученная строка: " + st);
    }
}
