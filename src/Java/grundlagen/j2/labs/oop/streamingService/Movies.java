package Java.grundlagen.j2.labs.oop.streamingService;

import java.util.ArrayList;
import java.util.List;

public class Movies {
    private String movieName;
    private int watchTime;
    private String genre;
    private String producer;
    private boolean viewed;
    private int watchestotal;

    public Movies(String movieName, int watchTime, String genre, String producer, boolean viewed, int watchestotal) {
        this.movieName = movieName;
        this.watchTime = watchTime;
        this.genre = genre;
        this.producer = producer;
        this.viewed = viewed;
        this.watchestotal = watchestotal;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getWatchTime() {
        return watchTime;
    }

    public String getGenre() {
        return genre;
    }

    public String getProducer() {
        return producer;
    }

    public boolean getViewed() {
        return viewed;
    }

    public int getWatchestotal() {
        return watchestotal;
    }

    public void setViewed(boolean input) {
        this.viewed = input;
    }

    public void addWatchestotal(int input) {
        this.watchestotal = input + this.watchestotal;
    }
}


