package oop.cacttus.education.java4;

public class Square {
    private double a;

    public Square() {

    }

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a > 0)
            this.a = a;
    }

    public double calcPerimeter() {
        return 4 * a;
    }

    public double calcSyprine() {
        return a * a;
    }

    public void draw() {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
