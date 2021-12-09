package by.training.java.module_5.basics_of_OOP.task01;

public class Main {

    public static void main(String[] args) {
        // 1. Создать обьект класса Текстовый файл, используя классы Файл, Директория.
        // Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.

        String fileSeparator = System.getProperty("file.separator");

        TextFile textFile = new TextFile(new Directory("text.txt", "E:" + fileSeparator));

        System.out.println(textFile.getDirectory().toString());   // текущее имя и директория

        System.out.println("Создать файл:");
        textFile.createFile(textFile.getDirectory().getFullPath());


        System.out.println("Переименовать файл:");
        String newFileName = "text2.txt";
        textFile.getDirectory().setName(newFileName);
        textFile.renameFile(textFile.getDirectory().getFullPath());


        System.out.println("Дополнить файл текстом:");
        textFile.contentFile("текст текст текст");
        textFile.addFile(textFile.getContent());


        System.out.println("Содержимое файла: ");
        textFile.printContent();


        System.out.println(textFile.getDirectory().toString());  // текущее имя и директория


        System.out.println("Удалить файл:");
        textFile.deleteFile();
    }
}
