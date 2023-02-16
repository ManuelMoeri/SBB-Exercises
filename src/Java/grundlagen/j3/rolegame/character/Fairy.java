package Java.grundlagen.j3.rolegame.character;

import Java.grundlagen.j3.rolegame.armor.Armor;
import Java.grundlagen.j3.rolegame.weapon.Weapon;

public class Fairy extends Character {
    private int magicValue;

    public Fairy(String nameOfCharacter, double healthPoints, int carryingCapacity, int magicValue, Weapon activeWeapon, boolean isAbleToWearLightArmor, boolean isAbleToWearHeavyArmor, Armor activeArmor,  int initiativeValue) {
        super(nameOfCharacter, healthPoints, carryingCapacity, activeWeapon, isAbleToWearLightArmor, isAbleToWearHeavyArmor, activeArmor, initiativeValue);
        this.magicValue = magicValue;
    }

    public int getMagicValue() {
        return magicValue;
    }

    @Override
    public double getDamage() {
        double finalDamage = super.getDamage();
        finalDamage = finalDamage + this.magicValue / 2.0;
        if (getActiveWeapon().getWeaponName().equals("Bow")) {
            finalDamage = finalDamage * 1.5;
        }
        return finalDamage;
    }
}
