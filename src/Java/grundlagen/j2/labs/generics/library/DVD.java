package Java.grundlagen.j2.labs.generics.library;

import java.util.ArrayList;
import java.util.List;

public class DVD {

    private String objectTitle;
    private String artistName;
    private int amountOfSongs;
    private Boolean rented;

    public DVD(String objectTitle, String artistName, int amountOfSongs, Boolean rented) {
        this.objectTitle = objectTitle;
        this.artistName = artistName;
        this.amountOfSongs = amountOfSongs;
        this.rented = rented;
    }

    public String getObjectTitle() {
        return objectTitle;
    }

    public String getArtistName() {
        return artistName;
    }

    public int getAmountOfSongs() {
        return amountOfSongs;
    }

    public Boolean getRented() {
        return rented;
    }

    public void setRented(Boolean rented) {
        this.rented = rented;
    }

    public static List<DVD> allDVDs = new ArrayList<>();

    public static void allDVDsMethod() {
        allDVDs.add(new DVD("Get Rich Or Die Tryin'", "50 Cent", 20, false));
        allDVDs.add(new DVD("good kid, m.A.A.d city (Deluxe)", "Kendrick Lamar", 17, false));
    }
}
