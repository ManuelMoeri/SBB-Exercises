package Java.grundlagen.j3.labs.rolegame.character;

import Java.grundlagen.j3.labs.rolegame.Armor.Armor;
import Java.grundlagen.j3.labs.rolegame.weapon.Weapon;

public class Orc extends Character {
    public Orc(String nameOfCharacter, double healthPoints, int carryingCapacity, Weapon activeWeapon, boolean isAbleToWearLightArmor, boolean isAbleToWearHeavyArmor, Armor activeArmor,  int initiativeValue) {
        super(nameOfCharacter, healthPoints, carryingCapacity, activeWeapon, isAbleToWearLightArmor, isAbleToWearHeavyArmor, activeArmor, initiativeValue);
    }

    @Override
    public double getDamage() {
        double finalDamage = super.getDamage();
        if (this.getHealthPoints() <= 35) {
            finalDamage = finalDamage * 3; // Noch hinzufügen das er nur halb so viel schaden bekommt.
        }
        return finalDamage;
    }
}
