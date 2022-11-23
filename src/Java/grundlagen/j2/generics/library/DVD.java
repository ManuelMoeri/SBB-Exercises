package Java.grundlagen.j2.generics.library;

import java.util.ArrayList;
import java.util.List;

public class DVD {

    private String artistName;
    private int amountOfSongs;
    private Boolean rented;

    public DVD(String artistName, int amountOfSongs, Boolean rented) {
        this.artistName = artistName;
        this.amountOfSongs = amountOfSongs;
        this.rented = rented;
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

    public static List<DVD> allDVDs = new ArrayList<>();
}
