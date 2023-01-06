package Java.grundlagen.j3.labs.rolegame;

import Java.grundlagen.j3.labs.rolegame.character.*;
import Java.grundlagen.j3.labs.rolegame.character.Character;
import Java.grundlagen.j3.labs.rolegame.item.HealingPotion;
import Java.grundlagen.j3.labs.rolegame.item.RingOfPower;
import Java.grundlagen.j3.labs.rolegame.item.RingOfProtection;
import Java.grundlagen.j3.labs.rolegame.item.StrengthPotion;
import Java.grundlagen.j3.labs.rolegame.weapon.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class rolegameMain {
    public static final Dwarf DWARF = new Dwarf("Thorin", 120, 5, null);
    public static final Fairy FAIRY = new Fairy("Elvenia", 100, 6, 10, null);
    public static final Goblin GOBLIN = new Goblin("Larry", 80, 5, null);
    public static final Human HUMAN = new Human("Bob", 100, 6, null);
    public static final Orc ORC = new Orc("Zhor The Ruthless", 140, 9, null);
    public static final Troll TROLL = new Troll("Trym", 160, 7, null);

    public static final RingOfPower RING_OF_POWER = new RingOfPower("Ring of power", 1, "Equip the ring of power to gain +2 carrying capacity!");
    public static final RingOfProtection RING_OF_PROTECTION = new RingOfProtection("Ring of protection", 2, "Equip the ring of protection to receive 10% less damage!");
    public static final HealingPotion HEALING_POTION = new HealingPotion("Healing of Potion", 2, "Use the healing potion to restore 20 health!");
    public static final StrengthPotion STRENGTH_POTION = new StrengthPotion("Strength Potion", 1, "Use the strength potion to double your damage for one round!");

    public static final Bow BOW = new Bow("Bow", 3, 10);
    public static final ThrowingKnife THROWING_KNIFE = new ThrowingKnife("Throwing Knife", 1, 6);
    public static final Club CLUB = new Club("Club", 2, 5, 5);
    public static final Sword SWORD = new Sword("Sword", 4, 9, 4);

    public static List<Character> allCharacters = new ArrayList<>();
    public static List<Character> activeCharacters = new ArrayList<>();

    public static void addStuff() {
        allCharacters.add(DWARF);
        allCharacters.add(FAIRY);
        allCharacters.add(GOBLIN);
        allCharacters.add(HUMAN);
        allCharacters.add(ORC);
        allCharacters.add(TROLL);
    }

    public static void setActiveCharacter (Character characterPlayer1, Character characterPlayer2) {
        activeCharacters.add(characterPlayer1);
        activeCharacters.add(characterPlayer2);
    }
}