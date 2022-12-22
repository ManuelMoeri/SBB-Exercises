package Java.grundlagen.j2.exams.cööp;

import java.util.ArrayList;
import java.util.List;

public class CööpInstances {

    public static List<Items> allItems = new ArrayList<>();
    public static List<Employees> allEmployees = new ArrayList<>();
    public static List<CartInventory> wholeInventory = new ArrayList<>();
    public static List<Schüpercard> allSchüpercards = new ArrayList<>();

    public static List<Companys> allCompanys = new ArrayList<>();

    public static List<Items> com1 = new ArrayList<>();
    public static List<Items> com2 = new ArrayList<>();
    public static List<Items> com3 = new ArrayList<>();

    public static void allItemsMethod() {
        allItems.add(new Items("Bread", 10, false, "f1", 2));
        allItems.add(new Items("Butter pretzel", 1, true, "f2", 3));
        allItems.add(new Items("Deep frozen pizza", 7, true, "f3", 12));
        allItems.add(new Items("Vacuum cleaner", 12, true, "h1", 120));
        allItems.add(new Items("Washing machine", 31, true, "h2", 400));
        allItems.add(new Items("Dish dryer", 4, true, "h3", 300));
        allItems.add(new Items("Wood", 27, true, "b1", 40));
        allItems.add(new Items("Stone", 9, true, "b2", 75));
        allItems.add(new Items("Diamonds", 36, true, "b3", 10000));
    }

    public static void allEmployeesMethod() {
        allEmployees.add(new Employees("Jannik Pulfer", "12.12. 2000", "Male", "com1"));
        allEmployees.add(new Employees("Carina Lüscher", "7.2. 2000", "Female", "com3"));
        allEmployees.add(new Employees("Amelie Marx", "1.9. 2000", "Female", "com2"));
        allEmployees.add(new Employees("Basil Kocher", "24.4. 2000", "Male", "com3"));
        allEmployees.add(new Employees("Alex Alabor", "29.8. 2000", "Male", "com1"));
        allEmployees.add(new Employees("Lina Dubler", "15.11. 2000", "Female", "com2"));
    }

    public static void allCompanysMethod() {
        allCompanys.add(new Companys("Cööp am Bahnhof", "Bahnhofstrasse 31", "com1"));
        allCompanys.add(new Companys("Cööp Innenstadt", "Baumgartenstrasse 7", "com2"));
        allCompanys.add(new Companys("Cööp an der Loraine", "Lorainengasse 12", "com3"));

        com1.add(allItems.get(0));
        com1.add(allItems.get(1));
        com2.add(allItems.get(2));
        com3.add(allItems.get(3));
        com2.add(allItems.get(4));
        com1.add(allItems.get(5));
        com3.add(allItems.get(6));
        com3.add(allItems.get(7));
        com2.add(allItems.get(8));
    }

    public static void NewInventory(String userItem1, String userItem2, String userItem3, String userItem4, String userItem5) {
        CartInventory c = new CartInventory(userItem1, userItem2, userItem3, userItem4, userItem5);
        wholeInventory.add(c);
    }

    public static void allSchüpercardsMethod() {
        allSchüpercards.add(new Schüpercard("12345", "Sven Schmid", "1.12. 2024"));
        allSchüpercards.add(new Schüpercard("32632", "Neil Ramseier", "4.5. 2023"));
        allSchüpercards.add(new Schüpercard("82941", "Gurung Rahul", "21.5. 2023"));
        allSchüpercards.add(new Schüpercard("62032", "Yanir Gopal", "28.9. 2024"));
        allSchüpercards.add(new Schüpercard("29751", "Andrin Gurtner", "12.11. 2023"));
    }
}
