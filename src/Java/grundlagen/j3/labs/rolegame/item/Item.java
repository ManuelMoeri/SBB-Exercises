package Java.grundlagen.j3.labs.rolegame.item;

public class Item {
    private String itemName;
    private int weight;
    private String description;

    public Item(String description, int weight, String itemName) {
        this.itemName = itemName;
        this.weight = weight;
        this.description = description;
    }
}
