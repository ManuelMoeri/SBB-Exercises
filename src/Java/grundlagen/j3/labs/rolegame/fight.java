package Java.grundlagen.j3.labs.rolegame;

import Java.grundlagen.j3.labs.rolegame.character.Character;
import Java.grundlagen.j3.labs.rolegame.item.Item;
import Java.grundlagen.j3.labs.rolegame.weapon.Weapon;

import java.util.Scanner;

public class fight {

    public static Scanner userInput = new Scanner(System.in);
    public static String homeMenu = "";

    public static int playerNumberInList = 0;
    public static Character characterPlayer1 = null;
    public static Character characterPlayer2 = null;
    public static Item item1Player1 = null;
    public static Item item2Player1 = null;
    public static Item item1Player2 = null;
    public static Item item2Player2 = null;


    public static void fightCommands() {
        do {
            System.out.println("Welcome to my rolegame! Please report bugs immediately");
            System.out.println("What would you like to do? (Enter a number)");
            System.out.println("1 - Start a fight");
            System.out.println("2 - Report a bug");
            System.out.println("3 - Exit the game");
            System.out.println("---------------------------------------------------------------------------");
            homeMenu = userInput.nextLine();
        } while (!homeMenu.equals("1") && !homeMenu.equals("2") && !homeMenu.equals("3"));

        switch (homeMenu) {
            case "1" -> preperationCase();
            case "2" -> reportBugCase();
            case "3" -> exitCase();
        }
    }

    public static void preperationCase() {
        System.out.println(" ");
        System.out.println("Please choose your character Player1 :");
        System.out.println(" ");
        System.out.println("1 = Thorin | Dwarf");
        System.out.println("2 = Elvenia | Fairy");
        System.out.println("3 = Larry | Goblin");
        System.out.println("4 = Bob | Human");
        System.out.println("5 = Zhor The Ruthless | Orc");
        System.out.println("6 = Trym | Troll");
        System.out.println("---------------------------------------------------------------------------");
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
        System.out.println("Please note that it's not allowed to choose the same character twice");
        System.out.println("---------------------------------------------------------------------------");
        whichCharacter = userInput.nextLine();

        switch (whichCharacter) {
            case "1" : characterPlayer2 = rolegameMain.DWARF; break;
            case "2" : characterPlayer2 = rolegameMain.FAIRY; break;
            case "3" : characterPlayer2 = rolegameMain.GOBLIN; break;
            case "4" : characterPlayer2 = rolegameMain.HUMAN; break;
            case "5" : characterPlayer2 = rolegameMain.ORC; break;
            case "6" : characterPlayer2 = rolegameMain.TROLL; break;
        }

        if (characterPlayer1 == characterPlayer2) {
            System.out.println("ERROR! This character has been chosen twice");
            System.out.println("Returning to main menu...");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println(" ");
            fightCommands();
        }

        rolegameMain.setActiveCharacter(characterPlayer1, characterPlayer2);

        System.out.println(" ");
        System.out.println("Player1 choose your weapon :");
        System.out.println(" ");
        System.out.println("1 = " + rolegameMain.BOW.getWeaponName() + " | Weight: " + rolegameMain.BOW.getWeight() + " | Attackvalue: " + rolegameMain.BOW.getAttackValue());
        System.out.println("2 = " + rolegameMain.THROWING_KNIFE.getWeaponName() + " | Weight: " + rolegameMain.THROWING_KNIFE.getWeight() + " | Attackvalue: " + rolegameMain.THROWING_KNIFE.getAttackValue());
        System.out.println("3 = " + rolegameMain.CLUB.getWeaponName() + " | Weight: " + rolegameMain.CLUB.getWeight() + " | Attackvalue: " + rolegameMain.CLUB.getAttackValue());
        System.out.println("4 = " + rolegameMain.SWORD.getWeaponName() + " | Weight: " + rolegameMain.SWORD.getWeight() + " | Attackvalue: " + rolegameMain.SWORD.getAttackValue());
        System.out.println("---------------------------------------------------------------------------");
        String whichWeapon = userInput.nextLine();
        Weapon weaponPlayer1 = null;

        switch (whichWeapon) {
            case "1" : weaponPlayer1 = rolegameMain.BOW; break;
            case "2" : weaponPlayer1 = rolegameMain.THROWING_KNIFE; break;
            case "3" : weaponPlayer1 = rolegameMain.CLUB; break;
            case "4" : weaponPlayer1 = rolegameMain.SWORD; break;
        }

        characterPlayer1.addWeaponToInventory(weaponPlayer1);
        characterPlayer1.setActiveWeapon(weaponPlayer1);

        System.out.println(" ");
        System.out.println("Choose your weapon Player2 :");
        System.out.println("---------------------------------------------------------------------------");
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
        characterPlayer2.setActiveWeapon(weaponPlayer2);


        System.out.println(" ");
        System.out.println("Player1 choose your items! You can take a total of 2 :");
        System.out.println(" ");
        System.out.println("1 = " + rolegameMain.RING_OF_POWER.getItemName() + " | Weight: " + rolegameMain.RING_OF_POWER.getWeight() + " | Description: " + rolegameMain.RING_OF_POWER.getDescription());
        System.out.println("2 = " + rolegameMain.RING_OF_PROTECTION.getItemName() + " | Weight: " + rolegameMain.RING_OF_PROTECTION.getWeight() + " | Description: " + rolegameMain.RING_OF_PROTECTION.getDescription());
        System.out.println("3 = " + rolegameMain.HEALING_POTION.getItemName() + " | Weight: " + rolegameMain.HEALING_POTION.getWeight() + " | Description: " + rolegameMain.HEALING_POTION.getDescription());
        System.out.println("4 = " + rolegameMain.STRENGTH_POTION.getItemName() + " | Weight: " + rolegameMain.STRENGTH_POTION.getWeight() + " | Description: " + rolegameMain.STRENGTH_POTION.getDescription());
        System.out.println("---------------------------------------------------------------------------");
        String item1 = userInput.nextLine();
        String item2 = userInput.nextLine();
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
        System.out.println("---------------------------------------------------------------------------");
        item1 = userInput.nextLine();
        item2 = userInput.nextLine();
        playerNumberInList = 1;

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

        characterPlayer2.addItemToInventory(item1Player2, item2Player2);
        System.out.println(" ");
        System.out.println("Now, let's begin");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(" ");

        fightInRound();
    }

