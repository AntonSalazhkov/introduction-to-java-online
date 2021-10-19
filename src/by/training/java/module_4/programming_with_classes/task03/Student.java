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
    
    public boolean getGradeExcellentStudent () {
    	int numberOfBadGrades = 0;
    	boolean gradeExcellentStudent = false;
    	for (int i = 0; i < grade.length; i++) {
    		if (grade[i] < 9) {                 // считаем количество плохих оценок
                numberOfBadGrades++;
    		}
    	}
    	if (numberOfBadGrades != grade.length) { // если есть хоть одна хорошая оценка, то помечаем данного студента
    		gradeExcellentStudent = true;
		}
    	return gradeExcellentStudent; 	
    }  
    
    public void setGrade(int firstNumber, int secondNumber) {    //сеттеры
    	grade[firstNumber] = secondNumber;
    }    
}