package Java.grundlagen.j2.labs.oop.realEstateCompany;

import java.util.ArrayList;
import java.util.List;

public class Employees {

    private String name;
    private String email;
    private String assignedRealEstate;

    public Employees(String name, String email, String assignedRealEstate) {
        this.name = name;
        this.email = email;
        this.assignedRealEstate = assignedRealEstate;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAssignedRealEstate() {
        return assignedRealEstate;
    }

}
