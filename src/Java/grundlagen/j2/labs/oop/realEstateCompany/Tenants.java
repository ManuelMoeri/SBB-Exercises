package Java.grundlagen.j2.labs.oop.realEstateCompany;

import java.util.ArrayList;
import java.util.List;

public class Tenants {

    private String name;
    private String email;
    private String gender;
    private String dateOfBirth;
    private String customerID;


    public Tenants(String name, String email, String gender, String dateOfBirth, String customerID) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCustomerID() {
        return customerID;
    }

    public static List<Tenants> allCustomers = new ArrayList<>();

    public static void allCustomersMethod() {
       allCustomers.add(new Tenants("Thomas Dänzer", "daenzer@bluewin.ch", "Male", "24.7. 1980", "#1"));
       allCustomers.add(new Tenants("Jannik Alabor", "alabor@gmail.com", "Male", "1.9. 2002", "#2"));
       allCustomers.add(new Tenants("Kimi Pulfer", "pulfer@bluemail.ch", "Male", "28.2. 2000", "#3"));
       allCustomers.add(new Tenants("Lina Müller", "mueller@sbb.ch", "Female", "5.7. 1989", "#4"));
       allCustomers.add(new Tenants("Alex Küffer", "kueffer@bluewin.ch", "Male", "21.9. 1967", "#5"));
       allCustomers.add(new Tenants("Laura Eggimann", "eggimann@bluemail.ch", "Female", "14.2. 2003", "#6"));
       allCustomers.add(new Tenants("Amelie Hirschi", "hirschi@gmail.ch", "Female", "19.8. 1996", "#7"));
       allCustomers.add(new Tenants("Basil Strähl", "straehl@gmail.ch", "Male", "21.4. 1999", "#8"));
       allCustomers.add(new Tenants("Luana Wolf", "wolf@sbb.ch", "Female", "29.2. 1984", "#9"));
    }
}
