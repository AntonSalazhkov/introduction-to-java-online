package by.training.java.module_5.basics_of_OOP.task03;

import java.time.LocalDate;
import java.util.ArrayList;

public class Calendar {

    private ArrayList<Note> notes;

    public Calendar() {
        this.notes = new ArrayList<>();
    }

    public void addDay(Note... notes) {
        for (Note nt : notes) {
            this.notes.add(nt);
        }
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    class Note {

        private String holiday;
        private LocalDate date;

        public Note(LocalDate date, String holiday) {
            this.date = date;
            this.holiday = holiday;
        }

        public String getHoliday() {
            return holiday;
        }

        public LocalDate getDate() {
            return date;
        }

        @Override
        public String toString() {
            return "День: " + getDate() + " - " + getHoliday();
        }
    }
}
