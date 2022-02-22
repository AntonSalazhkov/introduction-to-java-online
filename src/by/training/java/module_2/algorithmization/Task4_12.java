package by.training.java.module_2.algorithmization;

import java.util.Arrays;

public class Task4_12 {

	public static void main(String[] args) {
		// 12. Даны натуральные числа K и N. Написать метод формирования массива А,
		// элементами которого являются числа, сумма цифр которых равна K и которые не
		// больше N.

		int K = 60;
		int N = 30;

		int[] array = array(K, N);

		System.out.println("Заданные числа: K = " + K + " N = " + N);
		System.out.println("Полученный массив: " + Arrays.toString(array));

	}

	public static int[] array(int K, int N) {
		int[] array = new int[10];
		int a = 0;                       // Сумма всех чисел массива
		if (K <= N * array.length) {     // Проверка возможности построения массива с задаными K и N
			while (a != K) {
				a = 0;
				for (int i = 0; i < array.length; i++) {
					array[i] = N + 1;
					while (array[i] > N) {
						array[i] = (int) (Math.random() * 100);
					}
					a += array[i];
				}
			}
			return array;
		} else {
			System.out.println("Некорректные заданные числа");
			return array;
		}
	}
}
