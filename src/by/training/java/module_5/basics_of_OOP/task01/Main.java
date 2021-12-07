package by.training.java.module_5.basics_of_OOP.task01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1. Создать обьект класса Текстовый файл, используя классы Файл, Директория.
        // Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.

        String fileSeparator = System.getProperty("file.separator");
        TextFile textFile = new TextFile(new Directory("E:" + fileSeparator));

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String number;

        do {
            System.out.print("\nВыберите пункт меню:"
                    + "\n1. Создать текущий файл"
                    + "\n2. Переименовать файл"
                    + "\n3. Вывести на консоль содержимое"
                    + "\n4. Дополнить файл"
                    + "\n5. Удалить текущий файл"
                    + "\n0. Окончание работы программы.");

            System.out.print("\nПожалуйста, сделайте свой выбор в меню >> ");
            number = sc.nextLine();

            switch (number) {
                case "1":
                    System.out.print("Задайте имя файла без расширения >> ");
                    textFile.createFile(sc.nextLine());
                    break;
                case "2":
                    System.out.print("Задайте новое имя файла без расширения >> ");
                    textFile.renameFile(sc.nextLine());
                    break;
                case "3":
                    textFile.printContent();
                    break;
                case "4":
                    System.out.print("Введите текст >> ");
                    textFile.addFile(sc.nextLine());
                    break;
                case "5":
                    textFile.deleteFile();
                    break;
                case "0":
                    System.out.print("Завершение работы приложения");
            }
            System.out.println("");
        } while (!number.matches("[0]"));
    }
}
