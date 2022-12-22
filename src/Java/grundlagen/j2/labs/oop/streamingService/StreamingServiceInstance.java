package Java.grundlagen.j2.labs.oop.streamingService;

import java.util.ArrayList;
import java.util.List;

public class StreamingServiceInstance {

    public static List<Movies> moviesArrayList = new ArrayList<>();

    public static List<Persons> allPersons = new ArrayList<>();

    public static Persons c;

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

    public static void NewSubs(String nameOfCustomer, String emailOfCustomer, String creditcardOfCustomer, boolean payMethodOfCustomer) {
        c = new Persons(nameOfCustomer, emailOfCustomer, creditcardOfCustomer, payMethodOfCustomer);
        allPersons.add(c);
    }
}
