package by.training.java.module_2.algorithmization;

public class Task2_04 {

	public static void main(String[] args) {
		// 4. Сформировать матрицу порядка n по заданному образцу (n-четное).

		int n = 10;
		int array[][] = new int[n][n];
		int i;
		int k;

		System.out.println("Полученная матрица: ");
		for (i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				for (k = 0; k < array[i].length; k++) {
					array[i][k] = k + 1;
					System.out.print(array[i][k] + " | ");
				}
			} else if (i % 2 != 0) {
				for (k = 0; k < array[i].length; k++) {
					array[i][k] = n - k;
					System.out.print(array[i][k] + " | ");
				}
			}
			System.out.println("");
		}
	}
}
