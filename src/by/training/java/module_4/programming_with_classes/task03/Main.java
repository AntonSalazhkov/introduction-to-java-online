package by.training.java.module_4.programming_with_classes.task03;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // 3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы,
        // номер группы, успеваемость (массив из пяти элементов).
        // Создайте массив из десяти элементов такого типа.
        // Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные 9 или 10.

        Student students[] = new Student[10];

        students[0] = new Student("Ivanov", "I.I.", 2);
        students[1] = new Student("Posadskii", "A.K.", 1);
        students[2] = new Student("Sidorova", "S.A.", 3);
        students[3] = new Student("Baradulin", "A.N.", 2);
        students[4] = new Student("Stognachev", "A.A.", 4);
        students[5] = new Student("Nikitenko", "V.I.", 1);
        students[6] = new Student("Krot", "I.M.", 2);
        students[7] = new Student("Kyliba", "L.V.", 3);
        students[8] = new Student("Sich", "N.G.", 4);
        students[9] = new Student("Sokolov", "A.D.", 1);
        
        Random random = new Random();
        boolean[] arrayGradesExcellentStudent = new boolean[10];
              
        for (int i = 0; i < students.length; i++) {
        	for (int k = 0; k < 5; k++) {
        		students[i].setGrade(k, random.nextInt(10) + 1); // Присваиваем случайные числа от 1 до 10, т.к. 0 - не оценка
        	}
        	System.out.println("Студент " + students[i].getSurname() + " " + students[i].getInitials() 
        			+ " из группы № " + students[i].getGroupNumber() + " имеет следующие оценки: " + students[i].getGrade());
        	
        	arrayGradesExcellentStudent[i] = students[i].getGradeExcellentStudent();
        }   
        
        System.out.println("");
        System.out.println("Студенты отличники имеющие оценки 9 или 10:");
        for (int j = 0; j < arrayGradesExcellentStudent.length; j++) {
        	if (arrayGradesExcellentStudent[j]) {                      // выводим только тех студентов, которые имеют хоть одну 9 или 10
        		System.out.println(students[j].getSurname() + " " + students[j].getInitials() 
            			+ " из группы № " + students[j].getGroupNumber());
        	}      	
        }
    }
}
