package Java.grundlagen.j3.labs.rolegame.character;

import Java.grundlagen.j3.labs.rolegame.weapon.Weapon;
import Java.grundlagen.j3.labs.rolegame.rolegameMain;

public class Orc extends Character {
    public Orc(String nameOfCharacter, double healthPoints, int carryingCapacity, Weapon activeWeapon) {
        super(nameOfCharacter, healthPoints, carryingCapacity, activeWeapon);
    }

    @Override
    public double getDamage() {
        double finalDamage = super.getDamage();
        if (this.getHealthPoints() <= 35) {
            finalDamage = finalDamage * 3;
        }
        return finalDamage;
    }
}
