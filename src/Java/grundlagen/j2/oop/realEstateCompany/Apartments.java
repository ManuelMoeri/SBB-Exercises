package Java.grundlagen.j2.oop.realEstateCompany;

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

    public static List<Apartments> allApartments = new ArrayList<>();

    public static void allApartmentsMethod() {
        allApartments.add(new Apartments("RS_1", 2, 12, "A nice little apartment with a beautiful view on bern. ", "Paul Fred", false));
        allApartments.add(new Apartments("RS_1", 1, 7, "Not quite as good a view as apartment 12 but stylishly furnished. ", "Paul Fred", true));
        allApartments.add(new Apartments("RS_2", 3, 17, "A really big apartment with a nice view. ", "Fred Fritz", false));
        allApartments.add(new Apartments("RS_2", 1, 3, "A small apartment which is well equiped with any kind of tools.", "Fred Fritz", true));
        allApartments.add(new Apartments("RS_3", 1, 6, "A big apartment with 2 bedrooms and 2 toilets. ", "Fritz Paul", false));
        allApartments.add(new Apartments("RS_3", 1, 2, "A little smaller than apartment 6 but still quite big and looks really nice inside. ", "Fritz Paul", true));
    }
}
