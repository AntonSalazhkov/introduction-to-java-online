package by.training.java.module_2.algorithmization;

public class Task2_03 {

	public static void main(String[] args) {
		// 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

		int array[][] = new int[][] { 
			{ 24, 33, 11, 34 }, 
			{ 34, 22, 45, 78 }, 
			{ 11, 23, 47, 99 }, 
			{ 21, 33, 55, 65 } };
			
		int i;
		int k = 2;
		int p = 1;
		int a;

		System.out.println("Заданая матрица: ");
		for (i = 0; i < array.length; i++) {
			for (a = 0; a < array[i].length; a++) {
				System.out.print(array[i][a] + " | ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Строка под номером " + k + ": ");
		i = k;
		for (a = 0; a < array[i].length; a++) {
			System.out.print(array[i][a] + " | ");
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Столбец под номером " + p + ": ");

		for (i = 0; i < array.length; i++) {
			a = p;
			System.out.println(array[i][a]);
		}
	}
}
