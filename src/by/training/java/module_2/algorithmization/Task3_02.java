package by.training.java.module_2.algorithmization;

import java.util.Arrays;

public class Task3_02 {

	public static void main(String[] args) {
		// 2. Даны две последовательности a1 <= an и b1 <= bm. Образовать из них новую
		// последовательность чисел так, чтобы она тоже была неубывающей. Дополнительный
		// массив не использовать.

		// Сортировка пузьрьком

		int[] array = new int[] { 1, 5, 6, 8, 11 };
		int[] array2 = new int[] { 2, 3, 5, 12 };
		int m = array.length; // число количество символов в первом массиве
		int p = array2.length; // число количество символов во втором массиве
		int a; // Переменная для временного запоминания большего значения массива
		boolean sh = false;

		System.out.println("Заданный первый массив: " + Arrays.toString(array));
		System.out.println("Заданный второй массив: " + Arrays.toString(array2));

		array = Arrays.copyOf(array, m + p); // расширяем первый массив чтобы поместился второй

		System.arraycopy(array2, 0, array, m, p); // копируем второй массив в первый

		while (!sh) { // пока не станет true, т.е. цикл пройдет не заходя в if
			sh = true;

			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {           // сравнение текущего значения со следующим
					a = array[i];                        // временное присваивание текущего значения переменной а
					array[i] = array[i + 1];             // текущему значению присваивается следующее
					array[i + 1] = a;                    // следующее значение присваивается текущему
					sh = false;                          // возврат sh к false для повтора цикла
				}
			}
		}
		System.out.println("Полученный массив: " + Arrays.toString(array));
	}
}
