package Java.grundlagen.j7.collections.map;

import Java.grundlagen.j7.collections.set.lab1.OutputValidation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MapExcercise1 {

    private static Map<Integer, String> plzToCityMap = new HashMap<>();
    private static File allPLZ;
    private static Scanner scanner;
    private static OutputValidation outputValidation = new OutputValidation();

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
        amountOfTownshipsWithMoreThan10Letters();
        amountOfTownshipsWith7Letters();
        amountOfTownshipsWithTheLetterSequenceENT();
        townshipsWith3Letters();
        amountOfCharactersOfTheSmallestTownship();
        shortestTownshipNames();
        amountOfCharactersOfTheBiggestTownship();
        longestTownshipNames();
    }

    private static void amountOfPLZ() {
        outputValidation.logAndPrint("- Anzahl PLZ: " + plzToCityMap.size());
    }

    private static void smallestAndBiggestPLZBern() {
        List bernPLZ = new ArrayList();
        for (int keyFromMap : plzToCityMap.keySet()) {
            if (plzToCityMap.get(keyFromMap).equals("Bern")) {
                bernPLZ.add(keyFromMap);
            }
        }

        outputValidation.logAndPrint("- Kleinste PLZ der Gemeinde Bern: " + bernPLZ.get(0));

        outputValidation.logAndPrint("- Grösste PLZ der Gemeinde Bern: " + bernPLZ.get(bernPLZ.size() -1));
    }

    private static void amountOfTownshipsWithMoreThan10Letters() {
        List townshipsWithMoreThan10Letters = new ArrayList<>();
        for (int keyFromMap : plzToCityMap.keySet()) {
            if (plzToCityMap.get(keyFromMap).length() > 10) {
                townshipsWithMoreThan10Letters.add(keyFromMap);
            }
        }

        outputValidation.logAndPrint("- Anzahl Gemeinden mit mehr als 10 Buchstaben: " + townshipsWithMoreThan10Letters.size());
    }

    private static void amountOfTownshipsWith7Letters() {
        List townshipsWith7Letters = new ArrayList<>();
        for (int keyFromMap : plzToCityMap.keySet()) {
            if (plzToCityMap.get(keyFromMap).length() == 7) {
                townshipsWith7Letters.add(keyFromMap);
            }
        }

        outputValidation.logAndPrint("- Anzahl Gemeinden mit 7 Buchstaben: " + townshipsWith7Letters.size());
    }

    private static void amountOfTownshipsWithTheLetterSequenceENT() {
        List townshipsWithTheLetterSequenceENT= new ArrayList<>();
        for (int keyFromMap : plzToCityMap.keySet()) {
            if (plzToCityMap.get(keyFromMap).contains("Ent") || plzToCityMap.get(keyFromMap).contains("ent")) {
                townshipsWithTheLetterSequenceENT.add(keyFromMap);
            }
        }

        outputValidation.logAndPrint("- Anzahl Gemeinden mit der Buchstabenfolge 'ent': " + townshipsWithTheLetterSequenceENT.size());
    }

    private static void townshipsWith3Letters() {
        List townshipsWith3Letters = new ArrayList<>();
        for (int keyFromMap : plzToCityMap.keySet()) {
            if (plzToCityMap.get(keyFromMap).length() == 3) {
                townshipsWith3Letters.add(plzToCityMap.get(keyFromMap));
            }
        }

        outputValidation.logAndPrint("- Gemeinden mit 3 Buchstaben: " + townshipsWith3Letters.stream().sorted().toList().toString().replace("[", "").replace("]", ""));
    }

    private static void amountOfCharactersOfTheSmallestTownship() {
        List<Integer> allTownshipsLength = plzToCityMap.values().stream().map(x -> x.length()).sorted().toList();

        outputValidation.logAndPrint("- Anzahl Buchstaben der kleinsten Gemeinden: " + allTownshipsLength.get(0));
    }

    private static void shortestTownshipNames() {
        List<Integer> allTownshipsLength = plzToCityMap.values().stream().map(x -> x.length()).sorted().toList();

        List shortestTownships = new ArrayList<>();

        for (int keyFromMap : plzToCityMap.keySet()) {
            if (plzToCityMap.get(keyFromMap).length() == allTownshipsLength.get(0)) {
                shortestTownships.add(plzToCityMap.get(keyFromMap));
            }
        }

        outputValidation.logAndPrint("- Kleinsten Gemeinden: " + shortestTownships.stream().sorted().toList().toString().replace("[", "").replace("]", ""));
    }

    private static void amountOfCharactersOfTheBiggestTownship() {
        List<Integer> allTownshipsLength = plzToCityMap.values().stream().map(x -> x.length()).sorted().toList();

        outputValidation.logAndPrint("- Anzahl Buchstaben der grössten Gemeinden: " + allTownshipsLength.get(allTownshipsLength.size() -1));
    }

    private static void longestTownshipNames() {
        List<Integer> allTownshipsLength = plzToCityMap.values().stream().map(x -> x.length()).sorted().toList();

        List longestTownships = new ArrayList<>();

        for (int keyFromMap : plzToCityMap.keySet()) {
            if (plzToCityMap.get(keyFromMap).length() == allTownshipsLength.get(allTownshipsLength.size() -1)) {
                longestTownships.add(plzToCityMap.get(keyFromMap));
            }
        }

        outputValidation.logAndPrint("- Grössten Gemeinden: " + longestTownships.stream().sorted().toList().toString().replace("[", "").replace("]", ""));

        outputValidation.printControlHash();
        outputValidation.verifyControlHash(1768988137);
    }
}