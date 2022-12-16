package Java.grundlagen.j3.labs.rolegame.weapon;

public class MeleeWeapon extends Weapon {
    private int defenseValue;

    public MeleeWeapon(String weaponName, int weight, double attackValue, int defenseValue) {
        super(weaponName, weight, attackValue);
        this.defenseValue = defenseValue;
    }
}
