package by.training.java.module_2.algorithmization;

public class Task4_17 {

	public static void main(String[] args) {
		// 17. Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму
		// его цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль?

		int n = 30;

		if (n > 0) {
			System.out.println("Заданное число n = " + n);
			System.out.println("Количество операций вычитания: " + number(n));
		} else {
			System.out.println("Некорректное число n");
		}
	}

	public static int number(int n) {
		int a = 0;                            // Количество операций вычитания
		String st = n + "";                   // Преобразуем число в строку
		int kolNumber = st.length();          // Определяем количество цифр в числе
		int sum = sumNumber(n, kolNumber);    // Высчитываем сумму цифр числа
		while (n > 0) {                       // Отнимаем от числа сумму его цифр, пока не станет нулем или отрицательным
			n -= sum;
			a += 1;
		}
		if (n == 0) {            // Если результат вычитания равен нулю возвращаем количество операций
			return a;
		} else {
			System.out.println("По результатам вычитания получается отрицательное число");
			return -1;
		}
	}

	public static int sumNumber(int n, int kolNumber) {
		int a;
		int sum = 0;
		for (int k = 0; k < kolNumber;) {
			a = n;
			a = (int) (a / (Math.pow(10, k)));
			sum += a % 10;
			k++;
		}
		return sum;              // Возвращаем сумму цифр числа
	}
}