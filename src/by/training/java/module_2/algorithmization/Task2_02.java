package by.training.java.module_2.algorithmization;

public class Task2_02 {

	public static void main(String[] args) {
		// 2. Дана квадрратная матрица. Вывести на экран элементы, стоящие по диагонали.

		int array[][] = new int[][] { 
			{ 24, 33, 11, 34 }, 
			{ 34, 22, 45, 78 }, 
			{ 11, 23, 47, 99 }, 
			{ 21, 33, 55, 65 } };
			
		int i;

		System.out.println("Заданая матрица: ");
		for (i = 0; i < array.length; i++) {
			for (int k = 0; k < array[i].length; k++) {
				System.out.print(array[i][k] + " | ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Полученная матрица: ");
		int k = 0;
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i][k]);
			k += 1;
		}

		k -= 1;
		System.out.println("");
		for (i = 0; i < array.length; i++) {
			System.out.println(array[i][k]);
			k -= 1;
		}
		System.out.println("");
	}
}
