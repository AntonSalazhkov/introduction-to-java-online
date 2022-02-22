package by.training.java.module_2.algorithmization;

public class Task4_16 {

	public static void main(String[] args) {
		// 16. Написать программу, определяющую сумму n - значных чисел, содержащих
		// только нечетные цифры. Определить также, сколько четных цифр в найденной
		// сумме.

		int n = 4;

		if (n > 0) { 
			System.out.println("Сумма " + n + " значных чисел с нечетными цифрами: ");
			System.out.println(number(n));
			
			System.out.println("Четных чисел в полученной сумме: ");
			System.out.println(kolPositiveNumber(number(n)));
		} else {
			System.out.println("Некорректное число n");
		}
	}

	public static int number(int n) {
		int sum = 0;
		for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
			sum += sumNumber(i, n);
		}
		return sum;
	}

	public static int sumNumber(int i, int n) {
		int a;
		int sum = 0;
		int sum1 = 0;
		int p = 0;
		for (int k = 0; k < n;) {
			a = i;
			a = (int) (a / (Math.pow(10, k)));
			p = a % 10;                               // Определяем каждое число
			if (p % 2 != 0) {
				sum += p;                          // Суммируем только нечетные числа
			} else {
				sum1 += p;
			}
			k++;
		}
		if (sum1 == 0) {            // Если в числе были четные цифры - возврат 0
			return sum;
		} else {
			return 0;
		}
	}

	public static int kolPositiveNumber(int sum) {
		int a;
		int kolPositiveNumber = 0;
		int p = 0;
		String st;
		st = sum + "";                                      // Преобразуем число в строку
		int kolNumber = st.length();                        // Определяем количество цифр в числе
		for (int k = 0; k < kolNumber;) {
			a = sum;
			a = (int) (a / (Math.pow(10, k)));              
			p = a % 10;                                     // Определяем каждое число
			if (p % 2 == 0) {                   // Высчитываем количество положительных чисел
				kolPositiveNumber += 1;
			}
			k++;
		}
		return kolPositiveNumber;
	}
}
