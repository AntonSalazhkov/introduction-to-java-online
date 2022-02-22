package by.training.java.module_2.algorithmization;

import java.util.Arrays;

public class Task3_01 {

	public static void main(String[] args) {
		// Одномерные массивы. Сортировки.

		// 1. Заданы два одномерных массива с различным количеством элементов и натуральное
		// число k. Обьединить их в один массив, включив второй массив между k-м и
		// (k+1)-м элементами первого, при этом не используя дополнительный массив.

		int k = 3;
		int array[] = new int[] { 1, 5, 6, 8, 3 };
		int array2[] = new int[] { 10, 2, 3, 9 };
		int m = array.length;    // число количество символов в первом массиве
		int p = array2.length;   // число количество символов во втором массиве

		System.out.println("Число k = " + k);

		System.out.println("Заданный первый массив: " + Arrays.toString(array));
		System.out.println("Заданный второй массив: " + Arrays.toString(array2));

		array = Arrays.copyOf(array, m + p);           // расширяем первый массив чтобы поместился второй
		array2 = Arrays.copyOf(array2, m - k + p);     //расширяем второй массив чтобы поместились числа после "к" из первого массива
				
		System.arraycopy(array, k + 1, array2, p, m - k);    //копируем хвост после "к" из первого массива во второй
		System.arraycopy(array2, 0, array, k + 1, array2.length - 1); // копируем второй массив в первый
		System.out.println("result");
		// нумерация элементов массива начинается с 0
		System.out.println("Полученный массив: " + Arrays.toString(array));
	}
}
