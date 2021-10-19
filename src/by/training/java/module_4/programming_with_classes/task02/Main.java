package by.training.java.module_4.programming_with_classes.task02;

public class Main {

    public static void main(String[] args) {
        // 2. Создайте класс Test2 двумя переменными.
        // Добавьте конструктор с входными параметрами.
        // Добавьте конструктор, инициализирующий члены класса по умолчанию.
        // Добавьте set- и get- методы для полей экземпляра класса.

        Test2 test = new Test2(6, 8);

        System.out.println("Первая переменная = " + test.getNumberOne());
        System.out.println("Вторая переменная = " + test.getNumberTwo());

        Test2 testByDefault = new Test2();  //инициализация по умолчанию

        System.out.println("Значение первой переменной в конструкторе по умолчанию = " + testByDefault.getNumberOne());
        System.out.println("Значение второй переменной в конструкторе по умолчанию = " + testByDefault.getNumberTwo());

        testByDefault.setNumberOne(33);  //устанавливаем новые значения с помощью сеттеров
        testByDefault.setNumberTwo(45);

        System.out.println("Значение первой переменной отображонной с помощью геттера = " + testByDefault.getNumberOne());
        System.out.println("Значение второй переменной отображонной с помощью геттера = " + testByDefault.getNumberTwo());
    }
}