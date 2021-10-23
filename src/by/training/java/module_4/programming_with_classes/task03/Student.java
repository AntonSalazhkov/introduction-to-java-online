package by.training.java.module_4.programming_with_classes.task03;

import java.util.Arrays;

public class Student {

    private String surname;
    private String initials;
    private int groupNumber;
    private int[] grade = new int[5];

    public Student(String firstParameter, String secondParameter, int thirdParameter) { //конструктор с входными параметрами
        surname = firstParameter;
        initials = secondParameter;
        groupNumber = thirdParameter;
    }

    public String getGrade() {            //геттеры
        return Arrays.toString(grade);
    }

    public String getSurname() {
        return surname;
    }

    public String getInitials() {
        return initials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public boolean isExcellentStudent() {
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] > 8) {                 // Если есть хоть одна 9 или 10 выводим true
                return true;
            }
        }
        return false;
    }

    public void setGrade(int firstNumber, int secondNumber) {    //сеттеры
        grade[firstNumber] = secondNumber;
    }
}