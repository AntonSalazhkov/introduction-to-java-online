package by.training.java.module_6.task01.library;

import by.training.java.module_6.task01.logic.Dispatch;

import java.util.ArrayList;
import java.util.Scanner;

public class EditableBook extends NewBook {

    private ArrayList<Book> newCatalogBooks = new ArrayList<>();

    public EditableBook(int currentBookNumber, ArrayList<Book> books) {
        super();
        setNewCatalogBooks(books);

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String number;

        System.out.println("1. Редактировать книгу " + "| 2. Удалить книгу " + "| 0. Выход из подменю.");

        System.out.print("Сделайте свой выбор >> ");
        number = sc.nextLine();

        switch (number) {
            case "1":
                do {
                    System.out.println("1. Изменить название книги " + "| 2. Изменить автора книги "
                            + "| 3. Изменить тип книги " + "| 4. Изменить описание книги " + "| 0. Выход из подменю.");

                    System.out.print("Сделайте свой выбор >> ");
                    number = sc.nextLine();

                    switch (number) {
                        case "1":
                            System.out.print("Введите название книги >> ");
                            getNewCatalogBooks().get(currentBookNumber).setBookTitle(sc.nextLine());
                            break;
                        case "2":
                            System.out.print("Введите автора книги >> ");
                            getNewCatalogBooks().get(currentBookNumber).setAuthor(sc.nextLine());
                            break;
                        case "3":
                            getNewCatalogBooks().get(currentBookNumber).setBookVersion(setNewBookType());
                            break;
                        case "4":
                            getNewCatalogBooks().get(currentBookNumber).setBookDescription(setNewBookDescription());

                            System.out.println("Отправка пользователям на email книги с редактированным описанием: ");

                            Dispatch dispatch = new Dispatch();
                            dispatch.dispatchToAllUsers("Добавлено новое описание книги "
                                            + getNewCatalogBooks().get(currentBookNumber).getBookTitle(),
                                    getNewCatalogBooks().get(currentBookNumber).toString());
                            break;
                    }
                } while (!number.matches("[0]"));
                break;

            case "2":
                getNewCatalogBooks().remove(currentBookNumber);
                break;

            case "0":
                break;
        }
    }

    public ArrayList<Book> getNewCatalogBooks() {
        return newCatalogBooks;
    }

    public void setNewCatalogBooks(ArrayList<Book> newCatalogBooks) {
        this.newCatalogBooks = newCatalogBooks;
    }
}
