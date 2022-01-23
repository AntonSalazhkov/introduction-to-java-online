package by.training.java.module_6.task01.logic;

import by.training.java.module_6.task01.library.CatalogBook;
import by.training.java.module_6.task01.library.EditableBook;
import by.training.java.module_6.task01.library.NewBook;
import by.training.java.module_6.task01.user.Account;

import java.util.Scanner;

public class Submenu {

    public Submenu(Account account) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String number;
        CatalogBook catalogBook = new CatalogBook();
        catalogBook.readCatalogBook();
        int currentBookNumber;

        if (account.getUserStatus() == "administrator") {

            do {
                System.out.println("1. Просмотр каталога " + "| 2. Поиск книги " + "| 3. Редактировать книгу "
                        + "| 4. Добавить книгу " + "| 0. Окончание работы программы.");

                System.out.print("Сделайте свой выбор >> ");
                number = sc.nextLine();

                switch (number) {
                    case "1":
                        catalogBook.showLibrary();
                        break;
                    case "2":
                        System.out.print("Введите название книги >> ");
                        currentBookNumber = catalogBook.bookSearch(sc.nextLine());
                        if (currentBookNumber >= 0) {
                            System.out.println(catalogBook.getBooks().get(currentBookNumber).toString());
                        }
                        break;
                    case "3":
                        System.out.print("Введите название книги >> ");
                        currentBookNumber = catalogBook.bookSearch(sc.nextLine());
                        if (currentBookNumber >= 0) {
                            EditableBook editableBook = new EditableBook(currentBookNumber, catalogBook.getBooks());
                            catalogBook.setEditableBook(editableBook.getNewCatalogBooks());
                            catalogBook.saveBook();
                            catalogBook.readCatalogBook();
                        }
                        break;
                    case "4":
                        NewBook newBook = new NewBook();
                        newBook.setNewBook();
                        boolean correctInput = catalogBook.setBooks(newBook);

                        catalogBook.saveBook();
                        catalogBook.readCatalogBook();

                        if (correctInput) {

                            System.out.println("Отправка пользователям на email добавленной в каталог книги: ");

                            Dispatch dispatch = new Dispatch();
                            dispatch.dispatchToAllUsers("Добавлена новая книга в каталоге "
                                    + newBook.getBookTitle(), newBook.toString());
                        }
                        break;
                    case "0":
                        System.out.print("Завершение работы программы");
                        break;
                }
            } while (!number.matches("[0]"));

        } else {

            do {
                System.out.println("1. Просмотр каталога " + "| 2. Поиск книги " + "| 3. Предложить добавить книгу в каталог "
                        + "| 0. Окончание работы программы.");

                System.out.print("Сделайте свой выбор >> ");
                number = sc.nextLine();

                switch (number) {
                    case "1":
                        catalogBook.showLibrary();
                        break;
                    case "2":
                        System.out.print("Введите название книги >> ");
                        currentBookNumber = catalogBook.bookSearch(sc.nextLine());
                        if (currentBookNumber >= 0) {
                            System.out.println(catalogBook.getBooks().get(currentBookNumber).toString());
                        }
                        break;
                    case "3":
                        NewBook newBook = new NewBook();
                        newBook.setNewBook();

                        System.out.println("Отправка администратору на email предложения по добавлению новой книги: ");

                        Dispatch dispatch = new Dispatch();
                        if (!dispatch.dispatchToAdministrator("Предложение по добавлению новой книги в каталог"
                                , newBook.toString())) {

                            System.out.println(" Пользователь со статусом \"administrator\" не зарегистрирован");
                        }

                        break;
                    case "0":
                        System.out.print("Завершение работы программы");
                        break;
                }
            } while (!number.matches("[0]"));
        }
    }
}
