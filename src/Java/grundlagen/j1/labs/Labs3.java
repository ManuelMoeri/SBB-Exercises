package Java.grundlagen.j1.labs;

import java.util.Scanner;

class Labs3 {

    public static class PiInJava {

        public static double result(int r) {

            return java.lang.Math.PI * (r * r);
        }

        public static void main(String[] args) {
            //rectangle
            Scanner width = new Scanner(System.in);
            System.out.println("Please enter the width of the rectangle: ");
            int w = width.nextInt();

            Scanner height = new Scanner(System.in);
            System.out.println("Please enter the height of the rectangle: ");
            int h = height.nextInt();

            int sum = h * w;

            System.out.println("The rectangle is " + sum + " cm2 big!");


            //circle
            Scanner radius = new Scanner(System.in);
            System.out.println("Please enter the radius of the circle: ");
            int r = radius.nextInt();

            System.out.println("The Circle is " + result(r) + " cm2 big!");


            //rectangle scope
            Scanner side1 = new Scanner(System.in);
            System.out.println("Please enter the length of side A: ");
            int s1 = side1.nextInt();

            Scanner side2 = new Scanner(System.in);
            System.out.println("Please enter the length of side B: ");
            int s2 = side2.nextInt();

            int side11 = s1 + s1;
            int side22 = s2 + s2;

            int overall = side11 + side22;

            System.out.println("The rectangle has a scope of " + overall + " cm!");


            //pyramide
            Scanner ground = new Scanner(System.in);
            System.out.println("Please enter the length of your Pyramide: ");
            int groundpy = ground.nextInt();

            Scanner heightp = new Scanner(System.in);
            System.out.println("Please enter the height of your Pyramide: ");
            int heightpy = heightp.nextInt();

            int finalresult = (groundpy * groundpy) * heightpy / 3;

            System.out.println("Your Pyramide is " + finalresult + " cm3 big!");


        }
    }
}
