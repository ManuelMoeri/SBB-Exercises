package Java.grundlagen.j1.labs;

import java.util.Scanner;

public class Labs4 {
    static int methodnumber(int realnumber) {
        return (realnumber * 3) + (realnumber * 5);
    }

    public static int random(int numberR, int numberR1) {
        return numberR + numberR1;
    }

    public static String getName(String namee) {
        return namee;
    }


    public static void main(String[] args) {

        // Ganzzahlen vervielfachen und summieren
        Scanner holenum = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int realnumber = holenum.nextInt();

        System.out.println("Your Final number is: " + methodnumber(realnumber));


        // Zwei zahlen summieren
        Scanner rnumber = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int numberR = rnumber.nextInt();

        Scanner rnumber1 = new Scanner(System.in);
        System.out.println("Please enter your Second number: ");
        int numberR1 = rnumber1.nextInt();

        System.out.println("Your Final number is: " + random(numberR, numberR1));


        // Hallo + name mit methoden
        Scanner name = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        String namee = name.nextLine();

        System.out.println("Hello " + namee);
    }
}
