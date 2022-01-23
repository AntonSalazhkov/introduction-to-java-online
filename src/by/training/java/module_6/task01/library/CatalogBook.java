package by.training.java.module_6.task01.library;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CatalogBook {

    String newLine = System.getProperty("line.separator");
    private ArrayList<Book> books = new ArrayList<>();
    private String directoryCatalog = "src\\by\\training\\java\\module_6\\task01\\library\\CatalogBooks.txt";

    public CatalogBook() {
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public boolean setBooks(Book book) {
        boolean correctInput = true;
        for (int i = 0; i < getBooks().size(); i++) {
            if (book.getBookTitle().compareToIgnoreCase(getBooks().get(i).getBookTitle()) == 0) { //проверка на повторный ввод книги по названию
                correctInput = false;
            }
        }
        if (book.getBookTitle() != "" && book.getAuthor() != "" && book.getBookDescription() != "") {
            if (correctInput) {
                this.books.add(book);
            } else {
                System.out.println("Книга с таким названием уже присутствует в каталоге");
            }
        } else {
            System.out.println("Некорректный ввод. Одно или несколько значений не были введены.");
            correctInput = false;
        }
        return correctInput;
    }

    public void setEditableBook(ArrayList<Book> newCatalogBooks) {
        this.books = newCatalogBooks;
    }

    public String getDirectoryCatalog() {
        return directoryCatalog;
    }

    public void saveBook() {

        try (FileWriter fw = new FileWriter(getDirectoryCatalog())) {
            for (int i = 0; i < getBooks().size(); i++) {
                fw.write(getBooks().get(i).getBookTitle() + newLine + getBooks().get(i).getAuthor() + newLine
                        + getBooks().get(i).getBookVersion() + newLine + getBooks().get(i).getBookDescription()
                        + "!*#" + newLine);             // !*# - обозначение разделения книг в файле
            }
            fw.flush();
            setEditableBook(new ArrayList<>());     // обнуляем список, т.к. после сохранения в файл обновляем список
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void readCatalogBook() {
        String currentBookDescription;   // текущее описание книги
        String lineBookDescription;      // строка описания книги
        boolean paragraphEnd;            // конец описания и книги в целом
        int bookNumber = 1;

        try (FileReader fr = new FileReader(getDirectoryCatalog())) {
            Scanner scan = new Scanner(fr);

            while (scan.hasNextLine()) {
                Book book = new Book();
                paragraphEnd = false;
                currentBookDescription = "";
                book.setBookNumber(bookNumber);
                book.setBookTitle(scan.nextLine());
                book.setAuthor(scan.nextLine());
                book.setBookVersion(scan.nextLine());

                while (!paragraphEnd) {
                    lineBookDescription = scan.nextLine();

                    if (lineBookDescription.compareTo("!*#") != 0) {   // !*# - обозначение разделения книг в файле
                        currentBookDescription += lineBookDescription + newLine;

                    } else {
                        paragraphEnd = true;
                    }
                }
                book.setBookDescription(currentBookDescription);
                // добавляем книгу из файла в ArrayList
                setBooks(book);

                bookNumber += 1;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public int bookSearch(String inputUser) {
        int currentBookNumber = -1;              // присваиваем по умолчанию невозможный номер книги
        for (int i = 0; i < getBooks().size(); i++) {
            if (inputUser.compareToIgnoreCase(getBooks().get(i).getBookTitle()) == 0) {
                currentBookNumber = i;
            }
        }
        if (currentBookNumber < 0) {
            System.out.println("Книга с таким названием отсутствует в каталоге.");
        }
        return currentBookNumber;
    }

    public void showLibrary() {
        System.out.println("Всего книг в библиотеке: " + getBooks().size());
        System.out.print("Выберите количество книг на странице ");

        int numberUser = inputUser(1, getBooks().size(), -1); // -1 - просто отриц. число, т.к. здесь эта функция не используется
        int currentPage = 1;                                                             // по умолчанию начинаем с первой страницы
        int currentBookNumber = 0;
        int userChoice;
        boolean end = false;

        int endPage = (int) ((double) getBooks().size() / numberUser + 0.99);    // если число не целое, например 2,1 - то будет 3 страницы

        while (!end) {

            for (int i = currentBookNumber; i <= currentBookNumber + numberUser - 1 && i < getBooks().size(); i++) {
                System.out.println(getBooks().get(i).toString());
            }

            System.out.println();
            if (currentPage == 1 && currentPage != endPage) {
                System.out.println("2. Следующая страница " + "| 3. Выход из просмотра.");
                userChoice = inputUser(2, 3, -1);

                if (userChoice == 2) {
                    currentPage += 1;
                    currentBookNumber += numberUser;

                } else {
                    end = true;
                }
            } else if (currentPage > 1 && currentPage != endPage) {
                System.out.println("1. Предыдущая страница " + "|2. Следующая страница " + "| 3. Выход из просмотра.");
                userChoice = inputUser(1, 3, -1);
                if (userChoice == 1) {
                    currentPage -= 1;
                    currentBookNumber -= numberUser;

                } else if (userChoice == 2) {
                    currentPage += 1;
                    currentBookNumber += numberUser;

                } else {
                    end = true;
                }
            } else if (currentPage == endPage && currentPage != 1) {
                System.out.println("1. Предыдущая страница " + "| 3. Выход из просмотра.");
                userChoice = inputUser(1, 3, 2);     // исключаем возможность выбора 2
                if (userChoice == 1) {
                    currentPage -= 1;
                    currentBookNumber -= numberUser;

                } else {
                    end = true;
                }
            } else {                       // если страница всего 1 то не выводим меню выбора
                end = true;
            }
        }
    }

    public int inputUser(int minNumber, int maxNumber, int impossibleNumber) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print(">> ");

        do {
            while (!sc.hasNextInt()) {
                sc.nextLine();
                System.out.print("Некорректный ввод. Повторите ввод >> ");
            }
            number = sc.nextInt();
            if (number < minNumber || number > maxNumber || number == impossibleNumber) {
                System.out.print("Некорректный ввод. Повторите ввод >> ");
            }
        } while (number < minNumber || number > maxNumber || number == impossibleNumber);

        return number;
    }
}
