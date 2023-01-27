package Java.grundlagen.j5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileWriter {

public static java.io.FileWriter myWriter;
public static Scanner userInput = new Scanner(System.in);
public static String writeInTheFile;
    public static void main(String[] args) {
        try {
            myWriter = new java.io.FileWriter("/home/mmoeri/Downloads/applicationLog.txt");
            writeInFile();
            myWriter.write(writeInTheFile);
            myWriter.close();
            System.out.println("Your message has been written! The file name is \"applicationLog.txt\"");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeInFile() {
        System.out.println("What would yo like to write in the file?");
        writeInTheFile = userInput.nextLine();
    }
}