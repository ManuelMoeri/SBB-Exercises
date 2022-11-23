package Java.grundlagen.j2.oop.realEstateCompany;

import java.util.Scanner;

public class RealEstateCompany {

    public static String homemenu = null;
    public static Scanner userInput = new Scanner(System.in);
    public static void RealEstateCompanyCommands() {

        do {
            System.out.println("Enter a command (\"/help\" to see all commands): ");
            homemenu = userInput.nextLine();
        } while (!homemenu.equals("/help") && !homemenu.equals("/allapartments") && !homemenu.equals("/keeper") && !homemenu.equals("/agreements") && !homemenu.equals("/emptyapartments") && !homemenu.equals("/expiringagreements") && !homemenu.equals("/allagreements") && !homemenu.equals("/monthlyincome") && !homemenu.equals("/yearlyincome") && !homemenu.equals("/exit"));

        switch (homemenu) {
            case "/help" -> helpcase();
            case "/allapartments" -> allapartmenscase();
            case "/keeper" -> keepercase();
            case "/agreements" -> agreementscase();
            case "/emptyapartments" -> emptyapcase();
            case "/expiringagreements" -> expiringagreementscase();
            case "/allagreements" -> allagreementscase();
            case "/monthlyincome" -> monthlyincomecase();
            case "/yearlyincome" -> yearlyincomecase();
            case "/exit" -> exitcase();
        }
    }

    public static void helpcase() {
        System.out.println("/help - See this list again");
        System.out.println("/allapartments - Counts every apartment");
        System.out.println("/keeper - Find out which apartment has which keeper");
        System.out.println("/agreements - See all agreements for one real estate");
        System.out.println("/emptyapartments - See all empty apartments in a real estate");
        System.out.println("/expiringagreements - Shows the agreements that expire next month");
        System.out.println("/allagreements - Shows every active agreement sorted by Persons");
        System.out.println("/monthlyincome - See the monthly income of one real estate");
        System.out.println("/yearlyincome - See the yearly income of the whole company");
        System.out.println("/exit - exit the program");
        RealEstateCompanyCommands();
    }

    public static void allapartmenscase() {
        System.out.println("There are a total of " + Apartments.allApartments.size() + " apartments.");
        RealEstateCompanyCommands();
    }

    public static void keepercase() {
        Scanner keeperInput = new Scanner(System.in);
        System.out.println("On which apartment would you like to see the keeper? There is apartment 12, 7, 17, 3, 6 and 2");
        int apartmentNumberOfCustomer = keeperInput.nextInt();
        for (Apartments objectFromList: Apartments.allApartments) {
            if (objectFromList.getApartmentNumber() == apartmentNumberOfCustomer) {
                System.out.println("The keeper of this apartment is " + objectFromList.getKeeper());
            }
        }
        RealEstateCompanyCommands();
    }

    public static void agreementscase() {
        System.out.println("RS_1 = ID for \"Bärengasse 34\"");
        System.out.println("RS_2 = ID for \"Speicherstrasse 8\"");
        System.out.println("RS_3 = ID for \"Bahnhofgasse 12\"");
        System.out.println("For which real estate would you like to see the agreements/contracts? Please enter the ID of the real estate");
        String realEstateAgreements = userInput.nextLine();
        for (RentalAgreements objectFromList2: RentalAgreements.allAgreements) {
            if (objectFromList2.getAgreementForEstate().equals(realEstateAgreements)) {
                System.out.println("This contract has the ID: " + objectFromList2.getAgreementID());
                System.out.println("The agreement expires in " + objectFromList2.getHowManyDaysTillAgreementexpired() + " days");
                System.out.println("The monthly price of this apartment is " + objectFromList2.getMonthlyPrice());
                System.out.println("Person " + objectFromList2.getWhosAgreement() + " owns this contract");
                System.out.println("This agreement is made for apartment number " + objectFromList2.getAgreementForApartmentNumber());
            }
        }
        RealEstateCompanyCommands();
    }

    public static void emptyapcase() {
        System.out.println("RS_1 = ID for \"Bärengasse 34\"");
        System.out.println("RS_2 = ID for \"Speicherstrasse 8\"");
        System.out.println("RS_3 = ID for \"Bahnhofgasse 12\"");
        System.out.println("For which real estate would you like to see the empty apartments? Please enter the ID of the real estate");
        String whichRealEstateUser = userInput.nextLine();
        for (Apartments objectFromList3: Apartments.allApartments) {
            if (objectFromList3.getRealEstateId().equals(whichRealEstateUser) && objectFromList3.getEmpty()) {
                System.out.println("The apartment " + objectFromList3.getApartmentNumber() + " is free!");
            }
        }
        RealEstateCompanyCommands();
    }

