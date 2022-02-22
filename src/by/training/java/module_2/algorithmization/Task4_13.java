package by.training.java.module_2.algorithmization;

import java.util.Arrays;

public class Task4_13 {

	public static void main(String[] args) {
		// 13. Два простых числа называют "близнецами", если они отличаются друг от
		// друга на 2 (например, 41 и 43). Найти и напечатать все пары "близнецов" из
		// отрезка [n, 2n], где n - заданное натуральное число больше 2. Для решения
		// задачи использовать декомпозицию.

		int n = 20;
		int[][] array = section(n);

		System.out.println("Полученные 'близнецы' из отрезка [" + n + ", " + 2 * n + "]:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(Arrays.toString(array[i]));
		}
	}

	public static int[][] section(int n) {
		int a = n;   // Временная переменная подсчета длинны массива
		int b = 0;   // Длинна нужного массива
		if (n > 2) { 
			while (a < 2 * n - 1) {   // Подсчет длиины массива, - 1, т.к. 2n - 1  не имеет следующего близнеца
				a += 2;
				b += 1;
			}
			int[][] array = new int[b][2];
			for (int i = 0; i < array.length; i++) {
				array[i][0] = n;
				array[i][1] = n + 2;
				n += 2;
			}
			return array;
		} else {
			System.out.println("Некорректное число n");
			int[][] array = new int[1][1];
			return array;
		}
	}
}
