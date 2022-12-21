package Java.grundlagen.j3.labs.rolegame.weapon;

public class MeleeWeapon extends Weapon {
    private int defenseValue;

    public MeleeWeapon(String weaponName, int weight, double attackValue, int defenseValue) {
        super(weaponName, weight, attackValue);
        this.defenseValue = defenseValue;
    }

    @Override
    public double getAttackValue() {
        double finalDamage = super.getAttackValue();
        finalDamage = finalDamage + this.defenseValue / 2.0;
        return finalDamage;
    }
}
