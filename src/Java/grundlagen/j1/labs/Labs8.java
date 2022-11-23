package Java.grundlagen.j1.labs;

import java.util.Scanner;

public class Labs8 {

    public static void numposition(String numberarray, String onenumber) {

        String[] splitted = numberarray.split("");

        int length0 = splitted.length - 1;

        while (length0 > -1) {
            if (splitted[length0].equals(onenumber)) {
                System.out.println("The Postion is " + length0);
                break;
            } else {
                length0--;
            }
        }
    }

    public static void biggestnum() {

        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int value0 = userinput.nextInt();
        int[] value1 = new int[value0];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < value0; i++) {
            value1[i] = userinput.nextInt();
        }
        int max = value1[0];
        for (int i = 0; i < value0; i++) {
            if (max < value1[i]) {
                max = value1[i];
            }
        }
        System.out.println("Maximum value in the array is: " + max);
    }

    public static void main(String[] args) {

        // Position of certain number
        Scanner numarray = new Scanner(System.in);
        System.out.println("Please enter your Numberarray: ");
        String numberarray = numarray.nextLine();

        Scanner onenum = new Scanner(System.in);
        System.out.println("Please enter a number to find out the postition of the Number: ");
        String onenumber = onenum.nextLine();

        numposition(numberarray, onenumber);


        // Biggest number in array
        biggestnum();
    }
}