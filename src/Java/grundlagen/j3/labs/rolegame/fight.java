package Java.grundlagen.j3.labs.rolegame;

import Java.grundlagen.j3.labs.rolegame.character.Character;
import Java.grundlagen.j3.labs.rolegame.character.Dwarf;
import Java.grundlagen.j3.labs.rolegame.item.Item;
import Java.grundlagen.j3.labs.rolegame.weapon.Sword;
import Java.grundlagen.j3.labs.rolegame.weapon.Weapon;

import java.util.Scanner;

public class fight {

    public static Scanner userInput = new Scanner(System.in);
    public static String homeMenu = "";

    public static int playerNumberInList = 0;
    public static Character characterPlayer1 = null;
    public static Character characterPlayer2 = null;

    public static void fightCommands() {
        do {
            System.out.println("Welcome to my rolegame! Please report bugs immediately");
            System.out.println("What would you like to do? (Enter a number)");
            System.out.println("1 - Start a fight");
            System.out.println("2 - View all characters");
            System.out.println("3 - Report a bug");
            System.out.println("4 - Exit the game");
            System.out.println("-----------------------------------------------------------------------");
            homeMenu = userInput.nextLine();
        } while (!homeMenu.equals("1") && !homeMenu.equals("2") && !homeMenu.equals("3") && !homeMenu.equals("4"));

        switch (homeMenu) {
            case "1" -> fightCase();
            case "2" -> viewAllCharactersCase();
            case "3" -> reportBugCase();
            case "4" -> exitCase();
        }
    }

