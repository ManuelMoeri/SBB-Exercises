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

    public static void allCompanysMethod() {
        allCompanys.add(new Companys("Cööp am Bahnhof", "Bahnhofstrasse 31", "com1"));
        allCompanys.add(new Companys("Cööp Innenstadt", "Baumgartenstrasse 7", "com2"));
        allCompanys.add(new Companys("Cööp an der Loraine", "Lorainengasse 12", "com3"));

    }
}
