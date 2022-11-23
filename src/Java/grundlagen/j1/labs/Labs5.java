package Java.grundlagen.j1.labs;

import java.util.Scanner;

class Labs5 {

    public static int ConditionalStatements(int randomnumber) {
        if (randomnumber < 0) {
            System.out.println("Your number is smaller than 0");
        } else if (randomnumber > 0) {
            System.out.println("Your number is bigger than 0;");
        } else if (randomnumber == 0) {
            System.out.println("Your number is equal to 0");
        }
        return randomnumber;
    }

    public static String Mynamee(String name) {
        System.out.println("Welcome " + name + " :) it's nice to have you here.");
        return name;
    }

    public static int Numbereven(int output) {
        if (output % 2 == 0) {
            System.out.println("The Number " + output + " is even!");
        } else {
            System.out.println("The Number " + output + " is odd!");
        }
        return output;
    }

//    public static int lapeyearyn(int lapeyear) {
//        int buffer = lapeyear;
//
//        if (buffer / 4) {
//
//        }
//
//        return lapeyear;
//    }

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Please enter your random number: ");
        int randomnumber = number.nextInt();

        ConditionalStatements(randomnumber);


        Scanner myname = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = myname.nextLine();

        Mynamee(name);


        Scanner number1 = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int output = number1.nextInt();
        Numbereven(output);


        Scanner lyear = new Scanner(System.in);
        System.out.println("Please enter a year to find out if it is a leap year");
        int leapyear = lyear.nextInt();

    }
}