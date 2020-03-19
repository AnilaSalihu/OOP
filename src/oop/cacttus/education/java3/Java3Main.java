package oop.cacttus.education.java3;

import java.util.Scanner;

public class Java3Main {
    public static void main(String[] args) {
        Season season = Season.FALL;
        Season season2 = Season.valueOf("FALL");
        System.out.println(season);
        System.out.println(season2);
        //String NAME;
        String userSeason;
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj sezonen: ");
        userSeason = reader.nextLine();
        Season season3 = Season.valueOf(userSeason.toUpperCase());

        System.out.println("Sezona e zgjedhur eshte: " + season3);

        if (season == season2) {
            System.out.println("jane te barabarte!");
        }

        if (season.equals(season2)) {
            System.out.println("Jane te barabarte perseri!");
        }
        System.out.println("------------------------------------------");
        //metoda values() na kthen nje array me secilin element te enum qe e ka (element
        //nenkuptojme public static final variablat qe jane shkruar me shkronja te medha

        switch (season3) {
            case WINTER:
                System.out.println("Ju keni zgjedhur dimirin si stine te preferuar");
                break;
            case SPRING:
                System.out.println("Ju keni zgjedhur pranveren");
                break;
            case SUMMER:
                System.out.println("Ju keni zgjedhur veren");
                break;
            case FALL:
                System.out.println("Ju keni zgjedhur vjeshten");
                break;
            default:
                System.out.println("JU nuk keni zgjedhur ndonje stine qe ekziston");
                break;
        }


        System.out.println("Stina duke perdore fusha dhe metoda tjera");

        Stina s = Stina.DIMIR;
        System.out.println(s);
        System.out.println(s.getValue());
        System.out.println(s.getNameEng());

        for (Stina stina : Stina.values()) {
            System.out.printf("%s ka vlere: %d dhe ka emrin ne anglisht %s %n",
                    stina, stina.getValue(),stina.getNameEng());
        }


    }
}
/*

 */
