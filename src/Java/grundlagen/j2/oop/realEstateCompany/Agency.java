package Java.grundlagen.j2.oop.realEstateCompany;

import java.util.ArrayList;
import java.util.List;

public class Agency {

    private String name;
    private String country;
    private String city;
    private String street;
    private String housenumber;


    public Agency(String name, String country, String city, String street, String housenumber) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.street = street;
        this.housenumber = housenumber;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHousenumber() {
        return housenumber;
    }

    public static List<Agency> agencyArrayList = new ArrayList<>();

    public static void newAgency() {
        agencyArrayList.add(new Agency("My Little Agency", "Switzerland", "Bern", "Bahnhofstrasse", "13"));
    }
}
