package by.training.java.module_4.programming_with_classes.task09;

public class Shop {

    public static void getBookList(Book[] book, String author, int parameter) {
        int outputCounter = 0;
        System.out.println("Полученный список книг: ");
        for (int i = 0; i < book.length; i++) {
            if (author.compareToIgnoreCase(book[i].getAuthor()) == 0 && parameter == 1) {
                System.out.println(book[i].getString());
                outputCounter += 1;
            }
            if (author.compareToIgnoreCase(book[i].getPublishingHouse()) == 0 && parameter == 2) {
                System.out.println(book[i].getString());
                outputCounter += 1;
            }
            if (author.compareToIgnoreCase("" + book[i].getPublicationYear()) < 0 && parameter == 3) {
                System.out.println(book[i].getString());
                outputCounter += 1;
            }
        }
        if (outputCounter == 0) {
            System.out.println("К введенному запросу нет подходящих книг в списке");
        }
    }
}
