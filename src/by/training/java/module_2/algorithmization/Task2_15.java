package by.training.java.module_2.algorithmization;

import java.util.Arrays;

public class Task2_15 {

	public static void main(String[] args) {

		// 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

		int[][] matrix = { { 1, 55, 22, 4 }, { 0, 4, 22, 66 }, { 54, 40, 390, 212 }, { 647, 45, 34, 55 } };

		swap(matrix, max(matrix));
		for (int[] a : matrix) {
			System.out.println(Arrays.toString(a));
		}
	}

	private static int max(int[][] matrix) {
		int max = 0;
		for (int[] array : matrix) {
			max = Math.max(max, Arrays.stream(array).max().getAsInt());
		}
		return max;
	}

	private static void swap(int[][] matrix, int max) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] % 2 != 0)
					matrix[i][j] = max;
			}
		}
	}
}