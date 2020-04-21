package oop.cacttus.education.java8;

public class B1 extends A {
    B1 get() {
        return this;
    }

    void message(){
        System.out.println("This is a covariant return type");
    }
}
