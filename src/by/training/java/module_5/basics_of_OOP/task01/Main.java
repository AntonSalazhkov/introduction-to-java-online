package by.training.java.module_5.basics_of_OOP.task01;

public class Main {

    public static void main(String[] args) {
        // 1. Создать обьект класса Текстовый файл, используя классы Файл, Директория.
        // Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.

        String fileSeparator = System.getProperty("file.separator");

        File file = new File(new Directory("text.txt", "E:" + fileSeparator));

        System.out.println(file.getDirectory().toString());   // текущее имя и директория

        System.out.println("Создать файл:");
        file.createFile(file.getDirectory().getFullPath());


        System.out.println("Переименовать файл:");
        String newFileName = "text2.txt";
        file.getDirectory().setName(newFileName);
        file.renameFile(file.getDirectory().getFullPath());


        System.out.println("Дополнить файл текстом:");
        file.contentFile("текст текст текст");
        file.addFile(file.getContent());


        System.out.println("Содержимое файла: ");
        file.printContent();


        System.out.println(file.getDirectory().toString());  // текущее имя и директория


        System.out.println("Удалить файл:");
        file.deleteFile();
    }
}
