package Java.grundlagen.j3.rolegame.armor;

public class Armor {

    private String armorName;

    private int armorWeight;

    private String armorDescription;

    public Armor(String armorName, int armorWeight, String armorDescription) {
        this.armorName = armorName;
        this.armorWeight = armorWeight;
        this.armorDescription = armorDescription;
    }

    public String getArmorName() {
        return armorName;
    }

    public int getArmorWeight() {
        return armorWeight;
    }

    public String getArmorDescription() {
        return armorDescription;
    }
}
