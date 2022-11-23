package Java.grundlagen.j2.generics.library;

import java.util.ArrayList;
import java.util.List;

public class Magazine {

    private String publisher;
    private String date;
    private Boolean rented;

    public Magazine(String publisher, String date, Boolean rented) {
        this.publisher = publisher;
        this.date = date;
        this.rented = rented;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getDate() {
        return date;
    }

    public Boolean getRented() {
        return rented;
    }

    public static List<Book> allBooks = new ArrayList<>();
}
