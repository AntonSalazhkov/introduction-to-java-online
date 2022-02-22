package by.training.java.module_2.algorithmization;

public class Task4_02 {

	public static void main(String[] args) {
		// 2. Написать матод для нахождения наибольшего общего делителя четырех
		// натуральных чисел.

		int a = 12;
		int b = 12;
		int c = 16;
		int d = 4;

		System.out.println("Наибольший общий делитель чисел " + a + ", " + b + ", " + c + ", " + d + " = "
				+ naibObshDelit(a, b, c, d));
	}

	public static int naibObshDelit(int a, int b, int c, int d) {
		if (a > 0 && b > 0 && c > 0 && d > 0) {
			while (a != b) {
				if (a > b) {
					int s = a;
					a = b;
					b = s;
				}
				b = b - a;
			}
			while (c != d) {
				if (c > d) {
					int s = c;
					c = d;
					d = s;
				}
				d = d - c;
			}
			while (a != c) {
				if (a > c) {
					int s = a;
					a = c;
					c = s;
				}
				c = c - a;
			}
			return a;
		} else {
			System.out.println("Недопустимое значение чисел");
			return 0;
		}
	}
}
