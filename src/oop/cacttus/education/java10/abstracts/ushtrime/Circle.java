package oop.cacttus.education.java10.abstracts.ushtrime;

public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("O");
    }

    @Override
    public void whatIAm() {
        super.whatIAm();
        System.out.println("I am a circle :)");
    }
}
