package by.training.java.module_2.algorithmization;

import java.util.Arrays;

public class Task3_04 {

	public static void main(String[] args) {
		// 4. Дана последовательность чисел a1 => an. Требуется переставить числа в
		// порядок возрастания. Для этого сравниваются два соседних числа ai и ai+1.
		// Если ai > ai+1, то делается перестановка. Так продолжается до тех пор, пока
		// все элементы не станут расположенны в порядке возрастания. Составить алгоритм
		// сортировки, подсчитать при этом количество перестановок.

		// Сортировка обменами (пузьрьком)

		int[] array = new int[] { 91, 87, 76, 53, 11, 8, 6, 5, 1 };

		int a;                   // Переменная для временного запоминания большего значения массива
		boolean sh = false;
		int kolPerestanovok = 0; // Переменная подсчета количества перестановок

		System.out.println("Заданный первый массив: " + Arrays.toString(array));

		while (!sh) {                // пока не станет true, т.е. цикл пройдет не заходя в if
			sh = true;

			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {             // сравнение текущего значения со следующим
					a = array[i];                          // временное присваивание текущего значения переменной а
					array[i] = array[i + 1];               // текущему значению присваивается следующее
					array[i + 1] = a;                      // следующее значение присваивается текущему
					sh = false;                            // возврат sh к false для повтора цикла
					kolPerestanovok += 1;
				}
			}
		}
		System.out.println("Полученный массив: " + Arrays.toString(array));
		System.out.println("Количество перестановок: " + kolPerestanovok);
	}

}
