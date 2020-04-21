package oop.cacttus.education.java8;

import java.util.ArrayList;

public class ZooManager {
    private static ArrayList<Animal> animals=new ArrayList<>();

    public static void addAnimal(Animal animal) {
        //dynamic bindings
        animals.add(animal);
    }
}
