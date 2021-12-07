package by.training.java.module_5.basics_of_OOP.task01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFile extends UserFile {

    public TextFile(Directory directory) {
        super(directory);
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

    public void renameFile(String newFileName) {
        String fullNewPathOfFile = null;
        fullNewPathOfFile = pathOfFile + newFileName + ".txt";
        File fileNew = new File(fullNewPathOfFile);

        if (file != null && file.exists()) {

            file.renameTo(fileNew);
            System.out.println("Файл успешно переименован");
            super.file = fileNew;

        } else {
            System.out.println("Файл с исходным именем отсутствует, вначале создайте файл");
        }
    }

    public void printContent() {
        if (file != null && file.exists()) {
            try (FileReader fr = new FileReader(file)) {

                Scanner scan = new Scanner(fr);
                System.out.println("Имеющийся текст в файле:");

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
