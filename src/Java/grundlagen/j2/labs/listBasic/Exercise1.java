package Java.grundlagen.j2.labs.listBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        List<String> allNumbers = new ArrayList<>();

        System.out.println("Please enter a few numbers");
        String numbersOfCustomer = userInput.nextLine();

        String[] arrayWithUserNumbers = numbersOfCustomer.split(" ");

        for(String numberFromArray: arrayWithUserNumbers) {
            allNumbers.add(numberFromArray);
        }

        int positionNumber = Integer.parseInt(allNumbers.get(0));

        if (positionNumber > arrayWithUserNumbers.length) {
            System.out.println("ERROR! The position " + positionNumber + " doesn't exist");
        } else {
            System.out.println("The number on this position is " + allNumbers.get(positionNumber));
        }
    }
}