    public static void fightCase() {
        System.out.println(" ");
        System.out.println("Please choose your character Player1 :");
        System.out.println(" ");
        System.out.println("1 = Thorin | Dwarf");
        System.out.println("2 = Elvenia | Fairy");
        System.out.println("3 = Larry | Goblin");
        System.out.println("4 = Bob | Human");
        System.out.println("5 = Zhor The Ruthless | Orc");
        System.out.println("6 = Trym | Troll");
        System.out.println("-----------------------------------------------------------------------");
        String whichCharacter = userInput.nextLine();

        switch (whichCharacter) {
            case "1" : characterPlayer1 = rolegameMain.DWARF; break;
            case "2" : characterPlayer1 = rolegameMain.FAIRY; break;
            case "3" : characterPlayer1 = rolegameMain.GOBLIN; break;
            case "4" : characterPlayer1 = rolegameMain.HUMAN; break;
            case "5" : characterPlayer1 = rolegameMain.ORC; break;
            case "6" : characterPlayer1 = rolegameMain.TROLL; break;
        }

        System.out.println(" ");
        System.out.println("Choose your character Player2 :");
        System.out.println("-----------------------------------------------------------------------");
        whichCharacter = userInput.nextLine();

        switch (whichCharacter) {
            case "1" : characterPlayer2 = rolegameMain.DWARF; break;
            case "2" : characterPlayer2 = rolegameMain.FAIRY; break;
            case "3" : characterPlayer2 = rolegameMain.GOBLIN; break;
            case "4" : characterPlayer2 = rolegameMain.HUMAN; break;
            case "5" : characterPlayer2 = rolegameMain.ORC; break;
            case "6" : characterPlayer2 = rolegameMain.TROLL; break;
        }

        rolegameMain.setActiveCharacter(characterPlayer1, characterPlayer2);

        System.out.println(" ");
        System.out.println("Player1 choose your weapon :");
        System.out.println(" ");
        System.out.println("1 = " + rolegameMain.BOW.getWeaponName() + " | Weight: " + rolegameMain.BOW.getWeight() + " | Attackvalue: " + rolegameMain.BOW.getAttackValue());
        System.out.println("2 = " + rolegameMain.THROWING_KNIFE.getWeaponName() + " | Weight: " + rolegameMain.THROWING_KNIFE.getWeight() + " | Attackvalue: " + rolegameMain.THROWING_KNIFE.getAttackValue());
        System.out.println("3 = " + rolegameMain.CLUB.getWeaponName() + " | Weight: " + rolegameMain.CLUB.getWeight() + " | Attackvalue: " + rolegameMain.CLUB.getAttackValue());
        System.out.println("4 = " + rolegameMain.SWORD.getWeaponName() + " | Weight: " + rolegameMain.SWORD.getWeight() + " | Attackvalue: " + rolegameMain.SWORD.getAttackValue());
        System.out.println("-----------------------------------------------------------------------");
        String whichWeapon = userInput.nextLine();
        Weapon weaponPlayer1 = null;

        switch (whichWeapon) {
            case "1" : weaponPlayer1 = rolegameMain.BOW; break;
            case "2" : weaponPlayer1 = rolegameMain.THROWING_KNIFE; break;
            case "3" : weaponPlayer1 = rolegameMain.CLUB; break;
            case "4" : weaponPlayer1 = rolegameMain.SWORD; break;
        }

        characterPlayer1.addWeaponToInventory(weaponPlayer1);

        System.out.println(" ");
        System.out.println("Choose your weapon Player2 :");
        System.out.println("-----------------------------------------------------------------------");
        whichWeapon = userInput.nextLine();
        Weapon weaponPlayer2 = null;
        playerNumberInList = 1;

        switch (whichWeapon) {
            case "1" : weaponPlayer2 = rolegameMain.BOW; break;
            case "2" : weaponPlayer2 = rolegameMain.THROWING_KNIFE; break;
            case "3" : weaponPlayer2 = rolegameMain.CLUB; break;
            case "4" : weaponPlayer2 = rolegameMain.SWORD; break;
        }

        characterPlayer2.addWeaponToInventory(weaponPlayer2);


        System.out.println(" ");
        System.out.println("Player1 choose your items! You can take a total of 2 :");
        System.out.println(" ");
        System.out.println("1 = " + rolegameMain.RING_OF_POWER.getItemName() + " | Weight: " + rolegameMain.RING_OF_POWER.getWeight() + " | Description: " + rolegameMain.RING_OF_POWER.getDescription());
        System.out.println("2 = " + rolegameMain.RING_OF_PROTECTION.getItemName() + " | Weight: " + rolegameMain.RING_OF_PROTECTION.getWeight() + " | Description: " + rolegameMain.RING_OF_PROTECTION.getDescription());
        System.out.println("3 = " + rolegameMain.HEALING_POTION.getItemName() + " | Weight: " + rolegameMain.HEALING_POTION.getWeight() + " | Description: " + rolegameMain.HEALING_POTION.getDescription());
        System.out.println("4 = " + rolegameMain.STRENGTH_POTION.getItemName() + " | Weight: " + rolegameMain.STRENGTH_POTION.getWeight() + " | Description: " + rolegameMain.STRENGTH_POTION.getDescription());
        System.out.println("-----------------------------------------------------------------------");
        String item1 = userInput.nextLine();
        String item2 = userInput.nextLine();
        Item item1Player1 = null;
        Item item2Player1 = null;
        playerNumberInList = 0;

        switch (item1) {
            case "1" : item1Player1 = rolegameMain.RING_OF_POWER; break;
            case "2" : item1Player1 = rolegameMain.RING_OF_PROTECTION; break;
            case "3" : item1Player1 = rolegameMain.HEALING_POTION; break;
            case "4" : item1Player1 = rolegameMain.STRENGTH_POTION; break;
        }

        switch (item2) {
            case "1" : item2Player1 = rolegameMain.RING_OF_POWER; break;
            case "2" : item2Player1 = rolegameMain.RING_OF_PROTECTION; break;
            case "3" : item2Player1 = rolegameMain.HEALING_POTION; break;
            case "4" : item2Player1 = rolegameMain.STRENGTH_POTION; break;
        }

        characterPlayer1.addItemToInventory(item1Player1, item2Player1);

        System.out.println(" ");
        System.out.println("Choose your Items Player2 :");
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------------");
        item1 = userInput.nextLine();
        item2 = userInput.nextLine();
        Item item1Player2 = null;
        Item item2Player2 = null;
        playerNumberInList = 0;

        switch (item1) {
            case "1" : item1Player2 = rolegameMain.RING_OF_POWER; break;
            case "2" : item1Player2 = rolegameMain.RING_OF_PROTECTION; break;
            case "3" : item1Player2 = rolegameMain.HEALING_POTION; break;
            case "4" : item1Player2 = rolegameMain.STRENGTH_POTION; break;
        }

        switch (item2) {
            case "1" : item2Player2 = rolegameMain.RING_OF_POWER; break;
            case "2" : item2Player2 = rolegameMain.RING_OF_PROTECTION; break;
            case "3" : item2Player2 = rolegameMain.HEALING_POTION; break;
            case "4" : item2Player2 = rolegameMain.STRENGTH_POTION; break;
        }

        characterPlayer1.addItemToInventory(item1Player1, item2Player1);

//        for (int i = 0; i <= 20; i++) {
//            System.out.println("Round " + i + ":");
//        }
    }

    public static void viewAllCharactersCase() {

    }

    public static void reportBugCase() {

    }

    public static void exitCase() {

    }
    public static void main(String[] args) {
        fightCommands();
        rolegameMain.addStuff();
    }
}