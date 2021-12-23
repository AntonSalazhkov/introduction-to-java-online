package by.training.java.module_5.basics_of_OOP.task04.logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFile {

    String fileSeparator = System.getProperty("file.separator");
    String path = "data" + fileSeparator + "Dungeon.txt";
    private File file;

    public boolean createFile() {
        file = new File(path);
        try {

            if (!file.exists()) {
                file.createNewFile();
                return true;
            } else {
                file.delete();
                file.createNewFile();
                return true;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Не удалось найти папку \"data\" в корне проекта");
        }
        return false;
    }

    public void deleteFile() {
        if (file != null && file.exists()) {
            file.delete();
        }
    }

    public void addFile(String text) {
        try {

            FileWriter fw = new FileWriter(file, true);
            fw.write(text);
            fw.flush();
            fw.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void printContent() {
        try (FileReader fr = new FileReader(file)) {

            Scanner scan = new Scanner(fr);

            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
