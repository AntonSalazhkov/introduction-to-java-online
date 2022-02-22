package by.training.java.module_2.algorithmization;

public class Task2_06 {

	public static void main(String[] args) {
		// 6. Сформировать матрицу порядка n по заданному образцу (n-четное).

		int n = 10;
		int array[][] = new int[n][n];
		int i;                // Переменная цикла (столбцов)
		int k;                // Переменная цикла (строк)
		int a = n / 2;        // Переменная подсчета середины строк
		int b = n - 1;        // Переменная для подсчета столбцов

		System.out.println("Полученная матрица: ");

		for (i = 0; i < array.length; i++) {
			for (k = 0; k < array[i].length; k++) {
				array[i][k] = 1;               // По умолчанию каждой позиции массива присваивает 1

				if (i != 0 && i != n - 1) {    // Кроме 1 и последней строки
					if (i < a && k < i || i < a && k > b) {  // слева || справа (до середины строк)
						array[i][k] = 0;
					} else if (i >= a && k > i || i >= a && k < b) { // справа || слева (после середины строк)
						array[i][k] = 0;
					}
				}
				System.out.print(array[i][k] + " | ");
			}
			b -= 1;                     // Переводит k слева направо
			System.out.println("");
		}
	}
}