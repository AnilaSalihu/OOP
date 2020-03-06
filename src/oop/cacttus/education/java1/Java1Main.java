package oop.cacttus.education.java1;

import java.awt.*;

public class Java1Main {
    public static void main(String[] args) {
        Player rashica = new Player();
        rashica.setName("Milot");
        rashica.setSurname("Rashica");
        rashica.setPlayerNo((byte) 7);
        rashica.setGoals((short) 20);

        Player bardhi = new Player();
        bardhi.setName("Enis");
        bardhi.setSurname("Bardhi");
        bardhi.setPlayerNo(Byte.parseByte("10"));
        bardhi.setGoals(Short.parseShort("15"));

//        System.out.printf("%s %s me numer %d ka dhene %d gola!%n",
//                rashica.getName(),rashica.getSurname(),
//                rashica.getPlayerNo(),rashica.getGoals());
//        System.out.printf("%s %s me numer %d ka dhene %d gola!%n",
//                bardhi.getName(),bardhi.getSurname(),
//                bardhi.getPlayerNo(),bardhi.getGoals());

        printPlayer(rashica);
        printPlayer(bardhi);

        rashica.print();
        bardhi.print();
    }

    public static void printPlayer(Player player) {
        System.out.printf("%s %s me numer %d ka dhene %d gola!%n",
                player.getName(),player.getSurname(),
                player.getPlayerNo(),player.getGoals());
    }











}
