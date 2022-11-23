package Java.grundlagen.j2.generics.library;

import java.util.ArrayList;
import java.util.List;

public class CD {

    private String director;
    private String genre;
    private Boolean rented;

    public CD(String director, String genre, Boolean rented) {
        this.director = director;
        this.genre = genre;
        this.rented = rented;
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

    public static List<CD> allCDs = new ArrayList<>();
}
