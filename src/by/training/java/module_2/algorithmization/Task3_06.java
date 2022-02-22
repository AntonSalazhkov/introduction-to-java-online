package by.training.java.module_2.algorithmization;

import java.util.Arrays;

public class Task3_06 {

	public static void main(String[] args) {
		// 6. Дан массив n действительных чисел. Требуется упорядочить его по
		// возрастанию. Делается это следующим образом: сравниваются два соседних
		// элемента ai и ai+1. Если ai <= ai+1, то продвигаются на один элемент вперед.
		// Если ai > ai+1, то производится перестановка и сдвигаются на один элемент
		// назад. Составить алгоритм этой сортировки.

		// Сортировка Шелла

		int[] array = new int[] { 91, 87, 76, 53, 11, 8, 6, 5, 1 };

		int a; // Переменная для временного запоминания текущего значения

		System.out.println("Заданный первый массив: " + Arrays.toString(array));

		int h = 1;                       // величина интервала сортировки согласно методу Шелла
		while (h * 3 < array.length) {        // вычисление исходного интервала сортироувки
			h = h * 3 + 1;
		}

		while (h >= 1) {
			for (int i = h; i < array.length; i++) {
				for (int j = i; j >= h; j = j - h) {
					if (array[j] < array[j - h]) {
						a = array[j];
						array[j] = array[j - h];
						array[j - h] = a;
					}
				}
			}
			h = h / 3; // уменьшаем интервал сортировки
		}
		System.out.println("Полученный массив: " + Arrays.toString(array));
	}
}
