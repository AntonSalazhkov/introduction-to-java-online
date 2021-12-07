package by.training.java.module_5.basics_of_OOP.task01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UserFile {

    protected String pathOfFile;
    protected File file;

    public UserFile(Directory directory) {
        pathOfFile = directory.getPathOfFile();
    }

    public void createFile(String nameFile) {
        String fullPathOfFile = null;
        fullPathOfFile = pathOfFile + nameFile + ".txt";
        file = new File(fullPathOfFile);

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
}
