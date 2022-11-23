package Java.grundlagen.j1.labs;

import java.util.Scanner;

public class Labs6 {

    public static int numberreturn(int input) {

        return input;
    }


    public static int througheight(int wert) {
        int var1 = 100;

        int ergebnis = 0;

        while (var1 > 0) {
            if (var1 % wert == 0) {
                ergebnis = ergebnis + var1;
                var1--;
            } else {
                var1--;
            }
        }
        System.out.println(ergebnis);
        return wert;
    }


    public static void main(String[] args) {

        // Factorial
        System.out.println("Please enter your Number, to find out the Factorial of this Number:");

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int factTotal = 1;

        if (number <= 0) {
            System.out.println("That's not a positive integer!");
            System.exit(0);
        }

        do {
            factTotal = factTotal * number;
            number--;

        } while (number >= 1);

        System.out.println("Your factorial is " + factTotal);


        // Numbers from 1 - 100 that are divisible by eight

        Scanner userinput = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int wert = userinput.nextInt();

        througheight(wert);
    }
}
