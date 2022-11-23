package Java.grundlagen.j2.oop.addressbook;

import java.util.ArrayList;
import java.util.List;

public class Adressbook {

    private String email;
    private String name;
    private String phoneNumber;


    public Adressbook(String email, String name, String phoneNumber) {
        this.email = email;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {return email;}
    public String getName() {return name;}
    public String getPhoneNumber() {return phoneNumber;}

    public static List<Adressbook> allContacts = new ArrayList<>();

    public static void NewAdressbook(String mailInputFromUser, String nameInputFromUser, String phoneNumberInputFromUser) {
        Adressbook c = new Adressbook(mailInputFromUser, nameInputFromUser, phoneNumberInputFromUser);
        allContacts.add(c);
    }
}