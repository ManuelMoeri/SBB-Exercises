package Java.grundlagen.j6.annotations;

import java.util.Scanner;

@Excercise1(authors = "Manuel", description = "No idea", version = "1.0.2")

public class Excercise2 {
    public static void main(String[] args) {
        quizMethod();
    }

    public static void quizMethod() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Let's play a game!");
        System.out.println("3 Questions with 3 possible answers! Try to score as many points as possible (Press enter to continue)");
        String lol = userInput.nextLine();
        int score = 0;
        String whichAnswer = "";
        System.out.println("Question number one: What is Caesar supposed to have said when he crossed the Rubicon?");
        System.out.println("1 = veni, vidi, vici");
        System.out.println("2 = divide et empera");
        System.out.println("3 = alea iacta est");
        System.out.println("");
        whichAnswer = userInput.nextLine();
        System.out.println("");

        switch (whichAnswer) {
            case "1" :
                System.out.println("Sadly wrong! But nice try");
                break;
            case "2" :
                System.out.println("Sadly wrong! But nice try");
                break;
            case "3" :
                System.out.println("Absolute correct! Well done");
                score++;
                break;
        }

        System.out.println("");
        System.out.println("Question number two: How many Oscars did the movie \"Titanic\" win?");
        System.out.println("1 = 10 Oscars");
        System.out.println("2 = 11 Oscars");
        System.out.println("3 = 12 Oscars");
        System.out.println("");
        whichAnswer = userInput.nextLine();
        System.out.println("");

        switch (whichAnswer) {
            case "1" :
                System.out.println("Sadly wrong! But nice try");
                break;
            case "2" :
                System.out.println("Absolute correct! Well done");
                score++;
                break;
            case "3" :
                System.out.println("Sadly wrong! But nice try");
                break;
        }

        System.out.println("");
        System.out.println("Last question: In which sea is the island of Hawaii located?");
        System.out.println("1 = Atlantic Ocean");
        System.out.println("2 = Indian Ocean");
        System.out.println("3 = Pacific Ocean");
        System.out.println("");
        whichAnswer = userInput.nextLine();
        System.out.println("");

        switch (whichAnswer) {
            case "1" :
                System.out.println("Sadly wrong! But nice try");
                break;
            case "2" :
                System.out.println("Sadly wrong! But nice try");
                break;
            case "3" :
                System.out.println("Absolute correct! Well done");
                score++;
                break;
        }
        System.out.println("");

        switch (score) {
            case 0 :
                System.out.println("Your total score is " + score + "/3. Well that's awkward");
                break;
            case 1 :
                System.out.println("Your total score is " + score + "/3. It's okay I guess");
                break;
            case 2 :
                System.out.println("Your total score is " + score + "/3. Not bad! Still some room for improvement though");
                break;
            case 3 :
                System.out.println("Your total score is " + score + "/3. You either are really good at general knowledge or you cheated :P ");
                break;
        }
    }
}