package by.training.java.module_2.algorithmization;

public class Task1_03 {

	public static void main(String[] args) {
		// 3. Дан массив действительных чисел, размерность которого N. Подсчитать ссколько
		// в нем отрицательных, положительных и нулевых элементов.
		
		int N = 7;
		int array[] = new int[N];
		int pol = 0;
		int otr = 0;
		int nul = 0;
		
		System.out.print("Заданный массив: ");
		
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (-50 + Math.random() * 100);
			System.out.print(array[i] + " | ");
			
			if(array[i] > 0) {
				pol += 1;
			}
			if(array[i] < 0) {
				otr += 1;
			}
			if(array[i] == 0) {
				nul += 1;
			}
		}
		System.out.println("");
		System.out.println("Положительных чисел: " + pol);
		System.out.println("Отрицательных чисел: " + otr);
		System.out.println("Нулевых чисел: " + nul);
	}
}
