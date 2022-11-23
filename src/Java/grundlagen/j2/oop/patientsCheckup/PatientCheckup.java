package Java.grundlagen.j2.oop.patientsCheckup;

import java.util.Scanner;

public class PatientCheckup {

    public static void main(String[] args) throws InterruptedException {

        Scanner userInput = new Scanner(System.in);

        String CheckupYN;

        do {
            System.out.print("Nextup is a quick checkup. Please Type in Y to start with the checkup, or type in N to Exit the programm! (Y/N): ");
            CheckupYN = userInput.nextLine();
        } while (!CheckupYN.equals("Y") && !CheckupYN.equals("N"));
        switch (CheckupYN) {
            case "N" -> System.exit(0);
        }

        System.out.print("Enter your full name: ");
        String nameOfPatient = userInput.nextLine();
        System.out.print("Enter your age: ");
        int ageOfPatient = userInput.nextInt();
        System.out.print("Enter your size in cm: ");
        float sizeOfPatient = userInput.nextFloat();
        System.out.print("Enter your Temperature in °: ");
        float temperatureOfPatient = userInput.nextFloat();
        System.out.print("Are you vaccinated? (Y/N): ");
        String vaccinatedPatient = userInput.next();

        if (vaccinatedPatient.equals("Y")) {
            vaccinatedPatient = "vaccinated";
        } else if (vaccinatedPatient.equals("N")) {
            vaccinatedPatient = "not vaccinated";
        }

        System.out.println("The name of the patient is: " + nameOfPatient + ". The patient is " + ageOfPatient + " years old, is " + sizeOfPatient + " cm big and has a body temperature of " + temperatureOfPatient + " degrees. The patient is " + vaccinatedPatient + "." );

        Patient.createNewPatient(nameOfPatient, ageOfPatient, sizeOfPatient, temperatureOfPatient, vaccinatedPatient);
    }
}