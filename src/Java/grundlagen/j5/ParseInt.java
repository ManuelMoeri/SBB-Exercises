package Java.grundlagen.j5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ParseInt {

    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Please enter a number: ");
            double number1 = userInput.nextDouble();
            System.out.print("Please enter a second number: ");
            double number2 = userInput.nextDouble();

            System.out.println("What would you like to do with those two numbers? (Enter a number)");
            System.out.println("1 - Add up");
            System.out.println("2 - Subtract");
            System.out.println("3 - Multiply");
            System.out.println("4 - Divide");
            System.out.println("5 - I don't care man, let the program decide?");
            int whatNow = userInput.nextInt();

            switch (whatNow) {
                case 1 -> addUp(number1, number2);
                case 2 -> subtract(number1, number2);
                case 3 -> multiply(number1, number2);
                case 4 -> divide(number1, number2);
                case 5 -> idk(number1, number2);
            }

        } catch (InputMismatchException e) {
            System.out.println("Not a valid input!");
            System.out.println("InputMissmatchException has occured");
        }
    }

    public static void addUp(double number1, double number2) {
        double result = number1 + number2;
        System.out.println("The result is: " + result);
    }

    public static void subtract(double number1, double number2) {
        double result = number1 - number2;
        System.out.println("The result is: " + result);
    }

    public static void multiply(double number1, double number2) {
        double result = number1 * number2;
        System.out.println("The result is: " + result);
    }

    public static void divide(double number1, double number2) {
        double result = number1 / number2;
        System.out.println("The result is: " + result);
    }

    public static void idk(double number1, double number2) {
        System.out.println("First number: " + number1);
        System.out.println("Second number: " + number2);
        double resultAdd = number1 + number2;
        double resultSubract = number1 - number2;
        double resultMultiply = number1 * number2;
        double resultDivide = number1 / number2;
        System.out.println("Added up: " + resultAdd);
        System.out.println("Subtracted: " + resultSubract);
        System.out.println("Multiplied: " + resultMultiply);
        System.out.println("Divided: " + resultDivide);
    }
}