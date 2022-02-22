package by.training.java.module_3.string;

public class Task2_03 {

    public static void main(String[] args) {
        // 3. Проверить является ли заданное слово палиндромом.

        String st = "level";
        StringBuilder sb = new StringBuilder();

        System.out.println("Заданное слово: " + st);

        for (int i = st.length() - 1; i >= 0; i--) {
            sb.append(st.charAt(i));
        }

        String s = "" + sb;      // Приводим StringBuilder к String
        s = s.intern();          // Заносим значение строки в пул литералов

        System.out.print("Является ли заданное слово палиндромом: ");
        System.out.println(st == s);
    }
}
