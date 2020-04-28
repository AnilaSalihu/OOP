package oop.cacttus.education.java9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Java9Main {
    public static void main(String[] args) {
            //exception1(args);
            //exception2(args);
            //exception3(args);

            //countLines("C:\\nukekziostonkyfajllapokuptonajoapoetjetj.txt");

        try {
            countLinesThrows("C:\\nukekziostonkyfajllapokuptonajoapoetjetj.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static int countLinesThrows(String fileName) throws FileNotFoundException {
        int counter =0;
        Scanner reader = null;
        reader = new Scanner(new File(fileName));
        //pjesa tjeter e merrni nga slide d.sh.
        return 10;
    }


    static int countLines(String fileName) {
        int counter =0;
        Scanner reader = null;
        try {
            reader = new Scanner(new File(fileName));
        }
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("inserto ne file");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        //pjesa tjeter e merrni nga slide d.sh.
        return 10;
    }

    static void exception3(String[] args) {
        args = new String[]{"1", "10", "tre", "13"};
        int sum = 0;
        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            }catch (NumberFormatException ex) {
                System.out.printf("Gabimi ndodhi gjate konvertimit te %s ne int!%n",arg);
            }
            finally {
                System.out.printf("Vlera e elementit te vargut eshte %s %n",arg);
            }
        }
        System.out.println(sum);
    }

    static void exception2(String[] args) {
        args = new String[]{"1", "10", "tre", "13"};
        int sum = 0;
        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            }catch (NumberFormatException ex) {
                System.out.printf("Gabimi ndodhi gjate konvertimit te %s ne int!%n",arg);
            }
        }
        System.out.println(sum);
    }

    static  void exception1(String[] args) {
        try {
            args = new String[]{"1", "10", "tre", "13"};
            int sum = 0;
            for (String arg : args) {
                sum += Integer.parseInt(arg);
            }
            System.out.println(sum);
            throw new Exception("Palidhje expectiopn");

        }
        catch (NumberFormatException ex) {
            System.out.println("Gabimi ne numra");
        }
        catch(Exception ex) {
//            if(ex instanceof  NumberFormatException) {
//                System.out.println("gabim ne numra");
//            }
//             else
            System.out.println("Tjeter gabim");
        }
    }
}
