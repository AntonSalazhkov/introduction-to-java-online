package by.training.java.module_2.algorithmization;

public class Task4_11 {

	public static void main(String[] args) {
		// 11. Написать метод, определяющий в каком из данных двух чисел больше цифр.

		double a = 564.45673;
		int b = 127543992;
		System.out.println("Заданы два числа: " + a + " и " + b);
		number(a, b);
	}

	public static void number(double a, int b) {
		String number1 = a + "";
		String number2 = b + "";
		String tochk = ".";          // Проверяем на наличие точки
		
		int kolNumber1 = number1.length();
		int kolNumber2 = number2.length();

		if (number1.indexOf(tochk) != -1) {    // Проверяем на наличие точки
			kolNumber1 -= 1;
		}
		if (number2.indexOf(tochk) != -1) {    // Не обязательно так как число int
			kolNumber2 -= 1;
		}

		if (kolNumber1 != kolNumber2) {
			if (kolNumber1 > kolNumber2) {
				System.out.println("Число " + number1 + " имеет больше цифр");
			} else {
				System.out.println("Число " + number2 + " имеет больше цифр");
			}
		} else {
			System.out.println("Числа равны по количеству цифр");
		}
	}
}
