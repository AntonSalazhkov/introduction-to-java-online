package by.training.java.module_6.task01.library;

import java.util.Scanner;

public class NewBook extends Book {

    public NewBook() {
        super();
    }

    public void setNewBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите название книги >> ");
        super.setBookTitle(sc.nextLine());

        System.out.print("Введите автора книги >> ");
        super.setAuthor(sc.nextLine());

        super.setBookVersion(setNewBookType());
        super.setBookDescription(setNewBookDescription());
    }

    // установку типа и описания вынес в методы

    public String setNewBookType() {

        boolean correctInput = false;
        Scanner sc = new Scanner(System.in);
        String bookVersion = "";

        do {

            System.out.print("Введите тип книги >> ");
            super.setBookVersion(sc.nextLine());
            if (getBookVersion().compareToIgnoreCase("Бумажная") == 0) {
                bookVersion = "Бумажная";
                correctInput = true;
            } else if (getBookVersion().compareToIgnoreCase("Электронная") == 0) {
                bookVersion = "Электронная";
                correctInput = true;
            } else {
                System.out.println("Некорректный ввод, тип книги может быть только \"Бумажная\" или \"Электронная\"");
            }

        } while (!correctInput);
        return bookVersion;
    }

    public String setNewBookDescription() {

        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        String currentLine;

        System.out.print("Введите описание книги (\\n - для новой строки) >> ");
        currentLine = sc.nextLine();

        for (int i = 0; i < currentLine.length(); i++) {
            if (currentLine.charAt(i) == '\\' && currentLine.charAt(i + 1) == 'n') {
                stringBuilder.append(System.getProperty("line.separator"));
                i++;
            } else {
                stringBuilder.append(currentLine.charAt(i));
            }
        }
        return stringBuilder + getNewLine();
    }
}
