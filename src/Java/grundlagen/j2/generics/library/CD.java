package Java.grundlagen.j2.generics.library;

import java.util.ArrayList;
import java.util.List;

public class CD {

    private String director;
    private String genre;

    public CD(String director, String genre) {
        this.director = director;
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public static List<CD> allCDs = new ArrayList<>();
}
