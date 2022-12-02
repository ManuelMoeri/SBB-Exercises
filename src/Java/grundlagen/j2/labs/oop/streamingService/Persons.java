package Java.grundlagen.j2.labs.oop.streamingService;

import java.util.ArrayList;
import java.util.List;

public class Persons {

    private String name;
    private String email;
    private String creditCard;
    private boolean payYearMonth;


    public Persons(String name, String email, String creditCard, boolean payYearMonth) {
        this.name = name;
        this.email = email;
        this.creditCard = creditCard;
        this.payYearMonth = payYearMonth;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public boolean getPayYearMonth() {
        return payYearMonth;
    }


    public void setCreditCard(String input) {
        this.creditCard = input;
    }

    public static List<Persons> allPersons = new ArrayList<>();

    public static Persons c;

    public static void NewSubs(String nameOfCustomer, String emailOfCustomer, String creditcardOfCustomer, boolean payMethodOfCustomer) {
        c = new Persons(nameOfCustomer, emailOfCustomer, creditcardOfCustomer, payMethodOfCustomer);
        allPersons.add(c);
    }
}
