package by.training.java.module_2.algorithmization;

public class Task1_09 {

	public static void main(String[] args) {
		// 9. В массиве целых чисел с количеством элементов n найти ниибольшее часто
		// встречающееся число. Если таких несколько, то определить наименьшее из них.

		int n = 10;
		int array[] = new int[n];
		int povtMax = 0;         // Число с наибольшими повторами
		int povtVsego = 0;       // Наибольшее количество повторов какого-либа числа, счетчик
		int povtPoUmolch;        // Количество повторов одного числа, счетчик

		System.out.print("Заданный массив: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (-5 + Math.random() * 10);
			System.out.print(array[i] + " | ");
		}
		for (int k = 0; k < array.length; k++) {
			int a = 0;
			povtPoUmolch = 0;
			while (a < array.length) {

				if (array[k] == array[a] && a != k) {
					povtPoUmolch += 1;
					if (povtVsego < povtPoUmolch || povtVsego == povtPoUmolch && povtMax > array[k]) {
						povtMax = array[k];
					}
				}
				if (povtVsego < povtPoUmolch) {
					povtVsego = povtPoUmolch;
				}
				a++;
			}
		}
		System.out.println("");
		System.out.println("Наименьшее число с наибольшими повторами: " + povtMax);
	}
}