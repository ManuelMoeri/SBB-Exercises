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
}
