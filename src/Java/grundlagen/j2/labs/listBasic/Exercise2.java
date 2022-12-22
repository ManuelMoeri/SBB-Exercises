package Java.grundlagen.j2.labs.listBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {  // Zu viele Arrays verwendet → neue Lösung suchen
        Scanner userInput = new Scanner(System.in);

        List<String> allWords = new ArrayList<>();

        System.out.println("Enter a few words please");
        String wordsOfCustomer = userInput.nextLine();

        String[] splittedWords = wordsOfCustomer.split(" ");
        String[] splittedWordsReverse = wordsOfCustomer.split("");

        for (String stringFromArray: splittedWords) {
            allWords.add(stringFromArray);
        }

        System.out.println("Amount of words in the String: " + splittedWords.length);
        System.out.println("The words: " + wordsOfCustomer);

        for (String stringFromList: allWords) {
            if (Character.isUpperCase(stringFromList.charAt(0))) {
                System.out.println("All nouns uppercase: " + stringFromList.toUpperCase());
            }
        }

        int length = splittedWordsReverse.length -1;

        System.out.println("Words reverse :");
        while (length >= 0) {
            System.out.print(splittedWordsReverse[length]);
            length--;
        }
    }
}