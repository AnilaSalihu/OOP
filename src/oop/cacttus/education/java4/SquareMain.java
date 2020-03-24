package oop.cacttus.education.java4;

public class SquareMain {
    public static void main(String[] args) {
        Square katrori1 = new Square(4);
        katrori1.setA(10);
        System.out.println(katrori1.calcPerimeter());
        System.out.println(katrori1.calcSyprine());
        katrori1.draw();
    }
}
