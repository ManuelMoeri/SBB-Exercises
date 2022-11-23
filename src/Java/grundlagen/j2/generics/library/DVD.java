package Java.grundlagen.j2.generics.library;

import java.util.ArrayList;
import java.util.List;

public class DVD {

    private String artistName;
    private int amountOfSongs;

    public DVD(String artistName, int amountOfSongs) {
        this.artistName = artistName;
        this.amountOfSongs = amountOfSongs;
    }

    public String getArtistName() {
        return artistName;
    }

    public int getAmountOfSongs() {
        return amountOfSongs;
    }

    public static List<DVD> allDVDs = new ArrayList<>();
}
