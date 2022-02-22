package by.training.java.module_2.algorithmization;

public class Task4_09 {

	public static void main(String[] args) {
		// 9. Даны числа X, Y, Z, T - длины сторон четырехугольника. Написать метод
		// вычисления его площади, если угол между сторонами длинной X и Y - прямой.

		int X = 10;
		int Y = 9;
		int Z = 7;
		int T = 8;
		double hypotenuse;                      // Разбиваем четырехугольник на два треугольника и находим гипотенузу прямоугольного треугольника
		hypotenuse = Math.sqrt(X * X + Y * Y);
		double areaTriangle1 = areaTriangle1(X, Y);             // Площадь прямоугольного треугольника
		double areaTriangle2 = areaTriangle2(Z, T, hypotenuse); // Площадь второго треугольника

		System.out.println("Площадь четырехугольника со торонами: " + X + ", " + Y + ", " + Z + ", " + T + " = " + areaQuadrangle(areaTriangle1, areaTriangle2));

	}

	public static double areaQuadrangle(double areaTriangle1, double areaTriangle2) {
		double area = areaTriangle1 + areaTriangle2;            // Общая площадь четырехугольника
		if (areaTriangle1 <= 0 || areaTriangle2 <= 0) {
			System.out.println("Некорректные значения сторон");
			return 0;
		} else {
			return area;
		}
	}

	public static double areaTriangle1(int X, int Y) {
		double areaTriangle1 = 0;
		if (X <= 0 || Y <= 0) {
			System.out.println("Некорректные значения сторон X, Y");
		} else {
			areaTriangle1 = 0.5 * X * Y;           // Площадь прямоугольного треугольника
		}
		return areaTriangle1;
	}

	public static double areaTriangle2(int Z, int T, double hypotenuse) {
		double areaTriangle2 = 0;
		double perimeter;
		if (Z <= 0 || T <= 0 || Z + T < hypotenuse) {
			System.out.println("Некорректные значения сторон Z, T");
		} else {
			perimeter = 0.5 * (Z + T + hypotenuse);
			areaTriangle2 = Math.sqrt(perimeter * (perimeter - Z) * (perimeter - T) * (perimeter - hypotenuse));
		}
		return areaTriangle2;
	}
}
