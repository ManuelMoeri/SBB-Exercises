package Java.grundlagen.j3.rolegame.weapon;


public class Weapon {
    private String weaponName;
    private int weight;
    private double attackValue;
    public Weapon (String weaponName, int weight, double attackValue) {
        this.weaponName = weaponName;
        this.weight = weight;
        this.attackValue = attackValue;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public double getAttackValue() {
        return attackValue;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAttackValue(double attackValue) {
        this.attackValue = attackValue;
    }
}
