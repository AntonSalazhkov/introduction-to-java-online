package by.training.java.module_3.string;

public class Task2_05 {

    public static void main(String[] args) {
        // 5. Подсчитать, сколько раз среди символов заданной
        // строки встречается буква "а".

        String st = "sdwea, aa12,,edt   a";

        System.out.println("Заданная строка: " + st);

        int number = st.length() - st.replace("a" , "").length();

        System.out.println("Количество раз повторения символа 'а': " + number);
    }
}
