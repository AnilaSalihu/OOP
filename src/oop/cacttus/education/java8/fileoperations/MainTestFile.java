package oop.cacttus.education.java8.fileoperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MainTestFile {
    public static void main(String[] args) {
            shembulliFile1();
    }


    private static void shembulliFile1() {

        File file = new File("Test.txt");
        //write to file
        try {
            PrintWriter output = new PrintWriter(file);
            output.println("Endrit Veseli");
            output.printf("%s %d","Naim SUlejmani",10);
            output.println(19);
            output.close();
        } catch (IOException ex) {
            System.out.printf("Error : %s %n", ex);
        }
//        read from file
        try {
            Scanner input = new Scanner(file);
            String name = input.nextLine();
            int age = input.nextInt();
            System.out.printf("Name: %s , Age: %d %n", name, age);
        } catch (FileNotFoundException ex) {
            System.out.printf("Error: %s %n", ex);
        }
    }
}
