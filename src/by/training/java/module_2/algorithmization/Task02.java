package by.training.java.module_2.algorithmization;

public class Task02 {

	public static void main(String[] args) {
		// 2. Дана последовательность действительных чисел a1, a2, ... , an.Заменить все ее
		// члены, большие заданного Z, этим числом. Подсчитать количество замен.

		int Z = 8;
		int array[] = { 2, 5, 9, 4, 10 };
		int k = 0;
		
		System.out.print("Новый массив с учетом замен: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > Z) {
				array[i] = Z;
				k += 1;
			}
			System.out.print(array[i] + " ");
		}
		System.out.println("");
		System.out.println("Количество замен: " + k);
	}

}
