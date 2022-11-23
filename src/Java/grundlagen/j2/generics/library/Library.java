package Java.grundlagen.j2.generics.library;

import java.util.Scanner;

public class Library {

    public static String homemenu = null;
    public static Scanner userInput = new Scanner(System.in);
    public static void LibraryCommands() {

        do {
            System.out.println("Enter a command (\"/help\" to see all commands): ");
            homemenu = userInput.nextLine();
        } while (!homemenu.equals("/help") && !homemenu.equals("/rent") && !homemenu.equals("/return") && !homemenu.equals("/inventory"));

        switch (homemenu) {
            case "/help" -> helpcase();
            case "/rent" -> rentcase();
            case "/return" -> returncase();
            case "/inventory" -> inventorycase();
        }
    }

    public static void helpcase() {
        System.out.println("/help - See this list again");
        System.out.println("/rent - Rent a object from the library");
        System.out.println("/return - Return a object from the library");
        System.out.println("/inventory - See all available items");
    }

    public static void rentcase() {
        System.out.println("rent!");
    }

    public static void returncase() {
        System.out.println("return!");
    }

    public static void inventorycase() {
        System.out.println("inventory!");
    }
}