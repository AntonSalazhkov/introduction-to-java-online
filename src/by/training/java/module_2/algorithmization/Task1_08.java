package by.training.java.module_2.algorithmization;

public class Task1_08 {

	public static void main(String[] args) {
		// 8. Дана последовательность целых чисел а1...an. Образовать новую
		// последовательность, выбросив из исходной те члены, которые равны
		// min(a1...an).

		int array[] = new int[] { 1, 0, -4, 5, -4, 11 };
		int min = array[0];

		System.out.print("Заданный массив:   ");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " | ");

			if (array[i] < array[0]) { // Нахождение min массива
				min = array[i];
			}
		}
		System.out.println("");
		System.out.print("Полученный массив: ");
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == min) {
				i += 1; // Перескакивает min тем самым не выводя его
			}
			System.out.print(array[i] + " | ");
		}
	}
}
