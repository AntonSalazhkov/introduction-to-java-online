package by.training.java.module_2.algorithmization;

public class Task4_05 {

	public static void main(String[] args) {
		// 5. Составить программу, которая в массиве A[N] находит второе по величине
		// число (вывести на печать число, которое меньше максимального элемента
		// массива, но больше всех других элементов).

		int N = 7;
		int[] array = ramdomNumbers(N);

		System.out.println("Заданный массив: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " | ");
		}

		System.out.println("");
		System.out.println("Второе по величене число в массиве: " + number(array));
	}

	public static int[] ramdomNumbers(int N) {
		int[] array = new int[N];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 100);
		}
		return array;
	}

	public static int number(int array[]) {
		int max = 0;                   // Максимальное число в масиве
		int predMax = 0;               // Предшествующее максимальному (второе по величине)
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] > predMax && array[i] < max) {
				predMax = array[i];
			}
		}
		return predMax;
	}
}
