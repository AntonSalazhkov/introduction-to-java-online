package by.training.java.module_4.programming_with_classes.task02;

public class Test2 {

    private int numberOne;
    private int numberTwo;

    public Test2(int firstNumber, int secondNumber) { //конструктор с входными параметрами
        numberOne = firstNumber;
        numberTwo = secondNumber;
    }
    
    public Test2() {   //конструктор по умолчанию
    }
    
    public int getNumberOne() {    //геттеры
        return numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }
    
    public void setNumberOne(int firstNumber) {  //сеттеры
        numberOne = firstNumber;
    }

    public void setNumberTwo(int secondNumber) {
        numberTwo = secondNumber;
    }
}