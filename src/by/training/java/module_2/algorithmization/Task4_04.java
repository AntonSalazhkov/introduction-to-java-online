package by.training.java.module_2.algorithmization;

public class Task4_04 {

	public static void main(String[] args) {
		// 4. На плоскости заданы своими координатами n точек. Написать метод(методы),
		// определяющие, между какими из пар точек самое большое расстояние. Координаты
		// точек занесены в массив.

		int[][] array = new int[][] { // x, y
				{ 12, 32 }, 
				{ -2, 13 }, 
				{ 22, -37 }, 
				{ 42, 23 } };

		int[] pointsMaxLength = maxLength(array);       // Заносим в новый массив полученные координаты Х двух точек

		System.out.print("Между данными точками самое большое расстояние: (");
		System.out.print(array[pointsMaxLength[0]][0] + ", " + array[pointsMaxLength[0]][1] + ") и (" + array[pointsMaxLength[1]][0] + ", " + array[pointsMaxLength[1]][1] + ")");
	}

	public static int[] maxLength(int array[][]) { 
		double gipotenuza = 0;         // Высчитываем расстояние между двумя точками через гипотенузу
		double max = 0;                // Максимальное расстояние
		int a = 0;                     // Катет по х
		int b = 0;                     // Катет по y
		int[] points = new int[2];     // Создаем массив в котором будут храниться координаты Х двух точек

		for (int i = 0; i < array.length - 1; i++) {        //Высчитываем максимальное расстояние между точкой и всеми следующими в массиве точками
			for (int k = i + 1; k < array.length; k++) {
				a = array[i][0];
				b = array[i][1];
				a = Math.abs(a - array[k][0]);
				b = Math.abs(b - array[k][1]);
				gipotenuza = Math.sqrt(a * a + b * b);

				if (gipotenuza > max) {      // Запоминаем максимальное расстояние
					max = gipotenuza;
					points[0] = i;           // Запоминаем Х координату первой точки
					points[1] = k;           // Запоминаем Х координату второй точки
				}
			}
		}
		return points;  // Возвращаем координаты Х двух точек
	}
}
