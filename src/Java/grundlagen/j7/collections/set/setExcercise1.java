package Java.grundlagen.j7.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class setExcercise1 {

    public static void main(String[] args) {
        collectAllPersons();
        collectPersonsInFootballAndDance();
        collectPersonsInFootballButNotInDanceOrSwimclub();
    }

    private static OutputValidation outputValidation = new OutputValidation();
    static Set<String> fussballVerein = Set.of(
            "Emil", "Hans", "Felix", "Fritz", "Patrick",
            "Hanne", "Anja", "Paula", "Petra", "Anna"
    );

    static Set<String> schwimmVerein = Set.of(
            "Emil", "Klaus", "Paul", "Fritz", "Patrick",
            "Hanne", "Anina", "Nicole", "Petra", "Gerda"
    );

    static Set<String> musikVerein = Set.of(
            "Kari", "Hans", "Max",
            "Karin", "Petra", "Anna"
    );

    static Set<String> tanzVerein = Set.of(
            "Emil", "Hans", "Paul", "Felix", "Max",
            "Lara", "Anja", "Sabine", "Anna"
    );

    static Set<String> allPersons = new HashSet<>();
    static Set<String> personsInFootballAndDancing = new HashSet<>();
    static Set<String> personsInFootballButNotInDanceAndSwim = new HashSet<>();

    static Iterator<String> fussballIterator = fussballVerein.iterator();
    static Iterator<String> schwimmIterator = schwimmVerein.iterator();
    static Iterator<String> musikIterator = musikVerein.iterator();
    static Iterator<String> tanzIterator = tanzVerein.iterator();

    public static void collectAllPersons() {
        while (fussballIterator.hasNext()) {
            allPersons.add(fussballIterator.next());
        }

        while (schwimmIterator.hasNext()) {
            allPersons.add(schwimmIterator.next());
        }

        while (musikIterator.hasNext()) {
            allPersons.add(musikIterator.next());
        }

        while (tanzIterator.hasNext()) {
            allPersons.add(tanzIterator.next());
        }

        List<String> allPersonsSorted = allPersons.stream().sorted().toList();

        outputValidation.logAndPrint("- Wie viele Personen machen min. in einem Verein mit: " + allPersons.size() + ": " + allPersonsSorted.toString().replace(" ", "").replace("[", "").replace("]", ""));

    }
    public static void collectPersonsInFootballAndDance() {
        for(String person: fussballVerein) {
            if(tanzVerein.contains(person)) {
                personsInFootballAndDancing.add(person);
            }
        }

        outputValidation.logAndPrint("- Alle Personen, welche im Fussball und Tanz Verein sind: " + personsInFootballAndDancing.size() + ": " + personsInFootballAndDancing.stream().sorted().toList().toString().replace(" ", "").replace("[", "").replace("]", ""));
    }


    public static void collectPersonsInFootballButNotInDanceOrSwimclub() {
        for (String person : fussballVerein) {
            if (!tanzVerein.contains(person) && !schwimmVerein.contains(person)) {
                personsInFootballButNotInDanceAndSwim.add(person);
            }
        }

        outputValidation.logAndPrint("- Alle Personen, welche im Fussball sind und nicht im Tanz oder Schwimm Verein: " + personsInFootballButNotInDanceAndSwim.size() + ": " + personsInFootballButNotInDanceAndSwim.stream().sorted().toList().toString().replace(" ", "").replace("[", "").replace("]", ""));

        outputValidation.printControlHash();
        System.out.println(outputValidation.verifyControlHash(-1421274666));
    }
}