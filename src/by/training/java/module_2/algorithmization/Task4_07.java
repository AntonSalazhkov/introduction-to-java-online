package by.training.java.module_2.algorithmization;

public class Task4_07 {

	public static void main(String[] args) {
		// 7. Написать метод для вычисления суммы факториалов всех нечетных чисел от 1
		// до 9.

		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arrayOdd = numberOdd(array);

		System.out.println("Сумма факториалов всех нечетных чисел от 1 до 9 = " + number(arrayOdd));
	}

	public static int number(int[] arrayOdd) {
		int sum = 0;

		for (int i = 0; i < arrayOdd.length; i++) {
			int a = 1;
			int b = 1;
			while (a <= arrayOdd[i]) {    // Цикл од 1 до требуемого числа включительно
				b *= a;                   // Вычисление факториала числа
				a += 1;
			}
			sum += b;                     // Общая сумма всех факториалов
		}
		return sum;
	}

	public static int[] numberOdd(int[] array) {   // Создание массива нечетных чисел
		int n = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				n += 1;                            // Вычисление длинны массива нечетных чисел
			}
		}
		int[] arrayOdd = new int[n];
		int k = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				arrayOdd[k] = array[i];
				k += 1;
			}
		}
		return arrayOdd;
	}
}
