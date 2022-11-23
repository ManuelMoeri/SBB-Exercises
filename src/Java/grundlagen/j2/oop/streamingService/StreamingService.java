package Java.grundlagen.j2.oop.streamingService;

import java.util.Scanner;

public class StreamingService {

    public static void StreamingCommands() {

        String homemenu = null;
        Scanner userInput = new Scanner(System.in);
        String emailOfCustomer = null;

        do {
            System.out.println("Enter a command (\"/help\" to see all commands): ");
            homemenu = userInput.nextLine();
        } while (!homemenu.equals("/help") && !homemenu.equals("/newacc") && !homemenu.equals("/rmacc") && !homemenu.equals("/allmovies") && !homemenu.equals("/searchmov") && !homemenu.equals("/searchgenre") && !homemenu.equals("/viewed") && !homemenu.equals("/exit") && !homemenu.equals("/changecreditcard") && !homemenu.equals("/countaccs") && !homemenu.equals("/viewsonmov") && !homemenu.equals("/paymentmonthly"));

        if (homemenu.equals("/help")) {
            System.out.println("\"/help\" - See this list again");
            System.out.println("\"/newacc\" - Create a new account (You will automatically become a subscriber once signed up)");
            System.out.println("\"/rmacc\" - Delete a account by entering their e-mail");
            System.out.println("\"/allmovies\" - List all movies that are available");
            System.out.println("\"/searchmov\" - Search movies by their name");
            System.out.println("\"/searchgenre\" - Search movies by their genre");
            System.out.println("\"/viewed\" - Mark a movie as viewed");
            System.out.println("\"/changecreditcard\" - Change your creditcard by entering the email of your account");
            System.out.println("\"/countaccs\" - Counts every acc/subscriber that has been created");
            System.out.println("\"/viewsonmov\" - Prints the views on a movie");
            System.out.println("\"/paymentmonthly\" - Prints all persons with the monthly payment");
            System.out.println("\"/exit\" - Exit the program");
            StreamingCommands();

        } else if (homemenu.equals("/newacc")) {
            System.out.println("Please answer these questions to create a new account");
            System.out.println("Enter your name: ");
            String nameOfCustomer = userInput.nextLine();
            System.out.println("Enter your email: ");
            while(!userInput.nextLine().contains("@")){
                System.out.println("That's not a valid value");
                System.out.println("Try putting an @ in it");
            }
            if (userInput.nextLine().contains("@")){
                emailOfCustomer = userInput.nextLine();
            }
            System.out.println("Please enter your creditcardnumber to finish the registration");
            String creditcardOfCustomer = userInput.nextLine();
            System.out.println("How would you like to pay? Monthly or yearly? (M/Y)");
            boolean payMethodMY = false;
            String buffer = userInput.nextLine();
            if (buffer.equals("M")) {
                payMethodMY = true;
                System.out.println("Sucess! The person has been created");
            } else if (buffer.equals("Y")) {
                payMethodMY = false;
                System.out.println("Sucess! The person has been created");
            } else {
                System.out.println("That's not a valid value");
                StreamingCommands();
            }

            Persons.NewSubs(nameOfCustomer, emailOfCustomer, creditcardOfCustomer, payMethodMY);
            StreamingCommands();

        } else if (homemenu.equals("/rmacc")) {
            for (Persons objectFromList : Persons.allPersons) {
                System.out.println("Please enter your e-mail to delete your account");
                String emailFromUser = userInput.nextLine();
                if (objectFromList.getEmail().equals(emailFromUser) && Persons.allPersons.size() != 0) {
                    Persons.allPersons.remove(objectFromList);
                    System.out.println("The account has been succesfully removed!");
                    StreamingCommands();
                } else {
                    System.out.println("No Contact with this e-mail found.");
                    StreamingCommands();
                }
            }
            StreamingCommands();

        } else if (homemenu.equals("/allmovies")) {
            Movies.allmoviesMethod();
            for (Movies objectFromList1 : Movies.moviesArrayList) {
                System.out.println(objectFromList1.getMovieName());
            }
            StreamingCommands();

        } else if (homemenu.equals("/searchmov")) {
            String searchMovieName = userInput.nextLine();
            for (Movies objectFromList2 : Movies.moviesArrayList) {
                if (objectFromList2.getMovieName().contains(searchMovieName)) {
                    System.out.println(objectFromList2.getMovieName());
                }
            }
            StreamingCommands();

        } else if (homemenu.equals("/searchgenre")) {
            System.out.println("Enter the genre you're looking for:");
            String searchMovieGenre = userInput.nextLine();
            for (Movies objectFromList3 : Movies.moviesArrayList) {
                if (objectFromList3.getGenre().equals(searchMovieGenre)) {
                    System.out.println(objectFromList3.getMovieName());
                }
            }

        } else if (homemenu.equals("/viewed")) {
            System.out.println("Which Movie do you want to mark as viewed? Watch out for lower- and uppercase!");
            for (Movies objectFromList4 : Movies.moviesArrayList) {
                System.out.println(objectFromList4.getMovieName());
            }
            String setToViewed = userInput.nextLine();
            for (Movies objectFromList5 : Movies.moviesArrayList) {
                if (objectFromList5.getMovieName().equals(setToViewed)) {
                    objectFromList5.setViewed(true);
                    objectFromList5.addWatchestotal(1);
                    System.out.println("The movie has ben marked as viewed");
                }
            }
            StreamingCommands();

        } else if (homemenu.equals("/changecreditcard")) {
            System.out.println("Please enter the e-mail address of your account to change the creditcard:");
            String findEmail = userInput.nextLine();
            for (Persons objectfromlist6 : Persons.allPersons) {
                if (objectfromlist6.getEmail().equals(findEmail)) {
                    System.out.println("Please enter your new creditcardnumber");
                    String changeCreditcard = userInput.nextLine();
                    for (Persons objectFromList7 : Persons.allPersons) {
                        if (objectFromList7.getEmail().equals(findEmail)) {
                            objectFromList7.setCreditCard(changeCreditcard);
                        }
                    }
                } else {
                    System.out.println("No account with this e-mail found");
                    StreamingCommands();
                }
            }
            StreamingCommands();

        } else if (homemenu.equals("/countaccs")) {
            System.out.println("There are " + Persons.allPersons.size() + " accounts at the moment");
            StreamingCommands();

        } else if (homemenu.equals("/viewsonmov")) {
            System.out.println("On which movie would you like to see the views? Please enter the name of the movie (Upper- lowercase!)");
            for (Movies objectFromList8: Movies.moviesArrayList) {
                System.out.println(objectFromList8.getMovieName());
            }
            String viewsOnMov = userInput.nextLine();
            for (Movies objectFromList9: Movies.moviesArrayList)
                if (objectFromList9.getMovieName().equals(viewsOnMov)) {
                    System.out.println("There are a total of " + objectFromList9.getWatchestotal() + " views on this movie");
                }
            StreamingCommands();

        } else if (homemenu.equals("/paymentmonthly")) {
            for (Persons test: Persons.allPersons) {
                if (test.getPayYearMonth()) {
                    System.out.println(test.getCreditCard());
                }
            }
            StreamingCommands();

        } else if (homemenu.equals("/exit")) {
            System.out.println("The program is shutting down...");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Movies.allmoviesMethod();
        StreamingCommands();
    }
}