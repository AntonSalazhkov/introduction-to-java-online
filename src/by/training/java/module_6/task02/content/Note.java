package by.training.java.module_6.task02.content;

public class Note {

    private int noteNumber;
    private String noteName;
    private String creationDate;    // дата создания
    private String email;
    private String text;
    private String newLine = System.getProperty("line.separator");

    public Note() {
    }

    public int getNoteNumber() {
        return noteNumber;
    }

    public void setNoteNumber(int noteNumber) {
        this.noteNumber = noteNumber;
    }

    public String getNoteName() {
        return noteName;
    }

    public void setNoteName(String noteName) {
        this.noteName = noteName;
    }

    public String getNewLine() {
        return newLine;
    }


    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Заметка № " + getNoteNumber() + newLine + "Тема: " + getNoteName() + newLine + "Дата создания: "
                + getCreationDate() + newLine + "Почта: " + getEmail() + newLine + "Сообщение: \n" + getText();
    }
}
