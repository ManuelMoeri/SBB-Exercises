package Java.grundlagen.j2.exams.cööp;

import java.util.Scanner;

public class Cööp {

    public static String homemenu;
    public static Scanner userInput = new Scanner(System.in);

    public static void CööpCommands() {
        do {
            System.out.println("Enter a command (\"/help\" to see all commands): ");
            homemenu = userInput.nextLine();
        } while (!homemenu.equals("/help") && !homemenu.equals("/add") && !homemenu.equals("/remove") && !homemenu.equals("/inventory") && !homemenu.equals("/items") && !homemenu.equals("/system") && !homemenu.equals("/checkout") && !homemenu.equals("/exit"));

        switch (homemenu) {
            case "/help" -> helpcase();
            case "/add" -> addcase();
            case "/remove" -> removecase();
            case "/inventory" -> inventorycase();
            case "/items" -> itemscase();
            case "/system" -> systemcase();
            case "/checkout" -> checkoutcase();
            case "/exit" -> exitcase();
        }
    }

    public static void helpcase() {
        System.out.println("/help - See this list again");
        System.out.println("/add - Add something to your shopping cart");
        System.out.println("/remove - Remove something from your shopping cart");
        System.out.println("/inventory - See your current inventory");
        System.out.println("/items - See all available items in this company");
        System.out.println("/system - Receive help from a tablet");
        System.out.println("/checkout - Pay for your current inventory and leave the store");
        System.out.println("/exit - Shut the program down");
        CööpCommands();
    }

    public static void addcase() {
        System.out.println("add");
        CööpCommands();
    }

    public static void removecase() {
        System.out.println("remove");
        CööpCommands();
    }

    public static void inventorycase() {
        System.out.println("inventory");
        CööpCommands();
    }

    public static void itemscase() {
        System.out.println("items");
        CööpCommands();
    }

    public static void systemcase() {
        System.out.println("system");
        CööpCommands();
    }

    public static void checkoutcase() {
        System.out.println("checkout");
        CööpCommands();
    }

    public static void exitcase() {
        System.out.println("The program is shutting down...");
        System.exit(0);
    }

    public static void main(String[] args) {
        CööpCommands();
    }
}
