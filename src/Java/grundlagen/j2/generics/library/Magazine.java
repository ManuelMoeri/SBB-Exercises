package Java.grundlagen.j2.generics.library;

import java.util.ArrayList;
import java.util.List;

public class Magazine {

    private String publisher;
    private String date;

    public Magazine(String publisher, String date) {
        this.publisher = publisher;
        this.date = date;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getDate() {
        return date;
    }

    public static List<Book> allBooks = new ArrayList<>();
}
