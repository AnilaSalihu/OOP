package oop.cacttus.education.java4;

public class PointMain {
    public static void main(String[] args) {

        Point a = new Point(2, 3);
        Point b = new Point(-1, 3);

        System.out.printf("Distanca nga pika A deri ne piken B eshte %f %n", a.distanceTo(b));
        System.out.printf("Distanca nga pika B deri ne piken A eshte %f %n", b.distanceTo(a));
    }
}
