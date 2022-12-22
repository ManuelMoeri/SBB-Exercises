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
}