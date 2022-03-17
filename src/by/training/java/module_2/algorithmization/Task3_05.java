package by.training.java.module_2.algorithmization;

import java.util.Arrays;

public class Task3_05 {

	public static void main(String[] args) {
		// 5. Дана последовательность чисел a1,..., an. Требуется переставить числа в
		// порядке возрастания. Делается это следующим образом. Пусть а1,...ai -
		// упорядоченная последовательность, т.е. a1 < an. Берется следующее щисло ai+1
		// и вставляется в последовательность так, чтобы новая последовательность была
		// тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1
		// до n не будут перебраны. Место помещения очередного элемента в
		// отсартированную часть производить с помощью двоичного поиска. Двоичный поиск
		// оформлять в виде отдельной функции.

		// Сортировка вставками

		int[] array = new int[] { 91, 87, 76, 53, 11, 8, 6, 5, 1 };

		int a; // Переменная для временного запоминания текущего значения

		System.out.println("Заданный первый массив: " + Arrays.toString(array));

		for (int i = 1; i < array.length; i++) {  // Начинаем сравнивание со следующего числа
			a = array[i];    // Запоминаем текущее значение проверяемого числа
			int j = i - 1;   // По умолчанию берем предыдущее число
			while (j >= 0 && a < array[j]) {  // Пока предыдущее значение (j) больше текущего (a)
				array[j + 1] = array[j]; // Присваиваем следующему (в цикле while) числу текущее
				j--; // Продолжение сравнения с предыдущими числами пока не найдется число, которое не нужно двигать
			}
			array[j + 1] = a; //Присваивание следующему числу после того которое не нужно двагать, текущее значение i
		}
		System.out.println("Полученный массив: " + Arrays.toString(array));
	}
}