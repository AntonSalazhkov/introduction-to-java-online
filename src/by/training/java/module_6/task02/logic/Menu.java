package by.training.java.module_6.task02.logic;

import by.training.java.module_6.task02.content.NewNote;
import by.training.java.module_6.task02.content.Notebook;

import java.util.Scanner;

public class Menu {

    public Menu() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String number;
        Notebook notebook = new Notebook();
        notebook.readNotebook();

        do {
            System.out.println("1. Показать записи | 2. Найти записи по параметрам | 3. Добавить запись " +
                    "| 0. Окончание работы программы ");
            System.out.print("Сделайте свой выбор >> ");
            number = sc.nextLine();

            switch (number) {
                case "1":
                    notebook.showNote();
                    break;
                case "2":
                    Search search = new Search();
                    search.searchByParameter();

                    break;
                case "3":
                    NewNote newNote = new NewNote();
                    newNote.setNewNote();

                    notebook.setNotebook(newNote);
                    notebook.saveNotebook();      // т.к. читаем из файла, то сначала сохраняем для корректного показа записей
                    notebook.readNotebook();
                    break;
                case "0":
                    notebook.saveNotebook();
                    System.out.print("Завершение работы программы");
                    break;
            }
        } while (!number.matches("[0]"));
    }
}
