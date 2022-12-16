package Java.grundlagen.j3.labs.rolegame.character;

import Java.grundlagen.j3.labs.rolegame.weapon.Bow;
import Java.grundlagen.j3.labs.rolegame.weapon.Weapon;

public class Goblin extends Character {
    public Goblin(String nameOfCharacter, double healthPoints, int carryingCapacity, Weapon activeWeapon) {
        super(nameOfCharacter, healthPoints, carryingCapacity, activeWeapon);
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
