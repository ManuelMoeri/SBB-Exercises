package Java.grundlagen.j2.labs.streamsBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter a few random numbers");
        String randomNumbers = userInput.nextLine();

        String[] splittedNumbers = randomNumbers.split(" ");

        List<Integer> allNumbersList = new ArrayList<>();

        for (String arrayString : splittedNumbers) {
            Integer convertedInt = Integer.parseInt(arrayString);
            allNumbersList.add(convertedInt);
        }

        List<Integer> sortedNumbersList = allNumbersList.stream().sorted().toList();

        System.out.println("Unsorted list:");
        allNumbersList.forEach(System.out::println);

        System.out.println("Sorted list:");
        sortedNumbersList.forEach(System.out::println);
    }
}