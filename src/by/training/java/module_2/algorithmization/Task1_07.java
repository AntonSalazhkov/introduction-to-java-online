package by.training.java.module_2.algorithmization;

public class Task1_07 {

	public static void main(String[] args) {
		// 7. Даны действительные числа a1,...an.
		// Найти max (a1 + a2n, a2 + a2n-1, ... an + an+1).

		int array[] = new int[] { 1, 5, 6, 23, -6, -23, 13, 11 };
		int max1 = 0; // a1 + an, a2 + an-1 ... max двух элементов массива
		int max = 0; // Общий max из массива

		System.out.print("Заданный массив: ");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " | ");

			int a = array.length - 1 - i;
			max1 = array[i] + array[a];

			if (max1 > max && i != a) { // i != a чтобы не суммировало дважды один элемент
				max = max1;
			}
		}
		System.out.println("");
		System.out.print("max = " + max);
	}
}