    public static void fightInRound() {
        for (int round = 1; round <= 20; round++) {
            loop:
            while (true) {
                System.out.println("Round " + round + ":");
                System.out.println("---------------------------------------------------------------------------");
                System.out.println(" ");
                System.out.println("Player1, what would you like to do?");
                System.out.println(" ");
                System.out.println("1 - Attack");
                System.out.println("2 - Use a item");
                System.out.println("3 - Surrender");
                String whatNow = userInput.nextLine();
                switch (whatNow) {
                    case "1" -> {attackPlayer1();
                        break loop;
                    }
                    case "2" -> useItemPlayer1();
                    case "3" -> surrenderPlayer1();

                }
            }
            loop:
            while (true) {
                System.out.println("Player2, what would you like to do?");
                System.out.println(" ");
                System.out.println("1 - Attack");
                System.out.println("2 - Use a item");
                System.out.println("3 - Surrender");
                String whatNow = userInput.nextLine();
                System.out.println("---------------------------------------------------------------------------");
                switch (whatNow) {
                    case "1" -> {
                        attackPlayer2();
                        break loop;
                    }
                    case "2" -> useItemPlayer2();
                    case "3" -> surrenderPlayer2();
                }
            }
        }
    }


    public static void attackPlayer1() {
        double randomDamage1 = characterPlayer1.getDamage();
        characterPlayer2.setHealthPoints(characterPlayer2.getHealthPoints() - randomDamage1);
        System.out.println(" ");
        System.out.println("Player1 dealt " + randomDamage1 + " damage");
        if (characterPlayer2.getHealthPoints() < 0) {
            System.out.println(" ");
            System.out.println("Player2 died");
            System.out.println("Player1 wins!");
            System.exit(0);
        }
        else {
            System.out.println("Player2 has " + characterPlayer2.getHealthPoints() + " health points left");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println(" ");
        }
    }
    public static void useItemPlayer1() {
        System.out.println("Which item would you like to use?");
        int itemNumberByUser = 1;
        int itemNumber = 1;
        for(Item itemFromCharacter: characterPlayer1.itemInventory) {
            System.out.println(itemNumber + ": " + itemFromCharacter.getItemName());
            itemNumber++;
        }

        System.out.println("Gib die Nummer des Items ein das du willst: ");
        itemNumberByUser = userInput.nextInt();

        Item itemToUse = characterPlayer1.itemInventory.get(itemNumberByUser - 1);

        switch (itemToUse.getItemName()) {
            case "Ring of power":
                characterPlayer1.ringOfPowerMethod();
                break;
            case "Ring of protection":
                characterPlayer1.ringOfProtectionMethod();
                break;
            case "Healing Potion":
                characterPlayer1.healingPotionMethod();
                break;
            case "Strength Potion":
                characterPlayer1.strengthPotionMethod();
                break;
        }
    }

    public static void surrenderPlayer1() {
        System.out.println(" ");
        System.out.println("Player1 has surrendered");
        System.out.println("Player2 wins!");
        System.exit(0);
    }

    public static void attackPlayer2() {
        double randomDamage2 = characterPlayer2.getDamage();
        characterPlayer1.setHealthPoints(characterPlayer1.getHealthPoints() - randomDamage2);
        System.out.println(" ");
        System.out.println("Player2 dealt " + randomDamage2 + " damage");
        if (characterPlayer1.getHealthPoints() < 0) {
            System.out.println(" ");
            System.out.println("Player1 died");
            System.out.println("Player2 wins!");
            System.exit(0);
        }
        else {
            System.out.println("Player1 has " + characterPlayer1.getHealthPoints() + " health points left");
            System.out.println(" ");
        }
    }

    public static void useItemPlayer2() {
        System.out.println("Which item would you like to use?");
        System.out.println("1 - " + characterPlayer2.itemInventory.get(0).getItemName());
        System.out.println("2 - " + characterPlayer2.itemInventory.get(1).getItemName());
        String useWhichItem = userInput.nextLine();
        switch (useWhichItem) {

        }
    }

    public static void surrenderPlayer2() {
        System.out.println(" ");
        System.out.println("Player2 has surrendered");
        System.out.println("Player1 wins!");
        System.exit(0);
    }
    public static void reportBugCase() {
        System.out.println("Please describe the bug :");
        String bugDescription = userInput.nextLine();
        System.out.println("Thanks for supporting the dev team");
        System.out.println(" ");
        fightCommands();
    }

    public static void exitCase() {

    }
    public static void main(String[] args) {
        fightCommands();
        rolegameMain.addStuff();
    }
}