package by.training.java.module_6.task02.content;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Notebook {

    private ArrayList<Note> notebook = new ArrayList();
    private String directoryCatalog = "src\\by\\training\\java\\module_6\\task02\\content\\Notebook.txt";
    private String newLine = System.getProperty("line.separator");


    public ArrayList<Note> getNotebook() {
        return notebook;
    }

    public void setNotebook(Note note) {
        this.notebook.add(note);
    }

    public String getDirectoryCatalog() {
        return directoryCatalog;
    }

    public void saveNotebook() {

        try (FileWriter fw = new FileWriter(getDirectoryCatalog())) {
            for (int i = 0; i < getNotebook().size(); i++) {
                fw.write(getNotebook().get(i).getNoteName() + newLine + getNotebook().get(i).getCreationDate() + newLine
                        + getNotebook().get(i).getEmail() + newLine + getNotebook().get(i).getText()
                        + "!*#" + newLine);                      // !*# - обозначение разделения заметок в файле
            }
            fw.flush();
            this.notebook = new ArrayList<>();     // обнуляем список, т.к. после сохранения в файл обновляем список
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void readNotebook() {
        String currentNoteText;           // текущий текст заметки
        String lineNoteText;              // строка текста заметки
        boolean textEnd;                  // конец текста заметки
        int noteNumber = 1;

        try (FileReader fr = new FileReader(getDirectoryCatalog())) {
            Scanner scan = new Scanner(fr);

            while (scan.hasNextLine()) {
                Note note = new Note();
                textEnd = false;
                currentNoteText = "";
                note.setNoteNumber(noteNumber);
                note.setNoteName(scan.nextLine());
                note.setCreationDate(scan.nextLine());
                note.setEmail(scan.nextLine());

                while (!textEnd) {
                    lineNoteText = scan.nextLine();

                    if (lineNoteText.compareTo("!*#") != 0) {            // !*# - обозначение разделения заметок в файле
                        currentNoteText += lineNoteText + newLine;

                    } else {
                        textEnd = true;
                    }
                }
                note.setText(currentNoteText);
                // добавляем заметку из файла в ArrayList
                setNotebook(note);

                noteNumber += 1;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void showNote() {
        System.out.println("Всего заметок в блокноте: " + getNotebook().size());

        for (int i = 0; i < getNotebook().size(); i++) {
            System.out.println(getNotebook().get(i).toString());
        }
    }
}
