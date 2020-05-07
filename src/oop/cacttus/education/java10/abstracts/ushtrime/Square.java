package oop.cacttus.education.java10.abstracts.ushtrime;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("----");
        System.out.println("|[]|");
        System.out.println("----");
    }

    @Override
    public void whatIAm() {
        super.whatIAm();
        System.out.println("I am a square");
    }

    public void rotate() {
        System.out.println("Rotating ...");
    }

}
