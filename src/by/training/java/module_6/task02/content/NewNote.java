package by.training.java.module_6.task02.content;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NewNote extends Note {

    private String NAME_PATTERN = "^[a-zA-Z0-9а-яА-Я]+$";
    private String EMAIL_PATTERN = "^.+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,4})$";

    public NewNote() {
    }

    public void setNewNote() {

        setNewNoteName();

        setNewCreationDate();

        setNewEmail();

        setNewText();
    }

    public String getNAME_PATTERN() {
        return NAME_PATTERN;
    }

    public String getEMAIL_PATTERN() {
        return EMAIL_PATTERN;
    }

    public void setNewNoteName() {
        boolean correctInput = false;
        String line;

        while (!correctInput) {

            System.out.print("Введите тему заметки >> ");
            line = inputUser(NAME_PATTERN);
            if (line != null) {
                correctInput = true;

                super.setNoteName(line);

            } else {
                System.out.println("Некорректный ввод. Тема заметки должна состоять из " +
                        "букв (a-z) или (а-я), цифр(0-9), длинной от 1 символа");
            }
        }
    }

    public void setNewCreationDate() {
        Date dateNow = new Date();       // задаем текущую дату
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");

        super.setCreationDate(formatForDateNow.format(dateNow));
    }

    public void setNewEmail() {
        boolean correctInput = false;
        String line;

        while (!correctInput) {

            System.out.print("Введите email >> ");
            line = inputUser(EMAIL_PATTERN);
            if (line != null) {
                correctInput = true;

                super.setEmail(line);

            } else {
                System.out.println("Некорректный ввод.");
            }
        }
    }

    public void setNewText() {

        Scanner sc = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        String currentLine;

        System.out.print("Введите текст заметки (\\n - для новой строки) >> ");
        currentLine = sc.nextLine();

        for (int i = 0; i < currentLine.length(); i++) {
            if (currentLine.charAt(i) == '\\' && currentLine.charAt(i + 1) == 'n') {
                stringBuilder.append(getNewLine());
                i++;
            } else {
                stringBuilder.append(currentLine.charAt(i));
            }
        }
        super.setText(stringBuilder + getNewLine());
    }

    public String inputUser(String pattern) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String imput = sc.nextLine();

        if (imput.matches(pattern)) {
            return imput;
        } else {
            return null;
        }
    }
}
