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


    public static List<Employees> allEmployees = new ArrayList<>();


    public static void allEmployeesMethod() {
        allEmployees.add(new Employees("Paul Fred", "paul@mylittleagency.ch", "#1"));
        allEmployees.add(new Employees("Fred Fritz", "fred@mylittleagency.ch", "#2"));
        allEmployees.add(new Employees("Fritz Paul", "fritz@mylittleagency.ch", "#3"));
    }
}
