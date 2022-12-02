package Java.grundlagen.j2.labs.oop.addressbook;

import java.util.Scanner;

public class AdressbookPersons {

    private Adressbook adressbook;

    public AdressbookPersons(Adressbook adressbook) {
        this.adressbook = adressbook;
    }

    public static void AdressbookCommands() {        String homemenu = null;
        Scanner userInput = new Scanner(System.in);

        do {

            System.out.println("Welcome to my Adressbook! Enter \"/help\" to see a list of all commands: ");
            homemenu = userInput.nextLine();
        } while (!homemenu.equals("/help") && !homemenu.equals("/mkcontact") && !homemenu.equals("/search") && !homemenu.equals("/rmcontact") && !homemenu.equals("/count") && !homemenu.equals("/exit"));


        if (homemenu.equals("/help")) {
            System.out.println("\"/mkcontact\" - Create a new contact with name, e-mail and phonenumber");
            System.out.println("\"/search\" - Search in all contacts");
            System.out.println("\"/rmcontact\" - Remove a contact by entering the e-mail of this person");
            System.out.println("\"/count\" - Counts every contact");
            System.out.println("\"/exit\" - Exit the program");
            AdressbookCommands();

        } else if (homemenu.equals("/mkcontact")) {
            System.out.println("Please answer the following questions to create a contact.");
            System.out.println("Please enter the name: ");
            String nameOfContact = userInput.nextLine();
            System.out.println("Next up please enter a valid E-mail adress: ");
            String emailOfContact = userInput.nextLine();
            System.out.println("To finish the regestration please enter a phonenumber: ");
            String phonenumberOfContact = userInput.nextLine();
            System.out.println("Sucess! The contact has been created.");

            Adressbook.NewAdressbook(emailOfContact, nameOfContact, phonenumberOfContact);
            AdressbookCommands();

        } else if (homemenu.equals("/search")) {
            System.out.println("Please enter the name you're looking for: ");
            String searchPerson = userInput.nextLine();
            for (Adressbook objectFromList: Adressbook.allContacts) {
                if (objectFromList.getName().equals(searchPerson)) {
                    System.out.println("E-mail: " + objectFromList.getEmail());
                    System.out.println("Name: " + objectFromList.getName());
                    System.out.println("Phonenumber: " + objectFromList.getPhoneNumber());
                }
            }
            AdressbookCommands();

        } else if (homemenu.equals("/rmcontact")) {
            for (Adressbook objectFromList2: Adressbook.allContacts) {
                System.out.println("Please enter the e-mail adress to remove this contact:");
                String emailFromUser = userInput.nextLine();
                if (objectFromList2.getEmail().equals(emailFromUser)) {
                    Adressbook.allContacts.remove(objectFromList2);
                    System.out.println("The contact has been succesfully removed!");
                    AdressbookCommands();
                } else {
                    System.out.println("No Contact with this e-mail found.");
                    AdressbookCommands();
                }
            }


        } else if (homemenu.equals("/count")) {
            System.out.println("There are " + Adressbook.allContacts.size() + " contacts in your Addressbook.");
            AdressbookCommands();

        } else if (homemenu.equals("/exit")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {

        AdressbookCommands();
    }
}