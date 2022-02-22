package by.training.java.module_2.algorithmization;

import java.util.Arrays;

public class Task4_10 {

	public static void main(String[] args) {
		// 10. Дано натуральное число N. Написать матод для формирования массива,
		// элементами которого являются цифры числа N.

		int N = 5;
		int[] array = array(N);

		System.out.println("Полученный массив при заданном числе " + N + ": " + Arrays.toString(array));

	}

	public static int[] array(int N) {
		int[] array = new int[10];
		int a = 1;
		int i = 0;
		while (i < array.length) {
			array[i] = a;
			if (a == N) {
				a = 0;
			}
			a += 1;
			i += 1;
		}
		return array;
	}
}
