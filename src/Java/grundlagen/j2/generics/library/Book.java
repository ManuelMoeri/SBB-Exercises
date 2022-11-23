package Java.grundlagen.j2.generics.library;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String author;
    private String genre;
    private Boolean rented;

    public Book(String author, String genre, Boolean rented) {
        this.author = author;
        this.genre = genre;
        this.rented = rented;
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

    public static List<Book> allBooks = new ArrayList<>();
}
