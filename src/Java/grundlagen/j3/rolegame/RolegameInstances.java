package Java.grundlagen.j3.rolegame;

import Java.grundlagen.j3.rolegame.armor.HeavyArmor;
import Java.grundlagen.j3.rolegame.armor.LightArmor;
import Java.grundlagen.j3.rolegame.character.*;
import Java.grundlagen.j3.rolegame.character.Character;
import Java.grundlagen.j3.rolegame.item.*;
import Java.grundlagen.j3.rolegame.weapon.*;

import java.util.ArrayList;
import java.util.List;

public class RolegameInstances {
    public static final Dwarf DWARF = new Dwarf("Thorin", 120, 6, null, true, true, null, 10);
    public static final Fairy FAIRY = new Fairy("Elvenia", 100, 6, 10, null, true, false, null, 10);
    public static final Goblin GOBLIN = new Goblin("Larry", 80, 7, null, true, false, null, 10);
    public static final Human HUMAN = new Human("Bob", 100, 7, null, true, true, null, 10);
    public static final Orc ORC = new Orc("Zhor The Ruthless", 140, 10, null, true, true, null, 10);
    public static final Troll TROLL = new Troll("Trym", 160, 8, null, false, false, null, 10);
    public static final ChuckNorris CHUCK_NORRIS = new ChuckNorris("Chuck Norris", 120, 7, null, true, true, null, 10);

    public static final RingOfPower RING_OF_POWER = new RingOfPower("Ring of power", 1, "Equip the ring of power to gain +2 carrying capacity!");
    public static final RingOfProtection RING_OF_PROTECTION = new RingOfProtection("Ring of protection", 2, "Equip this ring to have a 15 % chance of blocking the attack!");
    public static final HealingPotion HEALING_POTION = new HealingPotion("Healing Potion", 2, "Use the healing potion to restore 20 health!");
    public static final StrengthPotion STRENGTH_POTION = new StrengthPotion("Strength Potion", 1, "Use the strength potion to multiply your damage with 1.5!");
    public static final GodPotion GOD_POTION = new GodPotion("God Potion", 5, "???");

    public static final Bow BOW = new Bow("Bow", 3, 10);
    public static final ThrowingKnife THROWING_KNIFE = new ThrowingKnife("Throwing Knife", 1, 6);
    public static final Club CLUB = new Club("Club", 2, 5, 5);
    public static final Sword SWORD = new Sword("Sword", 4, 9, 4);
    public static final SnowballLauncher SNOWBALL_LAUNCHER = new SnowballLauncher("Snowball Launcher", 4, 11);

    public static final LightArmor LIGHT_ARMOR = new LightArmor("Light Armor", 2, "Equip the light armor to gain a 10% chance of blocking a attack!");
    public static final HeavyArmor HEAVY_ARMOR = new HeavyArmor("Heavy Armor", 3, "Equip the heavy armor to gain a 25% chance of blocking a attack!");

    public static List<Character> allCharacters = new ArrayList<>();
    public static List<Character> activeCharacters = new ArrayList<>();

    public static void addStuff() {
        allCharacters.add(DWARF);
        allCharacters.add(FAIRY);
        allCharacters.add(GOBLIN);
        allCharacters.add(HUMAN);
        allCharacters.add(ORC);
        allCharacters.add(TROLL);
        allCharacters.add(CHUCK_NORRIS);
    }

    public static void setActiveCharacter (Character characterPlayer1, Character characterPlayer2) {
        activeCharacters.add(characterPlayer1);
        activeCharacters.add(characterPlayer2);
    }

}
