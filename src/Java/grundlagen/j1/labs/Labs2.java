package Java.grundlagen.j1.labs;

import java.util.Scanner;

class Labs2 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();


        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        String age = scanner2.nextLine();

        System.out.println("Hello " + name + " you are " + age + " years old!");
    }
}
