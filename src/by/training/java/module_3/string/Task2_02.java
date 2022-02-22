package by.training.java.module_3.string;

public class Task2_02 {

    public static void main(String[] args) {
        // 2. В строке вставить после каждого символа 'a' символ 'b'.

        String st = "123a, aagr 56a7";

        System.out.println("Заданная строка:" + st);
        insertSymbol(st);
    }

    public static void insertSymbol(String st) {

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'a') {
                sb.append(st.charAt(i));
                sb.append("b");
            } else {
                sb.append(st.charAt(i));
            }
        }
        System.out.println("Полученная строка:" + sb);
    }
}
