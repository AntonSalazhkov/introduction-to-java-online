package by.training.java.module_6.task02.logic;

import by.training.java.module_6.task02.content.NewNote;
import by.training.java.module_6.task02.content.Note;
import by.training.java.module_6.task02.content.Notebook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Search {
    // После каждого добавленного параметра происходит поиск совпадений по заметкам, можно вывести
    // полученные совпадения или продолжить добавлять параметры поиска, при добавлении нового параметра
    // происходит сравнение индексов заметок предыдущих совпадений с текущими, все не удовлетворяющие
    // обоим параметрам индексы удаляются и т.д. Обнуление списка совпадений происходит при отсутствии
    // результатов поиска. Сортировка списка совпадений выполнена при отображении, сначала по имени, 
    // если одинаковые - затем по дате, затем по почте.


    // используем из NewNote класса готовые шаблоны регулярных выражений для проверки вводимой пользователем информации
    NewNote newNote = new NewNote();
    Notebook notebook = new Notebook();

    private ArrayList<Integer> searchCoincidences = new ArrayList();      // совпадения в поиске (с учетом всех выборов)
    private ArrayList<Integer> currentSearchCoincidences;                 // текущие совпадения в поиске

    private boolean coincidences = false;      // совпадения
    private String imput;
    private String NUMBER_PATTERN = "^[1-9]+\\d?$";
    private String DATE_PATTERN = "^\\d{2}\\.\\d{2}\\.\\d{4}$";

    public Search() {
        notebook.readNotebook();
    }

    public void searchByParameter() {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String number;

        do {
            currentSearchCoincidences = new ArrayList();    // обнуляем каждый цикл

            System.out.println("Добавьте параметр поиска: 1. Номер заметки | 2. Тема | 3. Дата создания " +
                    "| 4. Почта | 5. Содержание | 6. Вывести результаты поиска по выбранным параметрам | 0. Выход из подменю ");
            System.out.print("Сделайте свой выбор >> ");
            number = sc.nextLine();

            switch (number) {
                case "1":
                    searchByNumber();
                    break;
                case "2":
                    searchByNoteName();
                    break;
                case "3":
                    searchByDate();
                    break;
                case "4":
                    searchByEmail();
                    break;
                case "5":
                    searchByText();
                    break;
                case "6":
                    showResult();
                    break;
                case "0":
                    break;
            }
            if (searchCoincidences.isEmpty()) {
                searchCoincidences = currentSearchCoincidences;

            } else if (!searchCoincidences.isEmpty() && !currentSearchCoincidences.isEmpty()) {

                for (int i = 0; i < searchCoincidences.size(); ) {

                    coincidences = false;
                    for (int k = 0; k < currentSearchCoincidences.size(); k++) {
                        if (searchCoincidences.get(i) == currentSearchCoincidences.get(k)) {
                            coincidences = true;
                        }
                    }
                    if (!coincidences) {
                        searchCoincidences.remove(i);
                    } else {
                        i++;
                    }
                }
            }

        } while (!number.matches("[0]"));
    }

    public void searchByNumber() {
        coincidences = false;

        System.out.print("Введите номер заметки для поиска >> ");
        imput = newNote.inputUser(NUMBER_PATTERN);      //проверка на соответствие регулярному выражению вернет null если не соотв.
        if (imput != null) {
            for (int i = 0; i < notebook.getNotebook().size(); i++) {
                if (imput.compareToIgnoreCase(notebook.getNotebook().get(i).getNoteNumber() + "") == 0) {

                    currentSearchCoincidences.add(i);
                    coincidences = true;
                }
            }
        } else {
            System.out.println("Некорректный ввод.");
            coincidences = true; // предотвращение обнуления списка
        }
        if (!coincidences) {
            //ставим заведомо невозможное число для обнуления списка, т.к. не было ни одного совпадения
            currentSearchCoincidences.add(-1);
        }

    }

    public void searchByNoteName() {
        coincidences = false;

        System.out.print("Введите тему заметки для поиска >> ");
        imput = newNote.inputUser(newNote.getNAME_PATTERN()); //проверка на соответствие регулярному выражению вернет null если не соотв.
        if (imput != null) {
            for (int i = 0; i < notebook.getNotebook().size(); i++) {
                if (imput.compareToIgnoreCase(notebook.getNotebook().get(i).getNoteName()) == 0) {

                    currentSearchCoincidences.add(i);
                    coincidences = true;
                }
            }
        } else {
            System.out.println("Некорректный ввод.");
            coincidences = true;  // предотвращение обнуления списка
        }
        if (!coincidences) {
            //ставим заведомо невозможное число для обнуления списка, т.к. не было ни одного совпадения
            currentSearchCoincidences.add(-1);
        }
    }

    public void searchByDate() {
        coincidences = false;

        System.out.print("Введите дату заметки (в формате ДД.ММ.ГГГГ) для поиска >> ");
        imput = newNote.inputUser(DATE_PATTERN); //проверка на соответствие регулярному выражению вернет null если не соотв.
        if (imput != null) {
            for (int i = 0; i < notebook.getNotebook().size(); i++) {
                if (imput.compareToIgnoreCase(notebook.getNotebook().get(i).getCreationDate()) == 0) {

                    currentSearchCoincidences.add(i);
                    coincidences = true;
                }
            }
        } else {
            System.out.println("Некорректный ввод.");
            coincidences = true;  // предотвращение обнуления списка
        }
        if (!coincidences) {
            //ставим заведомо невозможное число для обнуления списка, т.к. не было ни одного совпадения
            currentSearchCoincidences.add(-1);
        }
    }

    public void searchByEmail() {
        coincidences = false;

        System.out.print("Введите почту заметки для поиска >> ");
        imput = newNote.inputUser(newNote.getEMAIL_PATTERN()); //проверка на соответствие регулярному выражению вернет null если не соотв.
        if (imput != null) {
            for (int i = 0; i < notebook.getNotebook().size(); i++) {
                if (imput.compareToIgnoreCase(notebook.getNotebook().get(i).getEmail()) == 0) {

                    currentSearchCoincidences.add(i);
                    coincidences = true;
                }
            }
        } else {
            System.out.println("Некорректный ввод.");
            coincidences = true;  // предотвращение обнуления списка
        }
        if (!coincidences) {
            //ставим заведомо невозможное число для обнуления списка, т.к. не было ни одного совпадения
            currentSearchCoincidences.add(-1);
        }
    }

    public void searchByText() {
        coincidences = false;
        String currentLine;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите текст заметки для поиска >> ");
        currentLine = sc.nextLine();

        String patternString = "\\b" + currentLine + "\\b";
        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);

        if (currentLine != null && currentLine != "" && currentLine != " ") {
            for (int i = 0; i < notebook.getNotebook().size(); i++) {
                Matcher matcher = pattern.matcher(notebook.getNotebook().get(i).getText());
                if (matcher.find()) {

                    currentSearchCoincidences.add(i);
                    coincidences = true;
                }
            }
        } else {
            System.out.println("Некорректный ввод.");
            coincidences = true;  // предотвращение обнуления списка
        }
        if (!coincidences) {
            //ставим заведомо невозможное число для обнуления списка, т.к. не было ни одного совпадения
            currentSearchCoincidences.add(-1);
        }
    }

    public void showResult() {
        coincidences = false;
        ArrayList<Note> sortedNotebook = new ArrayList();    // отсортированный блокнот

        // если searchCoincidences.size() = 0 или -1, то значит нет результатов и в цикл не зайдет
        // проверяем на устанавливаемое при поиске заведомо невозможное число
        if (searchCoincidences.size() > 0 && searchCoincidences.get(0) != -1) {
            for (int i = 0; i < searchCoincidences.size(); i++) {
                // добавляем в новую коллекцию для последующей сортировки
                sortedNotebook.add(notebook.getNotebook().get(searchCoincidences.get(i)));
                coincidences = true;

            }
            // Сортируем сначала по имени, если одинаковые - затем по дате, затем по почте
            sortedNotebook.sort(Comparator.comparing(Note::getNoteName).thenComparing(Note::getCreationDate).thenComparing(Note::getEmail));

            for (int i = 0; i < sortedNotebook.size(); i++) {
                System.out.println(sortedNotebook.get(i).toString());
            }
        }
        if (!coincidences) {
            System.out.println("Нет совпадений по данным значениям поиска");
        }
    }
}
