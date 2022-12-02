package Java.grundlagen.j2.labs.generics.library;

import java.util.ArrayList;
import java.util.List;

public class Magazine {

    private String objectTitle;
    private String publisher;
    private String date;
    private Boolean rented;

    public Magazine(String objectTitle,String publisher, String date, Boolean rented) {
        this.objectTitle = objectTitle;
        this.publisher = publisher;
        this.date = date;
        this.rented = rented;
    }

    public String getObjectTitle() {
        return objectTitle;
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

    public void setRented(Boolean rented) {
        this.rented = rented;
    }

    public static List<Magazine> allMagazines = new ArrayList<>();

    public static void allMagazinesMethod() {
        allMagazines.add(new Magazine("The moon", "Universe & co.", "10.11.2022", false));
        allMagazines.add(new Magazine("Now", "Time is short", "22.11.2022", false));
    }
}
