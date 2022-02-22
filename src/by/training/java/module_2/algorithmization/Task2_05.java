package by.training.java.module_2.algorithmization;

public class Task2_05 {

	public static void main(String[] args) {
		// 5. Сформировать матрицу порядка n по заданному образцу (n-четное).

		int n = 10;
		int array[][] = new int[n][n];
		int i;
		int k;

		System.out.println("Полученная матрица: ");

		for (i = 0; i < array.length; i++) {
			for (k = 0; k < array[i].length; k++) {
				if (k < n) {
					array[i][k] = 1 + i;
				} else {
					array[i][k] = 0;
				}
				System.out.print(array[i][k] + " | ");
			}
			n -= 1;
			System.out.println("");
		}
	}
}