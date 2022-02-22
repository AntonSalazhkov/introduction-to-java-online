package by.training.java.module_2.algorithmization;

public class Task2_16 {

	public static void main(String[] args) {
		// 16. Составить матрицу n x n, чтобы суммы цифр в столбцах по вертикали,
		// горизонтали и диагонали совпадали.

		byte n = 4;
		byte array[][] = new byte[n][n];
		byte i; // Переменная цикла (столбцов)
		byte k; // Переменная цикла (строк)
		byte a; // сумма чисел первой строки (горизонтальной)
		byte b; // сумма чисел одной строки ( вертикально / горизонтально / или по диагонали)
		byte c; // оператор соответствия b == a, при b != a будет c ++, повтор цикла пока c == 0

		do {
			c = 0;
			a = 0;
			for (k = 0; k < array.length; k++) {
				array[0][k] = (byte) (Math.random() * 5); // можно и *10 (будут числа от 0 до 10), тогда будет дольше считать 
				a += array[0][k];
			}
			for (i = 1; i < array.length; i++) {
				b = 0;
				for (k = 0; k < array[i].length; k++) {
					array[i][k] = (byte) (Math.random() * 5);
					b += array[i][k];
				}
				if (b != a) {
					c += 1;
				}
			}
			for (k = 0; k < array.length; k++) {
				b = 0;
				for (i = 0; i < array[k].length; i++) {
					b += array[i][k];
				}
				if (b != a) {
					c += 1;
				}
			}
			k = 0;
			b = 0;
			for (i = 0; i < array.length; i++) {
				b += array[i][k];
				k += 1;
			}
			if (b != a) {
				c += 1;
			}
			b = 0;
			for (i = 0; i < array.length; i++) {
				k -= 1;
				b += array[i][k];
			}
			if (b != a) {
				c += 1;
			}

		} while (c != 0);
		System.out.println("Сумма чисел в ряде: " + a);
		System.out.println("Полученная матрица: ");

		for (i = 0; i < array.length; i++) {
			for (k = 0; k < array[i].length; k++) {

				System.out.print(array[i][k] + " | ");
			}
			System.out.println("");
		}
	}
}
