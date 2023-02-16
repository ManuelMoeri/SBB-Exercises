package Java.grundlagen.j3.rolegame.character;

import Java.grundlagen.j3.rolegame.armor.Armor;
import Java.grundlagen.j3.rolegame.weapon.Bow;
import Java.grundlagen.j3.rolegame.weapon.Weapon;

public class Goblin extends Character {
    public Goblin(String nameOfCharacter, double healthPoints, int carryingCapacity, Weapon activeWeapon, boolean isAbleToWearLightArmor, boolean isAbleToWearHeavyArmor, Armor activeArmor,  int initiativeValue) {
        super(nameOfCharacter, healthPoints, carryingCapacity, activeWeapon, isAbleToWearLightArmor, isAbleToWearHeavyArmor, activeArmor, initiativeValue);
    }

    @Override
    public double getDamage() {
        double finalDamage = super.getDamage();
        if (getActiveWeapon().getWeaponName().equals("Bow")) {
            finalDamage = finalDamage * 1.5;
        }
        return finalDamage;
    }
}
