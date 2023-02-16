package Java.grundlagen.j3.rolegame.character;

import Java.grundlagen.j3.rolegame.armor.Armor;
import Java.grundlagen.j3.rolegame.weapon.Weapon;

public class ChuckNorris extends Character {
    public ChuckNorris(String nameOfCharacter, double healthPoints, int carryingCapacity, Weapon activeWeapon, boolean isAbleToWearLightArmor, boolean isAbleToWearHeavyArmor, Armor activeArmor, int initiativeValue) {
        super(nameOfCharacter, healthPoints, carryingCapacity, activeWeapon, isAbleToWearLightArmor, isAbleToWearHeavyArmor, activeArmor, initiativeValue);
    }

    @Override
    public double getDamage() {
        double finalDamage = super.getDamage();
        if (new java.util.Random().nextInt(0,6) == 0) {
            finalDamage = finalDamage * 3;
        }
        return finalDamage;
    }
}
