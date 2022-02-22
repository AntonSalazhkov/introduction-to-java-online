package by.training.java.module_2.algorithmization;

public class Task1_06 {

	public static void main(String[] args) {
		// 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел,
		// порядковые номера которых являются простыми числами.

		int N = 7;
		int array[] = new int[N];
		int sum = 0;

		System.out.print("Заданный массив: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (-50 + Math.random() * 100);
			System.out.print(array[i] + " | ");

			if (array[i] > 0 && array[i] % 2 != 0 && array[i] % 3 != 0 && array[i] % 5 != 0 && array[i] % 7 != 0
					|| array[i] == 2 || array[i] == 3 || array[i] == 5 || array[i] == 7) {
				sum += array[i];
			}

		}
		System.out.println("");
		System.out.println("Сумма простых чисел = " + sum);
	}
}
