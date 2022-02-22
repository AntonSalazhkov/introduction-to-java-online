package by.training.java.module_2.algorithmization;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Task2_11 {

	public static void main(String[] args) {

		// 11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран
		// саму матрицу и номера строк, в которых число 5 встречается три и более раз.

		int[][] matrix = new int[10][20];

		fillMatrix(matrix);
		printMatrix(matrix);
		detectRow(matrix);
	}

	private static void fillMatrix(int[][] matrix) {
		for (int[] array : matrix) {
			Arrays.setAll(array, i -> new Random().nextInt(16));
		}
	}

	private static void detectRow(int[][] matrix) {
		int count = 0;
		for (int[] array : matrix) {
			count++;
			if (IntStream.range(0, array.length).filter(i -> array[i] == 5).count() >= 3) {
				{
					System.out.println("Строка " + count); // отсчет не с 0(count-1), а с 1
				}
			}
		}
	}

	private static void printMatrix(int[][] matrix) {

		for (int[] array : matrix) {
			System.out.println(Arrays.toString(array));
		}
	}
}