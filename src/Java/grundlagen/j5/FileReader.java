package Java.grundlagen.j5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) {

        try {
            File myObj = new File("/home/mmoeri/Downloads/words.txt");

            Scanner userInput = new Scanner(myObj);
            String data = "";
            int counter = 0;

            List<String> wordsWithQ = new ArrayList<>();
            List<String> wordsWithE = new ArrayList<>();
            List<String> specialCharacters = new ArrayList<>();
            List<String> specialCharactersOnce = new ArrayList<>();
            List<String> wordsShorterThan4 = new ArrayList<>();

            while (userInput.hasNextLine()) {
                data = userInput.nextLine();
                counter++;

                if (data.contains("q")) {
                    wordsWithQ.add(data);
                }

                if (data.contains("Q")) {
                    wordsWithQ.add(data);
                }

                if (data.contains("e")) {
                    wordsWithE.add(data);
                }

                if (data.contains("E")) {
                    wordsWithE.add(data);
                }

                if (data.length() < 4) {
                    wordsShorterThan4.add(data);
                }

                if (data.matches("[\\W]+")) {
                    data = data.replaceAll("[\\w]+", "");
                    specialCharacters.add(data);
                }
            }

            System.out.println("Amount of words: " + counter);
            System.out.println("Amount of words with q: " + wordsWithQ.size());
            System.out.println("Amount of words with e: " + wordsWithE.size());
            System.out.println("Amount of words shorter than 4 characters: " + wordsShorterThan4.size());

            System.out.println(specialCharacters);

            userInput.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}