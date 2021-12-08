package by.training.java.module_5.basics_of_OOP.task01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFile extends Directory {

    private File file;

    public void createFile(String path) {
        file = new File(path);
        try {

            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Файл успешно создан");
            } else {
                System.out.println("Файл с данным именем уже существует");
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteFile() {
        if (file != null && file.exists()) {
            file.delete();

            if (!file.exists()) {
                System.out.println("Файл успешно удален");
            } else {
                System.out.println("Нет доступа к файлу");
            }

        } else {
            System.out.println("Файла с таким именем уже несуществует");
        }
    }

    public void addFile(String text) {
        if (file != null && file.exists()) {
            try {

                FileWriter fw = new FileWriter(file, true);
                fw.write(text);
                fw.flush();
                fw.close();
                System.out.println("Файл успешно дополнен");

            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Файл с исходным именем отсутствует, вначале создайте файл");
        }
    }

    public void renameFile(String path) {
        File fileNew = new File(path);

        if (file != null && file.exists()) {

            file.renameTo(fileNew);
            System.out.println("Файл успешно переименован");
            this.file = fileNew;

        } else {
            System.out.println("Файл с исходным именем отсутствует, вначале создайте файл");
        }
    }

    public void printContent() {
        if (file != null && file.exists()) {
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
        } else {
            System.out.println("Файл с исходным именем отсутствует, вначале создайте файл");
        }
    }
}
