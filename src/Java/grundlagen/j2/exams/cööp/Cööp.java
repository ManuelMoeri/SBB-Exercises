package Java.grundlagen.j2.exams.cööp;

import java.util.Scanner;

public class Cööp {

    public static String homemenu;
    public static Scanner userInput = new Scanner(System.in);

    public static int priceSelfItem1 = 0;
    public static int priceSelfItem2 = 0;
    public static int priceSelfItem3 = 0;
    public static int priceSelfItem4 = 0;
    public static int priceSelfItem5 = 0;

    public static int priceUserItem1 = 0;
    public static int priceUserItem2 = 0;
    public static int priceUserItem3 = 0;
    public static int priceUserItem4 = 0;
    public static int priceUserItem5 = 0;

    public static String schüpercardYN = "";


    public static void CööpCommands() {
        do {
            System.out.println("Enter a command (\"/help\" to see all commands): ");
            homemenu = userInput.nextLine();
        } while (!homemenu.equals("/help") && !homemenu.equals("/add") && !homemenu.equals("/price") && !homemenu.equals("/inventory") && !homemenu.equals("/items") && !homemenu.equals("/system") && !homemenu.equals("/checkout") && !homemenu.equals("/exit"));

        switch (homemenu) {
            case "/help" -> helpcase();
            case "/add" -> addcase();
            case "/price" -> pricecase();
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
        System.out.println("/price - See the price of certain Items");
        System.out.println("/remove - Remove something from your shopping cart");
        System.out.println("/inventory - See your current inventory");
        System.out.println("/items - See all available items in this company");
        System.out.println("/system - Receive help from a tablet");
        System.out.println("/checkout - Pay for your current inventory and leave the store");
        System.out.println("/exit - Shut the program down");
        CööpCommands();
    }

    public static void addcase() {
        String firstItem = null;
        String secondItem = null;
        String thirdItem = null;
        String fourthItem = null;
        String fifthItem = null;
        System.out.println("Which Item would you like to add? (Use /items so see all available items)");
        firstItem = userInput.nextLine();
        System.out.println("You can keep adding Items! Press enter to skip");
        secondItem = userInput.nextLine();
        System.out.println("You can keep adding Items! Press enter to skip");
        thirdItem = userInput.nextLine();
        System.out.println("You can keep adding Items! Press enter to skip");
        fourthItem = userInput.nextLine();
        System.out.println("You can add your last item now! Press enter to skip");
        fifthItem = userInput.nextLine();

        CööpInstances.NewInventory(firstItem, secondItem, thirdItem, fourthItem, fifthItem);
        CööpCommands();
    }

    public static void pricecase() {
        System.out.println("For which company would you like to see the price of the items?");
        System.out.println("1 = Cööp am Bahnhof");
        System.out.println("2 = Cööp Innenstadt");
        System.out.println("3 = Cööp an der Loraine");
        String whichCompany = userInput.nextLine();
        switch (whichCompany) {
            case "1":
                System.out.println("Bread, price: 2.-");
                System.out.println("Butter pretzel, price: 3.-");
                System.out.println("Dish dryer, price: 300.-");
                break;
            case "2":
                System.out.println("Deep frozen pizza, price: 12.-");
                System.out.println("Washing machine, price: 400.-");
                System.out.println("Diamonds, price: 10000.-");
                break;
            case "3":
                System.out.println("Vacuum cleaner, price: 120.-");
                System.out.println("Wood, price: 40.-");
                System.out.println("Stone, price: 75.-");
                break;
        }
        CööpCommands();
    }

    public static void inventorycase() {
        CööpInstances.wholeInventory.stream().forEach(System.out::println); //Die Liste wird noch nicht richtig geprintet, muss gefixt werden.
        CööpCommands();
    }

    public static void itemscase() {
        System.out.println("For which company would you like to see the available items?");
        System.out.println("1 = Cööp am Bahnhof");
        System.out.println("2 = Cööp Innenstadt");
        System.out.println("3 = Cööp an der Loraine");
        String whichCompany = userInput.nextLine();
        switch (whichCompany) {
            case "1":
                System.out.println("Bread");
                System.out.println("Butter Pretzel");
                System.out.println("Dish dryer");
                break;
            case "2":
                System.out.println("Deep frozen pizza");
                System.out.println("Washing machine");
                System.out.println("Diamonds");
                break;
            case "3":
                System.out.println("Vacuum cleaner");
                System.out.println("Wood");
                System.out.println("Stone");
                break;
        }
        CööpCommands();
    }

    public static void systemcase() {
        System.out.println("Welcome! How can I assist you today?");
        System.out.println("1 = Find a item by it's shelf");
        System.out.println("2 = Admin user");
        String tabletHelp = userInput.nextLine();
        switch (tabletHelp) {
            case "1":
                System.out.println("Which Item are you looking for?");
                String whichItem = userInput.nextLine();
                for (Items objectFromList : CööpInstances.allItems) {
                    if (whichItem.equals(objectFromList.getItemName())) {
                        System.out.println("The Item is located in Shelf number " + objectFromList.getShelfNumber());
                    } else {
                        System.out.println("The item " + whichItem + " was not found!");
                    }
                }
                break;
            case "2":
                System.out.println("Please enter the Password to use Admin rights:");
                String adminPasswordByUser = userInput.nextLine();
                String adminPassword = "NoItsNotPassword";
                if (adminPasswordByUser.equals(adminPassword)) {
                    System.out.println("Access granted!");
                    System.out.println("What would you like to do?");
                    System.out.println("1 = See which employee is in which company");
                    System.out.println("2 = Logout");
                    String whatToDoAdmin = userInput.nextLine();
                    switch (whatToDoAdmin) {
                        case "1":
                            System.out.println("For which employee would you like to see the company?");
                            String whichEmployee = userInput.nextLine();
                            for (Employees objectFromList : CööpInstances.allEmployees) {
                                if (whichEmployee.equals(objectFromList.getEmployeeName())) {
                                    System.out.println("The Employee is in the company " + objectFromList.getInWhichCompany());
                                    System.out.println("--------------------------------------------");
                                    System.out.println("com1 = Cööp am Bahnhof");
                                    System.out.println("com2 = Cööp Innenstadt");
                                    System.out.println("com3 = Cööp an der Loraine");
                                }
                            }
                            break;
                        case "2":
                            System.out.println("Logging out...");
                            break;
                    }
                } else {
                    System.out.println("Access denied!");
                    CööpCommands();
                }
        }
        CööpCommands();
    }

    public static void checkoutcase() {
        System.out.println("How would you like to pay?");
        System.out.println("1 = Normal checkout");
        System.out.println("2 = Self checkout");
        String whichCheckout = userInput.nextLine();
        switch (whichCheckout) {
            case "1":
                for (CartInventory objectFromList : CööpInstances.wholeInventory) {
                    String userItem1 = objectFromList.getItem1();
                    String userItem2 = objectFromList.getItem2();
                    String userItem3 = objectFromList.getItem3();
                    String userItem4 = objectFromList.getItem4();
                    String userItem5 = objectFromList.getItem5();

                    for (Items objectFromList2 : CööpInstances.allItems) {
                        if (userItem1.equals(objectFromList2.getItemName())) {
                            priceUserItem1 = objectFromList2.getPrice();
                        }
                        if (userItem2.equals(objectFromList2.getItemName())) {
                            priceUserItem2 = objectFromList2.getPrice();
                        }
                        if (userItem3.equals(objectFromList2.getItemName())) {
                            priceUserItem3 = objectFromList2.getPrice();
                        }
                        if (userItem4.equals(objectFromList2.getItemName())) {
                            priceUserItem4 = objectFromList2.getPrice();
                        }
                        if (userItem5.equals(objectFromList2.getItemName())) {
                            priceUserItem5 = objectFromList2.getPrice();
                        }
                    }
                }
                int toPay = priceUserItem1 + priceUserItem2 + priceUserItem3 + priceUserItem4 + priceUserItem5;
                System.out.println("Your total is " + toPay + ".-");
                System.out.println("How would you like to pay?");
                System.out.println("1 = Debit/Creditcard");
                System.out.println("2 = Cash");
                String payMethod = userInput.nextLine();
                switch (payMethod) {
                    case "1" :
                        System.out.println("Do you have a Schüpercard?");
                        System.out.println("1 = Yes");
                        System.out.println("2 = No");
                        schüpercardYN = userInput.nextLine();
                        switch (schüpercardYN) {
                            case "1":
                                System.out.println("Schüpercard accepted!");
                                System.out.println("Thanks for paying, we hope to see you again soon");
                                System.exit(0);
                                break;
                            case "2":
                                System.out.println("Thanks for paying, we hope to see you again soon");
                                System.exit(0);
                        }
                        break;
                    case "2" :
                        System.out.println("Do you have a Schüpercard?");
                        System.out.println("1 = Yes");
                        System.out.println("2 = No");
                        schüpercardYN = userInput.nextLine();
                        switch (schüpercardYN) {
                            case "1":
                                System.out.println("Schüpercard accepted!");
                                System.out.println("Thanks for paying, we hope to see you again soon");
                                System.exit(0);
                                break;
                            case "2":
                                System.out.println("Thanks for paying, we hope to see you again soon");
                                System.exit(0);
                                break;
                        }
                        break;
                }
                break;
            case "2":
                System.out.println("Which items did you buy? Please enter these items (max 5)");
                for (Items objectFromList : CööpInstances.allItems) {
                    System.out.println("- " + objectFromList.getItemName());
                }
                String selfItem1 = userInput.nextLine();
                String selfItem2 = userInput.nextLine();
                String selfItem3 = userInput.nextLine();
                String selfItem4 = userInput.nextLine();
                String selfItem5 = userInput.nextLine();

                for (Items objectFromList : CööpInstances.allItems) {
                    if (selfItem1.equals(objectFromList.getItemName())) {
                        priceSelfItem1 = objectFromList.getPrice();
                    }
                    if (selfItem2.equals(objectFromList.getItemName())) {
                        priceSelfItem2 = objectFromList.getPrice();
                    }
                    if (selfItem3.equals(objectFromList.getItemName())) {
                        priceSelfItem3 = objectFromList.getPrice();
                    }
                    if (selfItem4.equals(objectFromList.getItemName())) {
                        priceSelfItem4 = objectFromList.getPrice();
                    }
                    if (selfItem5.equals(objectFromList.getItemName())) {
                        priceSelfItem5 = objectFromList.getPrice();
                    }
                }
                int toPayForCustomer = priceSelfItem1 + priceSelfItem2 + priceSelfItem3 + priceSelfItem4 + priceSelfItem5;
                System.out.println("Your total is " + toPayForCustomer + ".-");
                System.out.println("How would you like to pay?");
                System.out.println("1 = Debit/Creditcard");
                System.out.println("2 = TWINT");
                String paymentMethod = userInput.nextLine();
                switch (paymentMethod) {
                    case "1":
                        System.out.println("Do you have a Schüpercard?");
                        System.out.println("1 = Yes");
                        System.out.println("2 = No");
                        schüpercardYN = userInput.nextLine();
                        switch (schüpercardYN) {
                            case "1":
                                System.out.println("Schüpercard accepted!");
                                System.out.println("Thanks for paying, we hope to see you again soon");
                                System.exit(0);
                                break;
                            case "2":
                                System.out.println("Thanks for paying, we hope to see you again soon");
                                System.exit(0);
                        }
                        break;
                    case "2" :
                        System.out.println("Do you have a Schüpercard?");
                        System.out.println("1 = Yes");
                        System.out.println("2 = No");
                        schüpercardYN = userInput.nextLine();
                        switch (schüpercardYN) {
                            case "1":
                                System.out.println("Schüpercard accepted!");
                                System.out.println("Thanks for paying, we hope to see you again soon");
                                System.exit(0);
                                break;
                            case "2":
                                System.out.println("Thanks for paying, we hope to see you again soon");
                                System.exit(0);
                                break;
                        }
                }
        }
        CööpCommands();
    }

    public static void exitcase() {
        System.out.println("The program is shutting down...");
        System.exit(0);
    }

    public static void main(String[] args) {
        CööpInstances.allItemsMethod();
        CööpInstances.allCompanysMethod();
        CööpInstances.allEmployeesMethod();
        CööpCommands();
    }
}