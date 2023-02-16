package Java.grundlagen.j3.rolegame.character;

import Java.grundlagen.j3.rolegame.armor.Armor;
import Java.grundlagen.j3.rolegame.weapon.Weapon;

public class Dwarf extends Character {
    public Dwarf(String nameOfCharacter, double healthPoints, int carryingCapacity, Weapon activeWeapon, boolean isAbleToWearLightArmor, boolean isAbleToWearHeavyArmor, Armor activeArmor,  int initiativeValue) {
        super(nameOfCharacter, healthPoints, carryingCapacity, activeWeapon, isAbleToWearLightArmor, isAbleToWearHeavyArmor, activeArmor, initiativeValue);
    }
}
