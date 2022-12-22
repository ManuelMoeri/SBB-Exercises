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
}
