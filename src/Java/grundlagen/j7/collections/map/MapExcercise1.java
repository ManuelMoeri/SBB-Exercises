package Java.grundlagen.j7.collections.map;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.*;

public class MapExcercise1 {

    public static Map<Integer, String> plzToCityMap = new HashMap<>();
    public static File allPLZ;
    public static Scanner scanner;

    public static void createScanner() {
        try {
            allPLZ = new File("/home/mmoeri/Documents/Postleitzahlen_UTF8.csv");
            scanner = new Scanner(allPLZ);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void seperateCharactersAndNumbers() {
        try {
            scanner.nextLine();
            while (scanner.hasNextLine()) {
                String test = scanner.nextLine();
                test = test.replaceFirst(",", "@").replace("\"", "");
                String[] splittedArray = test.split("@");
                plzToCityMap.put(Integer.parseInt(splittedArray[0]), splittedArray[1]);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        createScanner();
        seperateCharactersAndNumbers();
        amountOfPLZ();
        smallestAndBiggestPLZBern();
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
        System.out.println("- Anzahl PLZ: " + plzToCityMap.size());
    }

    private static void smallestAndBiggestPLZBern() {

        System.out.println("- Kleinste PLZ der Gemeinde Bern: ");
    }

    private static void amountOfTownshipsWithMoreThan10Characters() {

        System.out.println("- Anzahl Gemeinden mit mehr als 10 Buchstaben: ");
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
