package by.training.java.module_2.algorithmization;

import java.util.Arrays;

public class Task4_08 {

	public static void main(String[] args) {
		// 8. Задан массив D. Определить следующие суммы: D[1]+D[2]+D[3];
		// D[3]+D[4]+D[5]; D[4]+D[5]+D[6]. Составить метод для вычисления суммы трех
		// последовательно расположенных элементов массива с номерами от k до m.

		int[] D = new int[] { 22, 34, 1, 35, 76, 23, 7 };
		int k = 1;       // Первый номер в массиве для начала вычисления 3-х последовательных элементов
		int k1 = 3;      // Для элементов 3 - 5
		int k2 = 4;      // Для элементов 4 - 6

		System.out.println("Заданный массив: " + Arrays.toString(D));

		System.out.println("Сумма элементов массива с " + k + " по " + (k + 2) + " = " + array(D, k));
		System.out.println("Сумма элементов массива с " + k1 + " по " + (k1 + 2) + " = " + array(D, k1));
		System.out.println("Сумма элементов массива с " + k2 + " по " + (k2 + 2) + " = " + array(D, k2));
	}

	public static int array(int[] D, int k) {
		int sum = 0;
		
		if (k <= D.length - 3) {
			for (int i = k; i < k + 3; i++) {
				sum += D[i];
			}
		} else {
			System.out.println("Некорректное к");
		}
		return sum;
	}
}
