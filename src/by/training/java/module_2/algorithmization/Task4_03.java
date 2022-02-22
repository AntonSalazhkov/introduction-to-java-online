package by.training.java.module_2.algorithmization;

public class Task4_03 {

	public static void main(String[] args) {
		// 3. Вычислить площадь правильного шестиугольника со стороной а, используя
		// метод вычисления площади треугольника.

		int a = 12;

		System.out.println("Площадь правильного шестиугольника со стороной " + a + " = " + 6 * sTreug(a));
	}

	public static double sTreug(int a) {
		if (a > 0) {
			return (Math.sqrt(3) / 4) * a * a;
		} else {
			System.out.println("Недопустимое значение числа");
			return 0;
		}
	}
}
