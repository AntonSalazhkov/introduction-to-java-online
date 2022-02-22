package by.training.java.module_2.algorithmization;

public class Task1_01 {

	public static void main(String[] args) {
		// 1. В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые
		// кратны данному К.

		double p;
		int sum = 0;          // сумма
		int K = 15;
		int array[] = { 3, 6, 15, 30 };

		for (int i = 0; i < array.length; i++) {
			p = K / array[i];

			if ((K / p) == array[i]) {
				sum += array[i];
			}
		}
		System.out.println("Сумма чисел массива кратных " + K + " = " + sum);
	}
}
