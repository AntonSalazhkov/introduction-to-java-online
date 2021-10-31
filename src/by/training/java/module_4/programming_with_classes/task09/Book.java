package by.training.java.module_4.programming_with_classes.task09;

public class Book {

    private int id;
    private String bookTitle;
    private String author;
    private String publishingHouse;
    private int publicationYear;
    private int pagesNumber;
    private int price;
    private String bindingType;
    //id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.

    public Book(int id, String bookTitle, String author, String publishingHouse, int publicationYear, int pagesNumber,
                int price, String bindingType) {
        setId(id);
        setBookTitle(bookTitle);
        setAuthor(author);
        setPublishingHouse(publishingHouse);
        setPublicationYear(publicationYear);
        setPagesNumber(pagesNumber);
        setPrice(price);
        setBindingType(bindingType);
    }

    public static void toString(Book[] book) {
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i].getString());
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public String getString() {
        return "Id: " + getId() + ", book title: " + getBookTitle() + ", author: " + getAuthor() + ", publishing house: "
                + getPublishingHouse() + ", publication year: " + getPublicationYear() + ", pages number: " + getPagesNumber()
                + ", price: " + getPrice() + ", binding type: " + getBindingType();
    }
}
