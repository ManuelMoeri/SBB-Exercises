package Java.grundlagen.j2.exams.cööp;

import java.util.ArrayList;
import java.util.List;

public class Companys {

    private String name;
    private String location;
    private String companyID;

    public Companys(String name, String location, String companyID) {
        this.name = name;
        this.location = location;
        this.companyID = companyID;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getCompanyID() {
        return companyID;
    }

    public static List<Companys> allCompanys = new ArrayList<>();

    public static List<Items> com1 = new ArrayList<>();
    public static List<Items> com2 = new ArrayList<>();
    public static List<Items> com3 = new ArrayList<>();

    public static void allCompanysMethod() {
        allCompanys.add(new Companys("Cööp am Bahnhof", "Bahnhofstrasse 31", "com1"));
        allCompanys.add(new Companys("Cööp Innenstadt", "Baumgartenstrasse 7", "com2"));
        allCompanys.add(new Companys("Cööp an der Loraine", "Lorainengasse 12", "com3"));

        com1.add(Items.allItems.get(0));
        com1.add(Items.allItems.get(1));
        com2.add(Items.allItems.get(2));
        com3.add(Items.allItems.get(3));
        com2.add(Items.allItems.get(4));
        com1.add(Items.allItems.get(5));
        com3.add(Items.allItems.get(6));
        com3.add(Items.allItems.get(7));
        com2.add(Items.allItems.get(8));
    }
}
