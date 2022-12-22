package Java.grundlagen.j2.labs.listBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2Beta {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        List<String> allWords = new ArrayList<>();

        System.out.println("Please enter a few words");
        String wordsOfCustomer = userInput.nextLine();

        String[] splittedWords = wordsOfCustomer.split(" ");

        for (String stringFromArray: splittedWords) {
            allWords.add(stringFromArray);
        }

        System.out.println(wordsOfCustomer);
        System.out.println("Amount of words: " + allWords.size());

        for (String stringFromList : allWords) {
            if (Character.isUpperCase(stringFromList.charAt(0))) {
                System.out.println("All nouns uppercase: " + stringFromList.toUpperCase());
            }
        }
        for (int i = allWords.size() -1; i >= 0; i--) {
            System.out.println("Words reversed: " + allWords.get(i));
        }
    }
}