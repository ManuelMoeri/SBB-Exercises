package Java.grundlagen.j2.labs.oop.realEstateCompany;

import java.util.ArrayList;
import java.util.List;

public class RealEstateInstance {
    public static List<Tenants> allCustomers = new ArrayList<>();
    public static List<RentalAgreements> allAgreements = new ArrayList<>();
    public static List<RealEstates> allImmobillies = new ArrayList<>();
    public static List<Employees> allEmployees = new ArrayList<>();
    public static List<Apartments> allApartments = new ArrayList<>();
    public static List<Agency> agencyArrayList = new ArrayList<>();

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

    public static void allAgreementsMethod() {
        allAgreements.add(new RentalAgreements(365, 1500, "#1", "RS_1", "12", "AID_1"));
        allAgreements.add(new RentalAgreements(243, 4000, "#2", "RS_2", "17", "AID_2"));
        allAgreements.add(new RentalAgreements(672, 2000, "#7", "RS_3", "6", "AID_3"));
    }

    public static void allImmobilliesMethod() {
        allImmobillies.add(new RealEstates("RS_1", "Bern", "Bärengasse", "34"));
        allImmobillies.add(new RealEstates("RS_2", "Bern", "Speicherstrasse", "8"));
        allImmobillies.add(new RealEstates("RS_3", "Bern", "Bahnhofgasse", "12"));
    }

    public static void allEmployeesMethod() {
        allEmployees.add(new Employees("Paul Fred", "paul@mylittleagency.ch", "#1"));
        allEmployees.add(new Employees("Fred Fritz", "fred@mylittleagency.ch", "#2"));
        allEmployees.add(new Employees("Fritz Paul", "fritz@mylittleagency.ch", "#3"));
    }

    public static void allApartmentsMethod() {
        allApartments.add(new Apartments("RS_1", 2, 12, "A nice little apartment with a beautiful view on bern. ", "Paul Fred", false));
        allApartments.add(new Apartments("RS_1", 1, 7, "Not quite as good a view as apartment 12 but stylishly furnished. ", "Paul Fred", true));
        allApartments.add(new Apartments("RS_2", 3, 17, "A really big apartment with a nice view. ", "Fred Fritz", false));
        allApartments.add(new Apartments("RS_2", 1, 3, "A small apartment which is well equiped with any kind of tools.", "Fred Fritz", true));
        allApartments.add(new Apartments("RS_3", 1, 6, "A big apartment with 2 bedrooms and 2 toilets. ", "Fritz Paul", false));
        allApartments.add(new Apartments("RS_3", 1, 2, "A little smaller than apartment 6 but still quite big and looks really nice inside. ", "Fritz Paul", true));
    }

    public static void newAgencyMethod() {
        agencyArrayList.add(new Agency("My Little Agency", "Switzerland", "Bern", "Bahnhofstrasse", "13"));
    }
}
