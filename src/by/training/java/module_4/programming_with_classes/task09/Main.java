package by.training.java.module_4.programming_with_classes.task09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
        метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
        методами. Задать критерии выбора данных и вывести эти данные на консоль.
        Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
        Найти и вывести:
        a) список книг заданного автора;
        b) список книг, выпущенных заданным издательством;
        c) список книг, выпущенных после заданного года.
        */

        Book[] book = new Book[4];

        book[0] = new Book(12, "Гибель богов", "Ник Перумов", "Эксмо", 1994, 554, 0, "Твердый переплет");
        book[1] = new Book(14, "Империя превыше всего", "Ник Перумов", "Эксмо", 2002, 434, 100, "Твердый переплет");
        book[2] = new Book(15, "Head First Java", "Kathy Sierra, Bert Bates", "O'Reilly Media", 2012, 720, 48, "Твердый переплет");
        book[3] = new Book(22, "Thinking in Java", "Bruce Eckel", "Prentice Hall", 2006, 1079, 78, "Твердый переплет");

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String number;

        System.out.println("Текущий список книг:");
        Book.toString(book);
        do {
            System.out.print("\nВыберите пункт меню:"
                    + "\n1. Вывести список книг заданного автора"
                    + "\n2. Вывести список книг выпущеных заданным издательством"
                    + "\n3. Вывести список книг выпущеных после заданного года"
                    + "\n0. Окончание работы программы.");

            System.out.print("\nПожалуйста, сделайте свой выбор в меню >> ");
            number = sc.nextLine();

            switch (number) {
                case "1":
                    System.out.print("Введите автора для поиска >> ");
                    Shop.getBookList(book, sc.nextLine(), 1);
                    break;
                case "2":
                    System.out.print("Введите издательство для поиска >> ");
                    Shop.getBookList(book, sc.nextLine(), 2);
                    break;
                case "3":
                    System.out.print("Введите год для поиска >> ");
                    Shop.getBookList(book, sc.nextLine(), 3);
                    break;
                case "0":
                    System.out.print("Завершение работы приложения");
            }
        } while (!number.matches("[0]"));
    }
}





