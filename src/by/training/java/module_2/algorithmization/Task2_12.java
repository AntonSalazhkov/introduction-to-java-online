package by.training.java.module_2.algorithmization;

import java.util.Arrays;
import java.util.Comparator;

public class Task2_12 {

	public static void main(String[] args) {

		// 12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов

		Integer[][] matrix = new Integer[][] { { 33, 223, 56 }, { 333, 22, 56 }, { 33, 22, 56 } };

		System.out.println("По возрастанию:");
		for (Integer[] i : matrix) {
			Arrays.sort(i);
			System.out.println(Arrays.toString(i));
		}

		System.out.println("По убыванию:");
		for (Integer[] j : matrix) {
			Arrays.sort(j, Comparator.reverseOrder());
		}

		for (Integer[] integers : matrix)
			System.out.println(Arrays.toString(integers));
	}
}