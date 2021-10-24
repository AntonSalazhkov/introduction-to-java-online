package by.training.java.module_4.programming_with_classes.task05;

public class Counter {

    private int firstNumber;
    private int secondNumber;
    private int currentState = 0;

    public Counter() {
        firstNumber = 0;
        secondNumber = 100;
    }

    public void ascendingCounter() {
        if (firstNumber < secondNumber) {
            for (int i = firstNumber; i <= secondNumber; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("Некорректный ввод чисел");
        }
        currentState = secondNumber;
    }

    public void decreasingCounter() {
        if (secondNumber < firstNumber) {
            for (int i = firstNumber; i >= secondNumber; i--) {
                System.out.println(i);
            }
        } else {
            System.out.println("Некорректный ввод чисел");
        }
        currentState = secondNumber;
    }

    public int getCurrentState() {
        return currentState;
    }

    public void setMin(int number) {
        firstNumber = number;
    }

    public void setMax(int number) {
        secondNumber = number;
    }
}
