package Java.grundlagen.j3.rolegame;

import Java.grundlagen.j3.rolegame.armor.Armor;
import Java.grundlagen.j3.rolegame.character.Character;
import Java.grundlagen.j3.rolegame.item.Item;
import Java.grundlagen.j3.rolegame.weapon.Weapon;

import javax.management.relation.Role;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Fight {

    public static StringBuilder log = new StringBuilder();

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
            System.out.println(" ");
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
        System.out.println("1 = Thorin | Dwarf | Carrying strength: " + RolegameInstances.DWARF.getCarryingCapacity());
        System.out.println("2 = Elvenia | Fairy | Carrying strength: " + RolegameInstances.FAIRY.getCarryingCapacity());
        System.out.println("3 = Larry | Goblin | Carrying strength: " + RolegameInstances.GOBLIN.getCarryingCapacity());
        System.out.println("4 = Bob | Human | Carrying strength: " + RolegameInstances.HUMAN.getCarryingCapacity());
        System.out.println("5 = Zhor The Ruthless | Orc | Carrying strength: " + RolegameInstances.ORC.getCarryingCapacity());
        System.out.println("6 = Trym | Troll | Carrying strength: " + RolegameInstances.TROLL.getCarryingCapacity());
        System.out.println("7 = Chuck Norris | Chuck Norris | Carrying strength: " + RolegameInstances.CHUCK_NORRIS.getCarryingCapacity());
        System.out.println("---------------------------------------------------------------------------");
        String whichCharacter = userInput.nextLine();

        switch (whichCharacter) {
            case "1":
                characterPlayer1 = RolegameInstances.DWARF;
                break;
            case "2":
                characterPlayer1 = RolegameInstances.FAIRY;
                break;
            case "3":
                characterPlayer1 = RolegameInstances.GOBLIN;
                break;
            case "4":
                characterPlayer1 = RolegameInstances.HUMAN;
                break;
            case "5":
                characterPlayer1 = RolegameInstances.ORC;
                break;
            case "6":
                characterPlayer1 = RolegameInstances.TROLL;
                break;
            case "7":
                characterPlayer1 = RolegameInstances.CHUCK_NORRIS;
                break;
        }
        buildLog("Player1 chose " + characterPlayer1.getNameOfCharacter());

        System.out.println(" ");
        System.out.println("Choose your character Player2 :");
        System.out.println("Please note that it's not allowed to choose the same character twice");
        System.out.println("---------------------------------------------------------------------------");
        whichCharacter = userInput.nextLine();

        switch (whichCharacter) {
            case "1":
                characterPlayer2 = RolegameInstances.DWARF;
                break;
            case "2":
                characterPlayer2 = RolegameInstances.FAIRY;
                break;
            case "3":
                characterPlayer2 = RolegameInstances.GOBLIN;
                break;
            case "4":
                characterPlayer2 = RolegameInstances.HUMAN;
                break;
            case "5":
                characterPlayer2 = RolegameInstances.ORC;
                break;
            case "6":
                characterPlayer2 = RolegameInstances.TROLL;
                break;
            case "7":
                characterPlayer2 = RolegameInstances.CHUCK_NORRIS;
                break;
        }

        if (characterPlayer1 == characterPlayer2) {
            System.out.println("ERROR! This character has been chosen twice");
            System.out.println("Returning to main menu...");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println(" ");
            fightCommands();
        }

        RolegameInstances.setActiveCharacter(characterPlayer1, characterPlayer2);
        buildLog("Player2 chose " + characterPlayer2.getNameOfCharacter());


        chooseWeaponPlayer1();
        chooseWeaponPlayer2();

        chooseItemPlayer1();
        chooseItemPlayer2();

        chooseArmorPlayer1();
        chooseArmorPlayer2();

        System.out.println("Now, let's begin");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(" ");

        fightInRound();
    }

    public static void chooseWeaponPlayer1() {
        System.out.println(" ");
        System.out.println("Player1 choose your weapon :");
        System.out.println(" ");
        System.out.println("1 = " + RolegameInstances.BOW.getWeaponName() + " | Weight: " + RolegameInstances.BOW.getWeight() + " | Attackvalue: " + RolegameInstances.BOW.getAttackValue());
        System.out.println("2 = " + RolegameInstances.THROWING_KNIFE.getWeaponName() + " | Weight: " + RolegameInstances.THROWING_KNIFE.getWeight() + " | Attackvalue: " + RolegameInstances.THROWING_KNIFE.getAttackValue());
        System.out.println("3 = " + RolegameInstances.CLUB.getWeaponName() + " | Weight: " + RolegameInstances.CLUB.getWeight() + " | Attackvalue: " + RolegameInstances.CLUB.getAttackValue());
        System.out.println("4 = " + RolegameInstances.SWORD.getWeaponName() + " | Weight: " + RolegameInstances.SWORD.getWeight() + " | Attackvalue: " + RolegameInstances.SWORD.getAttackValue());
        System.out.println("5 = " + RolegameInstances.SNOWBALL_LAUNCHER.getWeaponName() + " | Weight: " + RolegameInstances.SNOWBALL_LAUNCHER.getWeight() + " | Attackvalue: " + RolegameInstances.SNOWBALL_LAUNCHER.getAttackValue());
        System.out.println("---------------------------------------------------------------------------");
        String whichWeapon = userInput.nextLine();
        Weapon weaponPlayer1 = null;

        switch (whichWeapon) {
            case "1":
                weaponPlayer1 = RolegameInstances.BOW;
                break;
            case "2":
                weaponPlayer1 = RolegameInstances.THROWING_KNIFE;
                break;
            case "3":
                weaponPlayer1 = RolegameInstances.CLUB;
                break;
            case "4":
                weaponPlayer1 = RolegameInstances.SWORD;
                break;
            case "5":
                weaponPlayer1 = RolegameInstances.SNOWBALL_LAUNCHER;
                break;
        }

        characterPlayer1.addWeaponToInventory(weaponPlayer1);
        characterPlayer1.setActiveWeapon(weaponPlayer1);
        buildLog("Player1 equiped the weapon " + weaponPlayer1.getWeaponName());
    }

    public static void chooseWeaponPlayer2() {
        System.out.println(" ");
        System.out.println("Choose your weapon Player2 :");
        System.out.println("---------------------------------------------------------------------------");
        String whichWeapon = userInput.nextLine();
        Weapon weaponPlayer2 = null;
        playerNumberInList = 1;

        switch (whichWeapon) {
            case "1":
                weaponPlayer2 = RolegameInstances.BOW;
                break;
            case "2":
                weaponPlayer2 = RolegameInstances.THROWING_KNIFE;
                break;
            case "3":
                weaponPlayer2 = RolegameInstances.CLUB;
                break;
            case "4":
                weaponPlayer2 = RolegameInstances.SWORD;
                break;
            case "5":
                weaponPlayer2 = RolegameInstances.SNOWBALL_LAUNCHER;
                break;
        }

        characterPlayer2.addWeaponToInventory(weaponPlayer2);
        characterPlayer2.setActiveWeapon(weaponPlayer2);
        buildLog("Player2 equiped the weapon " + weaponPlayer2.getWeaponName());

    }
    public static void chooseItemPlayer1() {
        System.out.println(" ");
        System.out.println("Player1 choose your items! You can take a total of 2 :");
        System.out.println(" ");
        System.out.println("1 = " + RolegameInstances.RING_OF_POWER.getItemName() + " | Weight: " + RolegameInstances.RING_OF_POWER.getWeight() + " | Description: " + RolegameInstances.RING_OF_POWER.getDescription());
        System.out.println("2 = " + RolegameInstances.RING_OF_PROTECTION.getItemName() + " | Weight: " + RolegameInstances.RING_OF_PROTECTION.getWeight() + " | Description: " + RolegameInstances.RING_OF_PROTECTION.getDescription());
        System.out.println("3 = " + RolegameInstances.HEALING_POTION.getItemName() + " | Weight: " + RolegameInstances.HEALING_POTION.getWeight() + " | Description: " + RolegameInstances.HEALING_POTION.getDescription());
        System.out.println("4 = " + RolegameInstances.STRENGTH_POTION.getItemName() + " | Weight: " + RolegameInstances.STRENGTH_POTION.getWeight() + " | Description: " + RolegameInstances.STRENGTH_POTION.getDescription());
        System.out.println("5 = " + RolegameInstances.GOD_POTION.getItemName() + " | Weight: " + RolegameInstances.GOD_POTION.getWeight() + " | Description: " + RolegameInstances.GOD_POTION.getDescription());
        System.out.println("---------------------------------------------------------------------------");
        String item1 = userInput.nextLine();
        String item2 = userInput.nextLine();
        playerNumberInList = 0;

        switch (item1) {
            case "1":
                item1Player1 = RolegameInstances.RING_OF_POWER;
                break;
            case "2":
                item1Player1 = RolegameInstances.RING_OF_PROTECTION;
                break;
            case "3":
                item1Player1 = RolegameInstances.HEALING_POTION;
                break;
            case "4":
                item1Player1 = RolegameInstances.STRENGTH_POTION;
                break;
            case "5":
                item1Player1 = RolegameInstances.GOD_POTION;
                break;
        }

        switch (item2) {
            case "1":
                item2Player1 = RolegameInstances.RING_OF_POWER;
                break;
            case "2":
                item2Player1 = RolegameInstances.RING_OF_PROTECTION;
                break;
            case "3":
                item2Player1 = RolegameInstances.HEALING_POTION;
                break;
            case "4":
                item2Player1 = RolegameInstances.STRENGTH_POTION;
                break;
            case "5":
                item2Player1 = RolegameInstances.GOD_POTION;
                break;
        }

        characterPlayer1.addItemToInventory(item1Player1, item2Player1);
        buildLog("Player1 choose the item " + item1Player1.getItemName());
        buildLog("Player1 choose the item " + item2Player1.getItemName());
    }

    public static void chooseItemPlayer2() {
        System.out.println(" ");
        System.out.println("Choose your Items Player2 :");
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------------------");
        String item1 = userInput.nextLine();
        String item2 = userInput.nextLine();
        playerNumberInList = 1;

        switch (item1) {
            case "1":
                item1Player2 = RolegameInstances.RING_OF_POWER;
                break;
            case "2":
                item1Player2 = RolegameInstances.RING_OF_PROTECTION;
                break;
            case "3":
                item1Player2 = RolegameInstances.HEALING_POTION;
                break;
            case "4":
                item1Player2 = RolegameInstances.STRENGTH_POTION;
                break;
            case "5":
                item1Player2 = RolegameInstances.GOD_POTION;
                break;
        }

        switch (item2) {
            case "1":
                item2Player2 = RolegameInstances.RING_OF_POWER;
                break;
            case "2":
                item2Player2 = RolegameInstances.RING_OF_PROTECTION;
                break;
            case "3":
                item2Player2 = RolegameInstances.HEALING_POTION;
                break;
            case "4":
                item2Player2 = RolegameInstances.STRENGTH_POTION;
                break;
            case "5":
                item2Player2 = RolegameInstances.GOD_POTION;
                break;
        }

        characterPlayer2.addItemToInventory(item1Player2, item2Player2);
        buildLog("Player2 choose the item " + item1Player2.getItemName());
        buildLog("Player2 choose the item " + item2Player2.getItemName());
        System.out.println(" ");
    }

    public static void chooseArmorPlayer1() {
        System.out.println("Player1 choose your armor:");
        System.out.println(" ");
        System.out.println("1 = " + RolegameInstances.LIGHT_ARMOR.getArmorName() + " | Weight: " + RolegameInstances.LIGHT_ARMOR.getArmorWeight() + " | Description: " + RolegameInstances.LIGHT_ARMOR.getArmorDescription());
        System.out.println("2 = " + RolegameInstances.HEAVY_ARMOR.getArmorName() + " | Weight: " + RolegameInstances.HEAVY_ARMOR.getArmorWeight() + " | Description: " + RolegameInstances.HEAVY_ARMOR.getArmorDescription());
        System.out.println("3 = I don't need any armor you fool!");
        System.out.println("---------------------------------------------------------------------------");
        String whichArmor = userInput.nextLine();
        Armor armorPlayer1 = null;

        switch (whichArmor) {
            case "1":
                if (characterPlayer1.getIsAbleToWearLightArmor()) {
                    armorPlayer1 = RolegameInstances.LIGHT_ARMOR;
                }
                break;
            case "2":
                if (characterPlayer1.getIsAbleToWearHeavyArmor()) {
                    armorPlayer1 = RolegameInstances.HEAVY_ARMOR;
                }
                break;
            case "3" :
                buildLog("Player1 chose no armor!");
                break;
        }
        if(armorPlayer1 != null) {
            buildLog("Player1 choose " + armorPlayer1.getArmorName());
            characterPlayer1.takeArmor(armorPlayer1);
            System.out.println(" ");
        }
    }

    public static void chooseArmorPlayer2() {
        System.out.println("Player2 choose your armor:");
        System.out.println(" ");
        System.out.println("1 = " + RolegameInstances.LIGHT_ARMOR.getArmorName() + " | Weight: " + RolegameInstances.LIGHT_ARMOR.getArmorWeight() + " | Description: " + RolegameInstances.LIGHT_ARMOR.getArmorDescription());
        System.out.println("2 = " + RolegameInstances.HEAVY_ARMOR.getArmorName() + " | Weight: " + RolegameInstances.HEAVY_ARMOR.getArmorWeight() + " | Description: " + RolegameInstances.HEAVY_ARMOR.getArmorDescription());
        System.out.println("3 = I don't need any armor you fool!");
        System.out.println("---------------------------------------------------------------------------");
        String whichArmor = userInput.nextLine();
        Armor armorPlayer2 = null;

        switch (whichArmor) {
            case "1":
                if (characterPlayer2.getIsAbleToWearLightArmor()) {
                    armorPlayer2 = RolegameInstances.LIGHT_ARMOR;
                } else {
                    System.out.println("Your character is not able to wear light armor!");
                }
                break;
            case "2":
                if (characterPlayer2.getIsAbleToWearHeavyArmor()) {
                    armorPlayer2 = RolegameInstances.HEAVY_ARMOR;
                } else {
                    System.out.println("Your character is not able to wear heavy armor!");
                }
                break;
            case "3" :
                buildLog("Player2 chose no armor!");
                break;
        }
        if(armorPlayer2 != null) {
            buildLog("Player2 choose " + armorPlayer2.getArmorName());
            characterPlayer2.takeArmor(armorPlayer2);
            System.out.println(" ");
        }
    }

    public static void fightInRound() {
        int round;
        for (round = 1; round <= 20; round++) {
            buildLog("Round " + round + ":");
            if (characterPlayer2.getInitiativeValue() > characterPlayer1.getInitiativeValue()) {
                whatToDoPlayer2();
                whatToDoPlayer1(round);
            } else {
                whatToDoPlayer1(round);
                whatToDoPlayer2();
            }
        }
    }

    public static void whatToDoPlayer1(int round) {
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
                case "1" -> {
                    attackPlayer1();
                    break loop;
                }
                case "2" -> useItemPlayer1();
                case "3" -> surrenderPlayer1();

            }
        }
    }

    public static void whatToDoPlayer2() {
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


    public static void attackPlayer1() {
        double randomDamage1 = characterPlayer1.getDamage();
        characterPlayer2.setHealthPoints(characterPlayer2.getHealthPoints() - randomDamage1);
        System.out.println(" ");
        System.out.println("Player1 dealt " + randomDamage1 + " damage");
        buildLog("Player1 dealt " + randomDamage1 + " damage");
        if (characterPlayer2.getHealthPoints() < 0) {
            System.out.println(" ");
            System.out.println("Player2 died");
            System.out.println("Player1 wins!");
            System.out.println(" ");
            buildLog("Player2 died");
            buildLog("Player1 wins!");
            logCase();
        } else {
            System.out.println("Player2 has " + characterPlayer2.getHealthPoints() + " health points left");
            System.out.println("---------------------------------------------------------------------------");
            System.out.println(" ");
        }
        characterPlayer1.damageSuffered(randomDamage1);
    }

    public static void useItemPlayer1() {
        System.out.println(" ");
        System.out.println("Which item would you like to use?");
        System.out.println(" ");
        int itemNumberByUser = 1;
        int itemNumber = 1;
        for (Item itemFromCharacter : characterPlayer1.itemInventory) {
            System.out.println(itemNumber + ": " + itemFromCharacter.getItemName());
            itemNumber++;
        }

        Scanner intScanner = new Scanner(System.in);
        itemNumberByUser = intScanner.nextInt();
        System.out.println(" ");

        Item itemToUse = characterPlayer1.itemInventory.get(itemNumberByUser - 1);

        buildLog("Player1 used the item " + itemToUse.getItemName());

        switch (itemToUse.getItemName()) {
            case "Ring of power":
                characterPlayer1.ringOfPowerMethod();
                characterPlayer1.itemInventory.remove(RolegameInstances.RING_OF_POWER);
                break;
            case "Ring of protection":
                characterPlayer1.ringOfProtectionMethod();
                characterPlayer1.itemInventory.remove(RolegameInstances.RING_OF_PROTECTION);
                break;
            case "Healing Potion":
                characterPlayer1.healingPotionMethod();
                characterPlayer1.itemInventory.remove(RolegameInstances.HEALING_POTION);
                break;
            case "Strength Potion":
                characterPlayer1.strengthPotionMethod();
                characterPlayer1.itemInventory.remove(RolegameInstances.STRENGTH_POTION);
                break;
            case "God Potion":
                characterPlayer1.godPotionMethod();
                characterPlayer1.itemInventory.remove(RolegameInstances.GOD_POTION);
                break;
        }
    }

    public static void surrenderPlayer1() {
        System.out.println(" ");
        System.out.println("Player1 has surrendered");
        System.out.println("Player2 wins!");
        System.out.println(" ");
        buildLog("Player1 has surrendered");
        logCase();
    }

    public static void attackPlayer2() {
        double randomDamage2 = characterPlayer2.getDamage();
        characterPlayer1.setHealthPoints(characterPlayer1.getHealthPoints() - randomDamage2);
        System.out.println(" ");
        System.out.println("Player2 dealt " + randomDamage2 + " damage");
        buildLog("Player2 dealt " + randomDamage2 + " damage");
        if (characterPlayer1.getHealthPoints() < 0) {
            System.out.println(" ");
            System.out.println("Player1 died");
            System.out.println("Player2 wins!");
            System.out.println(" ");
            buildLog("Player1 died");
            buildLog("Player2 wins!");
            logCase();
        } else {
            System.out.println("Player1 has " + characterPlayer1.getHealthPoints() + " health points left");
            System.out.println(" ");
        }
        characterPlayer2.damageSuffered(randomDamage2);
    }

    public static void useItemPlayer2() {
        System.out.println(" ");
        System.out.println("Which item would you like to use?");
        System.out.println(" ");
        int itemNumberByUser = 1;
        int itemNumber = 1;
        for (Item itemFromCharacter : characterPlayer2.itemInventory) {
            System.out.println(itemNumber + ": " + itemFromCharacter.getItemName());
            itemNumber++;
        }

        Scanner intScanner = new Scanner(System.in);
        itemNumberByUser = intScanner.nextInt();
        System.out.println(" ");

        Item itemToUse = characterPlayer2.itemInventory.get(itemNumberByUser - 1);

        buildLog("Player2 used the item " + itemToUse.getItemName());

        switch (itemToUse.getItemName()) {
            case "Ring of power":
                characterPlayer2.ringOfPowerMethod();
                characterPlayer2.itemInventory.remove(RolegameInstances.RING_OF_POWER);
                break;
            case "Ring of protection":
                characterPlayer2.ringOfProtectionMethod();
                characterPlayer2.itemInventory.remove(RolegameInstances.RING_OF_PROTECTION);
                break;
            case "Healing Potion":
                characterPlayer2.healingPotionMethod();
                characterPlayer2.itemInventory.remove(RolegameInstances.HEALING_POTION);
                break;
            case "Strength Potion":
                characterPlayer2.strengthPotionMethod();
                characterPlayer2.itemInventory.remove(RolegameInstances.STRENGTH_POTION);
                break;
            case "God Potion":
                characterPlayer2.godPotionMethod();
                characterPlayer2.itemInventory.remove(RolegameInstances.GOD_POTION);
                break;
        }
    }


    public static void surrenderPlayer2() {
        System.out.println(" ");
        System.out.println("Player2 has surrendered");
        System.out.println("Player1 wins!");
        System.out.println(" ");
        buildLog("Player2 has surrendered");
        logCase();
    }

    public static void buildLog(String toAdd) {
        LocalDateTime dateTime = LocalDateTime.now();
        String dateString = DateTimeFormatter.ofPattern("HH:mm:ss.SS").format(dateTime);
        log.append(dateString + " " + toAdd + "\n");
    }

    public static void logCase() {
        System.out.println("Would you like to look at the log? (y/n)");
        String logYesNo = userInput.nextLine();
        if (logYesNo.equals("y")) {
            System.out.println(" ");
            System.out.println(log);
            System.exit(0);
        } else if (logYesNo.equals("n")) {
            System.exit(0);
        } else {
            System.out.println(" ");
            System.out.println("No valid input!");
            System.out.println(" ");
            logCase();
        }
    }

    public static void reportBugCase() {
        System.out.println("Please describe the bug :");
        String bugDescription = userInput.nextLine();
        System.out.println("Thanks for supporting the dev team");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
        fightCommands();
    }

    public static void exitCase() {
    }

    public static void main(String[] args) {
        fightCommands();
        RolegameInstances.addStuff();
    }
}
