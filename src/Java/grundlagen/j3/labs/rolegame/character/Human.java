package Java.grundlagen.j3.labs.rolegame.character;

import Java.grundlagen.j3.labs.rolegame.weapon.Weapon;

public class Human extends Character {
    public Human(String nameOfCharacter, double healthPoints, int carryingCapacity, Weapon activeWeapon) {
        super(nameOfCharacter, healthPoints, carryingCapacity, activeWeapon);
    }
}
