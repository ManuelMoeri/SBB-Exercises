package Java.grundlagen.j3.rolegame.item;

public class Item {
    private String itemName;
    private int weight;
    private String description;

    public Item(String itemName, int weight, String description) {
        this.itemName = itemName;
        this.weight = weight;
        this.description = description;
    }

    public int getWeight() {
        return weight;
    }

    public String getItemName() {
        return itemName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }
}
