package Java.grundlagen.j2.generics.library;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String author;
    private String genre;

    public Book(String author, String genre) {
        this.author = author;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public static List<Book> allBooks = new ArrayList<>();
}
