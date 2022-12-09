package Java.grundlagen.j2.exams.cööp;

import java.util.ArrayList;
import java.util.List;

public class Schüpercard {

    private String schüpercardID;
    private String owner;
    private String expirationDate;

    public Schüpercard(String schüpercardID, String owner, String expirationDate) {
        this.schüpercardID = schüpercardID;
        this.owner = owner;
        this.expirationDate = expirationDate;
    }

    public String getSchüpercardID() {
        return schüpercardID;
    }

    public String getOwner() {
        return owner;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public static List<Schüpercard> allSchüpercards = new ArrayList<>();

    public static void allSchüpercardsMethod() {
        allSchüpercards.add(new Schüpercard("12345", "Sven Schmid", "1.12. 2024"));
        allSchüpercards.add(new Schüpercard("32632", "Neil Ramseier", "4.5. 2023"));
        allSchüpercards.add(new Schüpercard("82941", "Gurung Rahul", "21.5. 2023"));
        allSchüpercards.add(new Schüpercard("62032", "Yanir Gopal", "28.9. 2024"));
        allSchüpercards.add(new Schüpercard("29751", "Andrin Gurtner", "12.11. 2023"));
    }
}