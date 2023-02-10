package Java.grundlagen.j7.collections.map;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MapExcercise1 {

    public static Map<Integer, String> plzToCityMap = new HashMap<>();
    public static File allPLZ;
    public static String TownshipName = "";
    public static int PLZ = 0;
    public static Scanner scanner;

    public static void createScanner() {
        try {
            allPLZ = new File("/home/mmoeri/Documents/Postleitzahlen_UTF8.csv");
            scanner = new Scanner(allPLZ);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        createScanner();
        amountOfPLZ();
        smallestPLZBern();
        amountOfTownshipsWithMoreThan10Characters();
        amountOfTownshipsWith7Characters();
        amountOfTownshipsWithTheLetterSequenceENT();
        amountOfTownshipsWith3Letters();
        amountOfCharactersOfTheSmallestTownship();
        shortestTownshipNames();
        amountOfCharactersOfTheBiggestTownship();
        longestTownshipNames();
    }

    private static void amountOfPLZ() {
        List<String> lmao = new ArrayList<>();
        while (scanner.hasNextLine()) {
            TownshipName = scanner.nextLine();
            PLZ = scanner.nextInt();
            lmao.add(TownshipName);
        }
        System.out.println(lmao);
    }

    private static void smallestPLZBern() {

    }

    private static void amountOfTownshipsWithMoreThan10Characters() {

    }

    private static void amountOfTownshipsWith7Characters() {

    }

    private static void amountOfTownshipsWithTheLetterSequenceENT() {

    }

    private static void amountOfTownshipsWith3Letters() {

    }

    private static void amountOfCharactersOfTheSmallestTownship() {

    }

    private static void shortestTownshipNames() {

    }

    private static void amountOfCharactersOfTheBiggestTownship() {

    }

    private static void longestTownshipNames() {

    }
}
