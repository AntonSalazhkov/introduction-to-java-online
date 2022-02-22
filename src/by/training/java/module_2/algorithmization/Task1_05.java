package by.training.java.module_2.algorithmization;

public class Task1_05 {

	public static void main(String[] args) {
		// 5. Даны целые числа a1, ..., an. Вывести на печать только те числа, для
		// которых ai > i.

		int i = 5;
		int array[] = new int[] { 1, 5, 7, 26, -5 };

		System.out.print("Заданный массив:   ");

		for (int k = 0; k < array.length; k++) {
			System.out.print(array[k] + " | ");
		}
		System.out.println("");
		System.out.print("Полученный массив: ");

		for (int k = 0; k < array.length; k++) {
			if (array[k] > i) {
				System.out.print(array[k] + " | ");
			}
		}
	}
}
