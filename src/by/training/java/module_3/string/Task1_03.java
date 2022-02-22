package by.training.java.module_3.string;

public class Task1_03 {

    public static void main(String[] args) {
        // 3. В строке найти количество цифр.

        String st = "2gbfb?+, 45632vi_, 0";
        System.out.println("Заданная строка: " + st);

        String[] stArray = st.split("\\D+");
        st = String.join("", stArray);
        int numberOfDigits = st.length();

        System.out.println("Количество цифр в строке: " + numberOfDigits);

    }
}
