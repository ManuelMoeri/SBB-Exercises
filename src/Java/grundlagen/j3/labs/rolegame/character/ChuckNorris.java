package Java.grundlagen.j3.labs.rolegame.character;

import Java.grundlagen.j3.labs.rolegame.weapon.Weapon;

public class ChuckNorris extends Character {
    public ChuckNorris(String nameOfCharacter, double healthPoints, int carryingCapacity, Weapon activeWeapon) {
        super(nameOfCharacter, healthPoints, carryingCapacity, activeWeapon);
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
