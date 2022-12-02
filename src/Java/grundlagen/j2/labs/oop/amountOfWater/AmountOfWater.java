package Java.grundlagen.j2.labs.oop.amountOfWater;

import java.util.Scanner;

public class AmountOfWater {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean openDamYN = false;

        System.out.println("Welcome! You are now in control of this Dam. Your input controls if the dam will open");
        System.out.println("First please enter the water incoming in hectoliters");
        int incomingWaterOfCustomer = userInput.nextInt();

        System.out.println("Then please enter how much water flows out, in hecoliters aswell");
        int outgoingWaterOfCustomer = userInput.nextInt();

        if (incomingWaterOfCustomer > outgoingWaterOfCustomer) {
            System.out.println("The incoming water is greater than the outgoing. The dam is opening...");
            openDamYN = true;
        } else {
            System.out.println("The incoming water is smaller than the outgoing. The dam stays closed.");
            openDamYN = false;
        }

        Dam.everyWaterObjectMethod(incomingWaterOfCustomer, outgoingWaterOfCustomer, openDamYN);
    }
}