package by.training.java.module_4.programming_with_classes.task06;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Составьте описание класса для представления времени.
        // Предусмотрите возможность установки времени и изменения его отдельных полей
        // (час, минута, секунда) с проверкой допустимости вводимых значений.
        // В случае недопустимых значений полей поле устанавливается в значение 0.
        // Создать методы изменения времени на заданное количество часов, минут и секунд.

        Time time = new Time();

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String number;
        do {
            System.out.print(time.getCurrentTime());

            System.out.print("\nВыберите пункт меню:"
                    + "\n1. Установить время: ч, мин, сек (через пробел)"
                    + "\n2. Установить часы"
                    + "\n3. Установить минуты"
                    + "\n4. Установить секунды"
                    + "\n5. Изменить время на ч, мин, сек (через пробел, в формате ХХ ХХ ХХ)"
                    + "\n0. Окончание работы программы.");

            System.out.print("\nПожалуйста, сделайте свой выбор в меню >> ");
            number = sc.nextLine();

            switch (number) {
                case "1":
                    timeSetting(time, 1);
                    break;
                case "2":
                    timeSetting(time, 2);
                    break;
                case "3":
                    timeSetting(time, 3);
                    break;
                case "4":
                    timeSetting(time, 4);
                    break;
                case "5":
                    timeSetting(time, 5);
                    break;
                case "0":
                    System.out.print("Завершение работы приложения");
            }
            System.out.println("");
        } while (!number.matches("[0]"));
    }

    public static void timeSetting(Time time, int parameter) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Укажите нужное время >> ");
        while (!sc.hasNextInt()) {
            sc.nextLine();
            System.out.print("Укажите нужное время >> ");
        }
        if (parameter == 1) {
            time.setTime(sc.nextLine(), 1);
        } else if (parameter == 2) {
            time.setHour(sc.nextInt());
        } else if (parameter == 3) {
            time.setMinute(sc.nextInt());
        } else if (parameter == 4) {
            time.setSecond(sc.nextInt());
        } else {
            time.setTime(sc.nextLine(), 2);
        }
    }
}


    

