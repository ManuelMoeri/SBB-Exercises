package Java.grundlagen.j2.exams.cööp;

import java.util.ArrayList;
import java.util.List;

public class CartInventory {

    private String item1;
    private String item2;
    private String item3;
    private String item4;
    private String item5;

    public CartInventory(String item1, String item2, String item3, String item4, String item5) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
        this.item4 = item4;
        this.item5 = item5;
    }

    public String getItem1() {
        return item1;
    }
    public String getItem2() {
        return item2;
    }
    public String getItem3() {
        return item3;
    }
    public String getItem4() {
        return item4;
    }
    public String getItem5() {
        return item5;
    }

    public static List<CartInventory> wholeInventory = new ArrayList<>();

    public static void NewInventory(String userItem1, String userItem2, String userItem3, String userItem4, String userItem5) {
        CartInventory c = new CartInventory(userItem1, userItem2, userItem3, userItem4, userItem5);
        wholeInventory.add(c);
    }
}