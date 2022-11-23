package Java.grundlagen.j2.oop.streamingService;

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

    public static List<Movies> moviesArrayList = new ArrayList<>();

    public static void allmoviesMethod() {
        moviesArrayList.add(new Movies("The Lost World", 123, "Adventure", "Michael Bay", false, 0));
        moviesArrayList.add(new Movies("The Bourne Ultimatum", 146, "Crime", "Christopher Nolan", false, 0));
        moviesArrayList.add(new Movies("Interstellar", 123, "SciFi", "Christopher Nolan", false, 0));
        moviesArrayList.add(new Movies("It", 128, "Horror", "Steven King", false, 0));
        moviesArrayList.add(new Movies("Star Wars IV: A new hope", 132, "SciFi", "George Lucas", false, 0));
        moviesArrayList.add(new Movies("Transformers", 143, "SciFi", "Steven Spielberg", false, 0));
        moviesArrayList.add(new Movies("The Day After Tomorrow", 104, "SciFi", "Michael Bay", false, 0));
        moviesArrayList.add(new Movies("Jurassic Park 1", 153, "Horror Thriller", "Steven Spielberg", false, 0));
    }
}


