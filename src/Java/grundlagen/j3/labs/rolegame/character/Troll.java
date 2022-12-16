package Java.grundlagen.j3.labs.rolegame.character;

import Java.grundlagen.j3.labs.rolegame.weapon.Club;
import Java.grundlagen.j3.labs.rolegame.weapon.Weapon;

public class Troll extends Character {
    public Troll(String nameOfCharacter, double healthPoints, int carryingCapacity, Weapon activeWeapon) {
        super(nameOfCharacter, healthPoints, carryingCapacity, activeWeapon);
    }

    @Override
    public double getDamage() {
        double finalDamage = super.getDamage();
        if (getActiveWeapon().getWeaponName().equals("Club")) {
            finalDamage = finalDamage * 2;
        }
        return finalDamage;
    }
}
