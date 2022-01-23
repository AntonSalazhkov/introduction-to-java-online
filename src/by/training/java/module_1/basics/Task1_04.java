package by.training.java.module_1.basics;

public class Task1_04 {

    public static void main(String[] args) {
        // 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и
        // целой частях).
        // Поменяйте местами дробную и целую части числа и вывести полученное значение
        // числа.

        double R;

        int x, y;

        R = 432.761;

        System.out.println("Исходное число: " + R);

        x = (int) (R * 1000 % 1000);

        y = (int) R;

        System.out.println("Полученно число: " + x + "." + y);

    }
}
