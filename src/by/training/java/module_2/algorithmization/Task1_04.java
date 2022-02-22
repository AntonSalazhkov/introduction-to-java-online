package by.training.java.module_2.algorithmization;

public class Task1_04 {

	public static void main(String[] args) {
		// 4. Даны действительные числа a1, a2, ... an. Поменять местами наибольший и
		// наименьший элементы.

		int array[] = { 1, 28, -7, 21, 1, 0 };
		int max = array[0];
		int min = array[0];
		
		System.out.print("Заданный массив:   ");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " | ");
			if (array[i] < min) {
				min = array[i];
			}

			if (array[i] > max) {
				max = array[i];
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == min) {
				array[i] = max;
				i += 1;
			}
			if (array[i] == max) {
				array[i] = min;
			}
		}
		System.out.println("");
		System.out.print("Полученный массив: ");
		
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " | ");
	}
}
