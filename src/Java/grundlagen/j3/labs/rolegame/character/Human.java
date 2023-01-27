package Java.grundlagen.j3.labs.rolegame.character;

import Java.grundlagen.j3.labs.rolegame.Armor.Armor;
import Java.grundlagen.j3.labs.rolegame.weapon.Weapon;

public class Human extends Character {
    public Human(String nameOfCharacter, double healthPoints, int carryingCapacity, Weapon activeWeapon, boolean isAbleToWearLightArmor, boolean isAbleToWearHeavyArmor, Armor activeArmor,  int initiativeValue) {
        super(nameOfCharacter, healthPoints, carryingCapacity, activeWeapon, isAbleToWearLightArmor, isAbleToWearHeavyArmor, activeArmor, initiativeValue);
    }

    @Override
    public double getDamage() {
        double finalDamage = super.getDamage();
        if (getActiveWeapon().getWeaponName().equals("Snowball Launcher")) {
            finalDamage = finalDamage * 1.5;
        }
        return finalDamage;
    }
}
