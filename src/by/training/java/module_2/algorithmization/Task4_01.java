package by.training.java.module_2.algorithmization;

public class Task4_01 {

	public static void main(String[] args) {
		// Декомпозиция с использованием методов (подпрограмм)

		// 1. Написать метод (методы) для нахождения наибольшего общего делителя и
		// наименьшего общего кратного двух натуральных чисел.
		int a = 15;
		int b = 12;

		if (a > 0 && b > 0) {
			System.out.println("Наибольший общий делитель чисел " + a + " и " + b + " = " + naibObshDelit(a, b));
			System.out.println("Наименьшее общее кратное чисел " + a + " и " + b + " = " + naimObshKr(a, b));
		} else {
			System.out.println("Недопустимое значение чисел");
		}
	}

	public static int naibObshDelit(int a, int b) {
		return b == 0 ? a : naibObshDelit(b, a % b);
	}

	public static int naimObshKr(int a, int b) {
		return a * b / naibObshDelit(a, b);
	}
}
