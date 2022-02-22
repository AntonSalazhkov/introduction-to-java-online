package by.training.java.module_2.algorithmization;

public class Task2_01 {

	public static void main(String[] args) {
		// Массивы массивов.

		// 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый
		// элемент больше последнего.

		int array[][] = new int[][] { 
			{ 32, 54, 77, 14 }, 
			{ 34, 54, 13, 11 }, 
			{ 23, 55, 22, 20 } };

		System.out.println("Заданая матрица: ");
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 4; k++) {
				System.out.print(array[i][k] + " | ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Полученная матрица: ");
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < 4; k++) {
				if (k % 2 == 0 && (array[0][k] > array[2][k])) {
					System.out.print(array[i][k] + " | ");
				}
			}
			System.out.println("");
		}
	}
}
