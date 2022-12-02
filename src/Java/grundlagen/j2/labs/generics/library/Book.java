package Java.grundlagen.j2.labs.generics.library;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String objectTitle;
    private String author;
    private String genre;
    private Boolean rented;

    public Book(String objectTitle, String author, String genre, Boolean rented) {
        this.objectTitle = objectTitle;
        this.author = author;
        this.genre = genre;
        this.rented = rented;
    }

    public String getObjectTitle() {
        return objectTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public Boolean getRented() {
        return rented;
    }

    public void setRented(Boolean rented) {
        this.rented = rented;
    }

    public static List<Book> allBooks = new ArrayList<>();

    public static void allBooksMethod() {
        allBooks.add(new Book("Harry Potter", "J.K. Rowling", "Fantasy", false));
        allBooks.add(new Book("The boys", "Me", "The boys", false));
    }
}
