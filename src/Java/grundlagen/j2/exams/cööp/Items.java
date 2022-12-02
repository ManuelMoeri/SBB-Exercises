package Java.grundlagen.j2.exams.cööp;

import java.util.ArrayList;
import java.util.List;

public class Items {

    private String itemName;
    private int shelfNumber;
    private boolean QRCode;
    private String itemID;
    private int price;

    public Items(String itemName, int shelfNumber, boolean QRCode, String itemID, int price) {
        this.itemName = itemName;
        this.shelfNumber = shelfNumber;
        this.QRCode = QRCode;
        this.itemID = itemID;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public int getShelfNumber() {
        return shelfNumber;
    }

    public boolean getQRCode() {
        return QRCode;
    }

    public String getItemID() {
        return itemID;
    }

    public int getPrice() {
        return price;
    }

    public static List<Items> allItems = new ArrayList<>();

    public static void allItemsMethod() {
        allItems.add(new Items("Bread", 10, false, "f1", 2));
        allItems.add(new Items("Butter Pretzel", 1, true, "f2", 3));
        allItems.add(new Items("Deep frozen pizza", 7, true, "f3", 12));
        allItems.add(new Items("Vacuum cleaner", 12, true, "h1", 120));
        allItems.add(new Items("Washing machine", 31, true, "h2", 400));
        allItems.add(new Items("Dish dryer", 4, true, "h3", 300));
        allItems.add(new Items("Wood", 27, true, "b1", 40));
        allItems.add(new Items("Stone", 9, true, "b2", 75));
        allItems.add(new Items("Diamonds", 36, true, "b3", 10000));

    }
}
