package oop.cacttus.education.java8;

import java.util.ArrayList;

public class Java8Main {
    public static void main(String[] args) {
//        B1 b = new B1();
//        b.get().get().message();
//        b.message();

        //B b = new B();

        Animal animal = new Cat("Jerry","black","komediane");
        Animal animal2 = new Dog();
        animal.voice();
        animal2.voice();
//        if(true) {
//            ZooManager.addAnimal(new Dog());
//        }
//        else {
//            ZooManager.addAnimal(new Cat());
//        }
    }
}
