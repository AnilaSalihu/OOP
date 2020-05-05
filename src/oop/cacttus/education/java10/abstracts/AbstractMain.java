package oop.cacttus.education.java10.abstracts;

public class AbstractMain {
    public static void main(String[] args) {
        //Base b = new Base();
        Base base = new Derived();
        base.fun();
        System.out.println(Base.NUMRI++);
        System.out.println(Derived.NUMRI);
    }
}
