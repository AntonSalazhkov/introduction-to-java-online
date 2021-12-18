package by.training.java.module_5.basics_of_OOP.task03;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // 3. Создать класс календарь с внутренним классом, с помощью обьектов которого
        // можно хранить информацию о выходных и праздничных днях.

        Calendar calendar = new Calendar();

        LocalDate date = LocalDate.of(2021, 12, 25);
        LocalDate date1 = LocalDate.of(2022, 01, 01);

        Calendar.Note note = calendar.new Note(date, "Christmas");
        Calendar.Note note1 = calendar.new Note(date1, "New Year");

        calendar.addDay(note, note1);

        System.out.println(calendar.getNotes().toString());

    }
}
