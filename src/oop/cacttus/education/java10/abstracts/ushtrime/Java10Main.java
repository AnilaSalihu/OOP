package oop.cacttus.education.java10.abstracts.ushtrime;

public class Java10Main {
    public static void main(String[] args) {
        Shape rrethi = new Circle();
        Shape katrori = new Square();

        Shape[] shapes = new Shape[2];
        shapes[0]=rrethi;
        shapes[1]=katrori;

        //Circle cricle = (Circle)rrethi;
//        rrethi.draw();
//        rrethi.whatIAm();

        for (Shape shape:shapes) {
            shape.whatIAm();
            shape.draw();
            if(shape instanceof Square){
                //((Square)shape).rotate();
                Square square = (Square)shape;
                square.rotate();
            }

        }

    }
}
