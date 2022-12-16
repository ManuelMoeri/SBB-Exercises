package Java.grundlagen.j3.labs.rolegame.character;

import Java.grundlagen.j3.labs.rolegame.weapon.Weapon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Character {
    private String nameOfCharacter;
    private double healthPoints;
    private int carryingCapacity;
    private Weapon activeWeapon;

    public Character(String nameOfCharacter, double healthPoints, int carryingCapacity, Weapon activeWeapon) {
        this.nameOfCharacter = nameOfCharacter;
        this.healthPoints = healthPoints;
        this.carryingCapacity = carryingCapacity;
        this.activeWeapon = activeWeapon;
    }
    public double getDamage() {
        Random random = new Random();
        double finalDamage = 0;
        if(this.activeWeapon == null) {
            finalDamage = 1;
        } else {
            finalDamage = activeWeapon.getAttackValue();
            finalDamage = finalDamage * random.nextDouble(0.9, 1.1);
        }
        return finalDamage;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public Weapon getActiveWeapon() {
        return activeWeapon;
    }

    public void setActiveWeapon(Weapon activeWeapon) {
        this.activeWeapon = activeWeapon;
    }
    public List<Weapon> weaponInventory = new ArrayList<>();

    public void setWeapon(Weapon weaponToGive) {
        if ()
        this.setActiveWeapon(weaponToGive);
    }
}

