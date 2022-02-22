package by.training.java.module_2.algorithmization;

import java.util.Arrays;

public class Task4_14 {

	public static void main(String[] args) {
		// 14. Натуральное число, в записи которого n цифр, называется числом
		// армстронга, если сумма его цифр, возведенная в степень n, равна самому
		// числу. Найти все числа Армстронга от 1 до k.

		int k = 37200;

		if (k > 0) {
			System.out.println("Полученные числа Армстронга от 1 до " + k + ": ");
			System.out.println(Arrays.toString(number(k)));
		} else {
			System.out.println("Некорректное число к");
		}
	}

	public static int[] number(int k) {
		String st;
		int kolNumber;
		int p = 0;
		int[] array = new int[k];
		for (int i = 1; i <= k; i++) {
			st = i + "";                           // Преобразуем число в строку
			kolNumber = st.length();               // Определяем количество цифр в числе
			if (i == sumNumber(i, kolNumber)) {    // Определяем является ли число числом Армстронга
				array[p] = i;                      // Заносим число Армстронга в начальный массив
				p += 1;
			}
		}
		int[] array2 = new int[p];             // Создаем новый массив равный количеству полученных чисел Армстронга
		for (int i = 0; i < p; i++) {
			array2[i] = array[i];       // Заносим числа Армстронга в новый массив
		}
		return array2;
	}

	public static int sumNumber(int i, int kolNumber) {   
		int a;
		int[] array = new int[kolNumber];    // В массив определяем и заносим цифры проверяемого числа
		for (int k = 0; k < kolNumber;) {
			a = i;
			a = (int) (a / (Math.pow(10, k)));
			array[k] = a % 10;
			k++;
		}
		int sum = 0;
		for (int k = 0; k < kolNumber; k++) {
			sum += Math.pow(array[k], kolNumber);  // Определяем сумму цифр числа возведенных в степень кол-ва цифр
		}
		return sum;
	}
}
