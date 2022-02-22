package by.training.java.module_2.algorithmization;

public class Task2_09 {

	public static void main(String[] args) {

		// 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом
		// столбце. Определить, какой столбец содержит максимальную сумму.

		int max = -1;
		int sum = 0;

		int[][] matrix = { { 1, 2, 5, 1 }, { 1, 2, 5, 1 }, { 1, 2, 5, 1 }, { 1, 2, 5, 1 } };

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[j][i];
			}
			if (sum > max) {
				max = sum;
			}
			System.out.print(sum + " ");
			sum = 0;
		}
		System.out.println("\n" + "Максимальная сумма " + max);
	}
}