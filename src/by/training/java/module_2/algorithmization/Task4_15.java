package by.training.java.module_2.algorithmization;

import java.util.Arrays;

public class Task4_15 {

	public static void main(String[] args) {
		// 15. Найти все натуральные n-значные числа, цифры в которых образуют строго
		// возрастающую последовательность (например 1234, 5789).

		int n = 7;

		if (n >= 2 && n < 10) {                    // не может быть десяти или одно значных цифр
			System.out.println("Полученные " + n + " значные числа: ");
			System.out.println(Arrays.toString(number(n)));
		} else {
			System.out.println("Некорректное число n");
		}

	}

	public static int[] number(int n) {
		int p = 0;
		int[] array = new int[8];
		for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
			if (i == vozrastNumber(i, n)) {             // Определяем является ли число c возрастающими цифрами
				array[p] = i;                       // Заносим число в начальный массив
				p += 1;
			}
		}
		int[] array2 = new int[p];          // Создаем новый массив равный количеству полученных чисел c возрастающими цифрами
		for (int i = 0; i < p; i++) {
			array2[i] = array[i];           // Заносим числа в новый массив
		}
		return array2;

	}

	public static int vozrastNumber(int i, int kolNumber) {
		int a;
		int[] array = new int[kolNumber];       // В массив определяем и заносим цифры проверяемого числа
		for (int k = 0; k < kolNumber;) {
			a = i;
			a = (int) (a / (Math.pow(10, k)));
			array[k] = a % 10;
			k++;
		}
		int kol = 1;                                 // 1 т.к. проверяемые числа начинаются с двузначных
		for (int k = 0; k < kolNumber - 1; k++) {    // проверяем являются ли цифры возрастающими по порядку (в массив цифры занесены задом наперед)
			if (array[k] == array[k + 1] + 1) {
				kol += 1;                            // Вычисляем сколько в числе возрастающих чисел
			}
		}
		if (kol == kolNumber) {                      // Если количество возрастающих чисел равно количеству чисел
			return i;
		} else {
			return 0;
		}
	}
}
