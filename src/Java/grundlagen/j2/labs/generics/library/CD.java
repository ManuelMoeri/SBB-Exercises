package Java.grundlagen.j2.labs.generics.library;

import java.util.ArrayList;
import java.util.List;

public class CD {

    private String objectTitle;
    private String director;
    private String genre;
    private Boolean rented;

    public CD(String objectTitle, String director, String genre, Boolean rented) {
        this.objectTitle = objectTitle;
        this.director = director;
        this.genre = genre;
        this.rented = rented;
    }

    public String getObjectTitle() {
        return objectTitle;
    }

    public String getDirector() {
        return director;
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

    public static List<CD> allCDs = new ArrayList<>();

    public static void allCDsMethod() {
        allCDs.add(new CD("Transformers", "Michael Bay", "Action", false));
        allCDs.add(new CD("Shaft", "Tim Story", "Action/Comedy", false));
    }
}
