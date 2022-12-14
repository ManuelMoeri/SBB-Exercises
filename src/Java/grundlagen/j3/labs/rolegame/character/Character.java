package Java.grundlagen.j3.labs.rolegame.character;

import Java.grundlagen.j3.labs.rolegame.fight;
import Java.grundlagen.j3.labs.rolegame.item.Item;
import Java.grundlagen.j3.labs.rolegame.rolegameMain;
import Java.grundlagen.j3.labs.rolegame.weapon.MeleeWeapon;
import Java.grundlagen.j3.labs.rolegame.weapon.Weapon;

import javax.swing.*;
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

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public Weapon getActiveWeapon() {
        return activeWeapon;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public void setActiveWeapon(Weapon activeWeapon) {
        this.activeWeapon = activeWeapon;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    public List<Weapon> weaponInventory = new ArrayList<>();
    public List<Item> itemInventory = new ArrayList<>();

    public void takeWeapon(Weapon weaponToGive) {
        if (weaponToGive.getWeight() <= carryingCapacity) {
            this.setCarryingCapacity(this.getCarryingCapacity() - weaponToGive.getWeight());
            this.setActiveWeapon(weaponToGive);
            this.weaponInventory.add(weaponToGive);
            System.out.println("The weapon " + weaponToGive.getWeaponName() + " has been equipped & added to your inventory!");
        } else {
            System.out.println("This weapon is to heavy for you!");
        }
    }

    public void dropWeapon(Weapon weaponToDrop) {
        this.setCarryingCapacity(this.getCarryingCapacity() + this.activeWeapon.getWeight());
        setActiveWeapon(null);
        this.weaponInventory.remove(weaponToDrop);

        System.out.println("The weapon " + weaponToDrop + " has been dropped & removed from your inventory!");
    }

    public void takeItem(Item itemToTake) {
        if (itemToTake.getWeight() <= this.carryingCapacity) {
            this.setCarryingCapacity(this.getCarryingCapacity() - itemToTake.getWeight());
            this.itemInventory.add(itemToTake);
            System.out.println("The item " + itemToTake.getItemName() + " has been added to your inventory!");
        } else {
            System.out.println("This item is to heavy for you!");
        }
    }
    public void useItem(Item itemToUse) {

        String whichItem = itemToUse.getItemName();
        switch (whichItem) {
            case "Ring of power" -> ringOfPowerMethod1();
            case "Ring of protection" -> ringOfProtectionMethod();
            case "Healing of Potion" -> healingPotionMethod();
            case "Strength Potion" -> strengthPotionMethod();
        }
    }

    public void addWeaponToInventory(Weapon weaponToAdd) {
        rolegameMain.activeCharacters.get(fight.playerNumberInList).takeWeapon(weaponToAdd);
    }

    public void addItemToInventory(Item itemToAdd1, Item itemToAdd2) {
        rolegameMain.activeCharacters.get(fight.playerNumberInList).takeItem(itemToAdd1);
        rolegameMain.activeCharacters.get(fight.playerNumberInList).takeItem(itemToAdd2);
    }

    public void ringOfPowerMethod1() {
        this.setCarryingCapacity(this.getCarryingCapacity() + 2);
    }

    public void ringOfProtectionMethod() {
        double damageReceived = this.getDamage() / 10;
        this.setHealthPoints(this.getHealthPoints() + damageReceived);
    }

    public void healingPotionMethod() {
        this.setHealthPoints(this.getHealthPoints() + 20);
    }

    public double strengthPotionMethod() {
        double finalDamage = 0;
        finalDamage = activeWeapon.getAttackValue() * 2;
        return finalDamage;
    }
}