    public static void expiringagreementscase() {
        for (RentalAgreements objectFromList4: RentalAgreements.allAgreements) {
            if (objectFromList4.getHowManyDaysTillAgreementexpired() <= 30) {
                System.out.println("This contract has the ID: " + objectFromList4.getAgreementID());
                System.out.println("The agreement expires in " + objectFromList4.getHowManyDaysTillAgreementexpired() + " days");
                System.out.println("The monthly price of this apartment is " + objectFromList4.getMonthlyPrice());
                System.out.println("Person " + objectFromList4.getWhosAgreement() + " owns this contract");
                System.out.println("This agreement is made for apartment number " + objectFromList4.getAgreementForApartmentNumber());
            } else {
                System.out.println("Currently there are no contracts expiring");
            }
        }
        RealEstateCompanyCommands();
    }

    public static void allagreementscase() {
        System.out.println("All ID's and the person that belongs to the ID:");
        System.out.println("#1 = Thomas Dänzer");
        System.out.println("#2 = Jannik Alabor");
        System.out.println("#3 = Kimi Pulfer");
        System.out.println("#4 = Lina Müller");
        System.out.println("#5 = Alex Küffer");
        System.out.println("#6 = Laura Eggimann");
        System.out.println("#7 = Amelie Hirschi");
        System.out.println("#8 = Basil Strähl");
        System.out.println("#9 = Luana Wolf");
        System.out.println("Type /leave to leave the method");
        System.out.println("Please type in the person ID to see their agreements");
        String whichPerson = userInput.nextLine();
        for (RentalAgreements objectFromList5: RentalAgreements.allAgreements) {
            if (objectFromList5.getWhosAgreement().equals(whichPerson)) {
                System.out.println("This person belongs to the agreement ID: " + objectFromList5.getAgreementID());
                allagreementscase();
            } else if (whichPerson.equals("/leave")){
                RealEstateCompanyCommands();
            } else {
                System.out.println("This person doesn't have a agreement or the ID was incorrect, please try again");
                allagreementscase();
            }
        }
    }

    public static void monthlyincomecase() {
        System.out.println("RS_1 = ID for \"Bärengasse 34\"");
        System.out.println("RS_2 = ID for \"Speicherstrasse 8\"");
        System.out.println("RS_3 = ID for \"Bahnhofgasse 12\"");
        System.out.println("For which real estate would you like to see the monthlyincome? Please enter the ID of the real estate");
        String whichEstate = userInput.nextLine();
        for (RentalAgreements objectFromList6: RentalAgreements.allAgreements) {
            if (objectFromList6.getAgreementForEstate().equals(whichEstate)) {
                System.out.println("This real estate makes a total of " + objectFromList6.getMonthlyPrice() + ".- in one month");
            }
        }
        RealEstateCompanyCommands();
    }

    public static int monthlyPrice3;
    public static int monthlyPrice2;
    public static int monthlyPrice1;
    public static void yearlyincomecase() {
        String ID1 = "RS_1";
        String ID2 = "RS_2";
        String ID3 = "RS_3";
        for (RentalAgreements objectFromList7: RentalAgreements.allAgreements) {
            if (objectFromList7.getAgreementForEstate().equals(ID1)) {
                monthlyPrice1 = objectFromList7.getMonthlyPrice();
            }
        }
        for (RentalAgreements objectFromList8: RentalAgreements.allAgreements) {
            if (objectFromList8.getAgreementForEstate().equals(ID2)) {
                monthlyPrice2 = objectFromList8.getMonthlyPrice();
            }
        }
        for (RentalAgreements objectFromList9: RentalAgreements.allAgreements) {
            if (objectFromList9.getAgreementForEstate().equals(ID3)) {
                monthlyPrice3 = objectFromList9.getMonthlyPrice();
            }
        }
        int monthlyPrice1Multiplied = monthlyPrice1 * 12;
        int monthlyPrice2Multiplied = monthlyPrice2 * 12;
        int monthlyPrice3Multiplied = monthlyPrice3 * 12;

        int endresult = monthlyPrice1Multiplied + monthlyPrice2Multiplied + monthlyPrice3Multiplied;
        System.out.println("The company makes " + endresult + ".- in one year");
        RealEstateCompanyCommands();
    }

    public static void exitcase() {
        System.out.println("The program is shutting down...");
        System.exit(0);
    }

    public static void main(String[] args) {
        RentalAgreements.allAgreementsMethod();
        Apartments.allApartmentsMethod();
        RealEstateCompanyCommands();
    }
}