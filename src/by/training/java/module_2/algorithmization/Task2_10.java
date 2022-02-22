package by.training.java.module_2.algorithmization;

public class Task2_10 {

	public static void main(String[] args) {
		// 10. Найти положительные элементы главной диагонали квадратной матрицы.

		int[][] matrix = { { 1, -2, 3, 4 }, { 1, 2, -3, 4 }, { 1, 2, -3, 4 }, { 1, 2, 3, 4 } };
		
		System.out.println("Заданая матрица: ");
		for (int i = 0; i < matrix.length; i++) {
			for (int a = 0; a < matrix[i].length; a++) {
				System.out.print(matrix[i][a] + " | ");
			}
			System.out.println("");
		}
		System.out.println("Положительные элементы главной диагонали:");
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][i] > 0)
				System.out.println(matrix[i][i]);
		}
	}
}