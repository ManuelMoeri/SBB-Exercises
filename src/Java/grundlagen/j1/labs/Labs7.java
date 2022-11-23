package Java.grundlagen.j1.labs;

import java.util.Scanner;

public class Labs7 {

    public static String reverse(String wert) {
        String[] split = wert.split("");
        int länge = split.length - 1;

        while (länge >= 0) {
            System.out.print(split[länge]);
            länge--;
        }

        return wert;
    }

    public static void countwords(String sentence) {

        String[] words = sentence.split("\\s+");
        int Zahloutput = words.length;
        System.out.println("This Sentence has " + Zahloutput + " Words!");
    }


    public static void main(String[] args) {

        // Reverse String
        Scanner userinput = new Scanner(System.in);
        System.out.println("Please enter your Word: ");
        String wert = userinput.nextLine();

        reverse(wert);


        // Word count
        Scanner userinput1 = new Scanner(System.in);
        System.out.println(" Please enter your Sentence: ");
        String sentence = userinput1.nextLine();

        countwords(sentence);

    }
}