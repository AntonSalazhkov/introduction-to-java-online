package by.training.java.module_3.string;

import java.util.Arrays;

public class Task1_01 {

    public static void main(String[] args) {
        // Работа со строками как с массивом символов

        //1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

        String[] camelCase = {"camelOne", "camelTwo", "camelThree"};
        System.out.println("Заданная строка: " + Arrays.toString(camelCase));
        camelInSnake(camelCase);
    }

    public static void camelInSnake(String[] camelCase) {
        StringBuffer sb = new StringBuffer();

        for (String st : camelCase) {
            for (int i = 0; i < st.length(); i++) {
                if (Character.isUpperCase((st.charAt(i)))) {
                    sb.append("_");
                    sb.append(st.charAt(i));
                } else {
                    sb.append(st.charAt(i));
                }
            }
            sb.append(" ");
        }
        String[] snakeCase = sb.toString().toLowerCase().split(" ");

        System.out.println("Полученная строка: " + Arrays.toString(snakeCase));
    }
}

