package by.training.java.module_2.algorithmization;

public class Task4_06 {

	public static void main(String[] args) {
		// 6. Написать, метод проверяющий являются ли данные три числа взаимно простыми.

		int a;
		int b;
		int c;
		int d;

		a = 6;
		b = 8;
		c = 9;
		d = naibObshDelit(a, b, c);

		System.out.println("Данные три числа: " + a + ", " + b + ", " + c + number(d));
	}

	public static int naibObshDelit(int a, int b, int c) {
		if (a != 0 && b != 0 && c != 0) {
			while (a != b) {
				if (a > b) {
					int s = a;
					a = b;
					b = s;
				}
				b = b - a;
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

	public static String number(int d) {
		if (d == 1) {
			return " - являются взаимно простыми";
		} else {
			return " - не являются взаимно простыми";
		}
	}
}
