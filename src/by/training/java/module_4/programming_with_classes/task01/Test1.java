package by.training.java.module_4.programming_with_classes.task01;

public class Test1 {

    public int numberOne;
    public int numberTwo;

    public void showInConsole() {
        System.out.println("Первая переменная равна: " + numberOne);
        System.out.println("Вторая переменная равна: " + numberTwo);
    }

    public int sum() {
        return this.numberOne + this.numberTwo;
    }

    public int findMax() {
        return numberOne > numberTwo ? numberOne : numberTwo;
    }
}