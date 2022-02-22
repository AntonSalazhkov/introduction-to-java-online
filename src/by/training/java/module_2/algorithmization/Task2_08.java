package by.training.java.module_2.algorithmization;

import java.util.Scanner;

public class Task2_08 {

	public static void main(String[] args) {

		// 8. В числовой матрице поменять местами два столбца любых столбцов, т. е. все
		// элементы одного столбца поставить на соответствующие им позиции другого, а
		// его элементы второго переместить в первый. Номера столбцов вводит
		// пользователь с клавиатуры.

		int firstColumn = input("первого");
		int secondColumn = input("второго");

		int[][] matrix = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 },
				{ 1, 2, 3, 4, 5 } };

		if (firstColumn >= matrix[0].length || secondColumn >= matrix[0].length || firstColumn < 0
				|| secondColumn < 0) {
			System.out.println("Замена невозможна");

		} else {
			for (int j = 0; j < matrix.length; j++) {
				for (int i = 0; i < matrix.length; i++) {
					matrix[i][firstColumn - 1] = matrix[i][secondColumn - 1];
					matrix[i][secondColumn - 1] = matrix[i][firstColumn - 1];
				}
			}
			for (int i = 0; i < matrix.length; i++, System.out.println()) {
				for (int j = 0; j < matrix.length; j++) {
					System.out.print(matrix[i][j] + " ");
				}
			}
		}
	}

	private static int input(String column) {
		System.out.print("Введите номер " + column + " столбца: ");
		return new Scanner(System.in).nextInt();
	}
}