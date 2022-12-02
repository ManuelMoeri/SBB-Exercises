package Java.grundlagen.j2.labs.generics.library;

import java.util.Scanner;

public class Library {

    public static String homemenu = null;
    public static Scanner userInput = new Scanner(System.in);
    public static void LibraryCommands() {

        do {
            System.out.println("Enter a command (\"/help\" to see all commands): ");
            homemenu = userInput.nextLine();
        } while (!homemenu.equals("/help") && !homemenu.equals("/rent") && !homemenu.equals("/return") && !homemenu.equals("/inventory") && !homemenu.equals("/exit"));

        switch (homemenu) {
            case "/help" -> helpcase();
            case "/rent" -> rentcase();
            case "/return" -> returncase();
            case "/inventory" -> inventorycase();
            case "/exit" -> exitcase();
        }
    }

    public static void helpcase() {
        System.out.println("/help - See this list again");
        System.out.println("/rent - Rent a object from the library");
        System.out.println("/return - Return a object from the library");
        System.out.println("/inventory - See all available items");
        LibraryCommands();
    }

    public static void rentcase() {
        System.out.println("What would you like to rent?");
        System.out.println("1 = Book");
        System.out.println("2 = Magazine");
        System.out.println("3 = DVD");
        System.out.println("4 = CD");
        String whichItem = userInput.nextLine();
        switch (whichItem) {
            case "1" :
                System.out.println("Which Book would you like to rent?");
                for (Book objectFromList : Book.allBooks) {
                    System.out.println(objectFromList.getObjectTitle());
                }
                String whichBook = userInput.nextLine();
                for (Book objectFromList2 : Book.allBooks) {
                    if (objectFromList2.getObjectTitle().equals(whichBook)) {
                        objectFromList2.setRented(true);
                        System.out.println("The book is rented now!");
                    }
                }
                LibraryCommands();
            case "2" :
                System.out.println("Which Magazine would you like to rent?");
                for (Magazine objectFromList : Magazine.allMagazines) {
                    System.out.println(objectFromList.getObjectTitle());
                }
                String whichMagazine = userInput.nextLine();
                for (Magazine objectFromList2 : Magazine.allMagazines) {
                    if (objectFromList2.getObjectTitle().equals(whichMagazine)) {
                        objectFromList2.setRented(true);
                        System.out.println("The Magazine is rented now!");
                    }
                }
                LibraryCommands();
            case "3" :
                System.out.println("Which DVD would you like to rent?");
                for (DVD objectFromList : DVD.allDVDs) {
                    System.out.println(objectFromList.getObjectTitle());
                }
                String whichDVD = userInput.nextLine();
                for (DVD objectFromList2 : DVD.allDVDs) {
                    if (objectFromList2.getObjectTitle().equals(whichDVD)) {
                        objectFromList2.setRented(true);
                        System.out.println("The DVD is rented now!");
                    }
                }
                LibraryCommands();
            case "4" :
                System.out.println("Which Magazine would you like to rent?");
                for (CD objectFromList : CD.allCDs) {
                    System.out.println(objectFromList.getObjectTitle());
                }
                String whichCD = userInput.nextLine();
                for (CD objectFromList2 : CD.allCDs) {
                    if (objectFromList2.getObjectTitle().equals(whichCD)) {
                        objectFromList2.setRented(true);
                        System.out.println("The Magazine is rented now!");
                    }
                }
                LibraryCommands();
        }
        LibraryCommands();
    }

    public static void returncase() {
        System.out.println("What would you like to return?");
        System.out.println("1 = Book");
        System.out.println("2 = Magazine");
        System.out.println("3 = DVD");
        System.out.println("4 = CD");
        String whichItem = userInput.nextLine();
        switch (whichItem) {
            case "1" :
                System.out.println("Which Book would you like to return?");
                for (Book objectFromList : Book.allBooks) {
                    System.out.println(objectFromList.getObjectTitle());
                }
                String whichBook = userInput.nextLine();
                for (Book objectFromList2 : Book.allBooks) {
                    if (objectFromList2.getObjectTitle().equals(whichBook)) {
                        objectFromList2.setRented(false);
                        System.out.println("The book is returned!");
                    }
                }
                LibraryCommands();
            case "2" :
                System.out.println("Which Magazine would you like to return?");
                for (Magazine objectFromList : Magazine.allMagazines) {
                    System.out.println(objectFromList.getObjectTitle());
                }
                String whichMagazine = userInput.nextLine();
                for (Magazine objectFromList2 : Magazine.allMagazines) {
                    if (objectFromList2.getObjectTitle().equals(whichMagazine)) {
                        objectFromList2.setRented(false);
                        System.out.println("The Magazine is returned!");
                    }
                }
                LibraryCommands();
            case "3" :
                System.out.println("Which DVD would you like to return?");
                for (DVD objectFromList : DVD.allDVDs) {
                    System.out.println(objectFromList.getObjectTitle());
                }
                String whichDVD = userInput.nextLine();
                for (DVD objectFromList2 : DVD.allDVDs) {
                    if (objectFromList2.getObjectTitle().equals(whichDVD)) {
                        objectFromList2.setRented(false);
                        System.out.println("The DVD is returned!");
                    }
                }
                LibraryCommands();
            case "4" :
                System.out.println("Which Magazine would you like to return?");
                for (CD objectFromList : CD.allCDs) {
                    System.out.println(objectFromList.getObjectTitle());
                }
                String whichCD = userInput.nextLine();
                for (CD objectFromList2 : CD.allCDs) {
                    if (objectFromList2.getObjectTitle().equals(whichCD)) {
                        objectFromList2.setRented(false);
                        System.out.println("The Magazine is returned!");
                    }
                }
                LibraryCommands();
        }
        LibraryCommands();
    }

    public static void inventorycase() {
        System.out.println("Books:");
        for (Book objectFromList: Book.allBooks) {
            System.out.println("Title: " + objectFromList.getObjectTitle());
            System.out.println("Author: " + objectFromList.getAuthor());
            System.out.println("Genre: " + objectFromList.getGenre());
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Magazines:");
        for (Magazine objectFromList2: Magazine.allMagazines) {
            System.out.println("Title: "+ objectFromList2.getObjectTitle());
            System.out.println("Publisher: " + objectFromList2.getPublisher());
            System.out.println("Date of release: " + objectFromList2.getDate());
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("DVDs:");
        for (DVD objectFromList3: DVD.allDVDs) {
            System.out.println("Title: " + objectFromList3.getObjectTitle());
            System.out.println("Artist: " + objectFromList3.getArtistName());
            System.out.println("Amount of Songs: " + objectFromList3.getAmountOfSongs());
            System.out.println(" ");
        }
        LibraryCommands();
    }

    public static void exitcase() {
        System.out.println("The program is shutting down...");
        System.exit(0);
    }


    public static void main(String[] args) {
        Book.allBooksMethod();
        Magazine.allMagazinesMethod();
        DVD.allDVDsMethod();
        CD.allCDsMethod();
        LibraryCommands();
    }
}