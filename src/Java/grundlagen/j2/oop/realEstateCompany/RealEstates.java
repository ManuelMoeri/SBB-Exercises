package Java.grundlagen.j2.oop.realEstateCompany;

import java.util.ArrayList;
import java.util.List;

public class RealEstates {

    private String id;
    private String city;
    private String street;
    private String housenumber;


    public RealEstates(String id, String city, String street, String housenumber) {
        this.id = id;
        this.city = city;
        this.street = street;
        this.housenumber = housenumber;
    }

    public String getId() {
        return id;
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


    public static List<RealEstates> allImmobillies = new ArrayList<>();

    public static void allImmobilliesMethod() {
        allImmobillies.add(new RealEstates("RS_1", "Bern", "Bärengasse", "34"));
        allImmobillies.add(new RealEstates("RS_2", "Bern", "Speicherstrasse", "8"));
        allImmobillies.add(new RealEstates("RS_3", "Bern", "Bahnhofgasse", "12"));
    }
}