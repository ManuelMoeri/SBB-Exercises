package Java.grundlagen.j3.labs.rolegame.character;

import Java.grundlagen.j3.labs.rolegame.weapon.Weapon;

public class Fairy extends Character {
    private int magicValue;

    public Fairy(String nameOfCharacter, double healthPoints, int carryingCapacity, int magicValue, Weapon activeWeapon) {
        super(nameOfCharacter, healthPoints, carryingCapacity, activeWeapon);
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