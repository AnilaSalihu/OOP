package oop.cacttus.education.java7;

import java.util.ArrayList;
import java.util.LinkedList;

public class Java7Main {
    public static void main(String[] args) {
        //WalkingBird pata = new WalkingBird("E Zeze","miser");
        Goose pata = new Goose("E zeze","Miser");
        Ostrich o = new Ostrich("E bardhe","gjethe");
        //System.out.println(pata.toString());


        ArrayList aviary1 = new ArrayList();
        aviary1.add(pata);
        aviary1.add(o);


        ArrayList<Bird> aviary = new ArrayList<>();
        aviary.add(pata);
        aviary.add(o);

        for(Bird bird: aviary) {
            System.out.println(bird.toString());
        }

        Bird[] birds = new Bird[100];
        birds[0]=pata;
        birds[1]=o;

        LinkedList<Bird> shpezet = new LinkedList<>();
        shpezet.add(pata);
        shpezet.add(o);
        //Sa here qe t ekeni nje grumbull te infomratave me ruajt
        //1. Array te thjeshte, ose ArrayList, ArrayList<T>, ose COllection !?


        Parrot papagalli1 = new Parrot("mix","sdicka");
        TalkingParrot papagalli2 = new TalkingParrot("mix","sdicka", new String[]{"Hello","qysh je",
                "ka me ju rrzu profa prej provimit","hahaha"});
        papagalli1.getFood();
        papagalli2.getPhrases();
        //metoden kerko nga klasa e vet, nese nuk e ka shiko prej nga vjen (tashegohet)


    }
}
