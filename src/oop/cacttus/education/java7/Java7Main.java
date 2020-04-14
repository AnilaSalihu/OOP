package oop.cacttus.education.java7;

import java.util.ArrayList;

public class Java7Main {
    public static void main(String[] args) {
        //WalkingBird pata = new WalkingBird("E Zeze","miser");
        Goose pata = new Goose("E zeze","Miser");
        Ostrich o = new Ostrich("E bardhe","gjethe");



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

        //Sa here qe t ekeni nje grumbull te infomratave me ruajt
        //1. Array te thjeshte, ose ArrayList, ArrayList<T>, ose COllection !?
    }
}
