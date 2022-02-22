package by.training.java.module_2.algorithmization;

public class Task3_07 {

	public static void main(String[] args) {

		// 7. Пусть даны две неубывающие последовательности действительных чисел a1 < a2
		// < ... < an и b1 < b2 < ... < bm; Требуется указать те места, на которые нужно
		// вставлять элементы последовательности b1, b2...bm в первую последовательность так,
		// чтобы новая последовательность оставалась возрастающей.

		int[] arrayA = { 3, 5, 13, 15, 44, 55 };
		int[] arrayB = { 4, 5, 11, 16, 55, 66, 77 };

		for (int i = 0, count1 = 0, count2 = 0; i < (arrayA.length + arrayB.length) && count1 < arrayA.length
				&& count2 < arrayB.length; i++) {
			if (arrayA[count1] > arrayB[count2]) {
				System.out.println(i);
				count2++;
			} else {
				count1++;
			}
		}
	}
}
