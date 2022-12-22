package Java.grundlagen.j2.labs.oop.realEstateCompany;

import java.util.ArrayList;
import java.util.List;

public class Apartments {

    private String realEstateId;
    private int floor;
    private int apartmentNumber;
    private String description;
    private String keeper;
    private boolean empty;

    public Apartments(String realEstateId, int floor, int apartmentNumber, String description, String keeper, boolean empty) {
        this.realEstateId = realEstateId;
        this.floor = floor;
        this.apartmentNumber = apartmentNumber;
        this.description = description;
        this.keeper = keeper;
        this.empty = empty;
    }

    public String getRealEstateId() {
        return realEstateId;
    }

    public int getFloor() {
        return floor;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public String getDescription() {
        return description;
    }

    public String getKeeper() {
        return keeper;
    }

    public boolean getEmpty() {
        return empty;
    }

}
