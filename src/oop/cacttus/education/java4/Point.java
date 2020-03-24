package oop.cacttus.education.java4;

public class Point {
    private double x;
    private double y;


    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean isOrigin() {
//        if(x==0 && y ==0) return true;
//        else return false;
        return x == 0 && y == 0; // TRUE && TRUE kthen TRUE, perndryshe krejt tjerat FALSE
        // return x==y && x==0;
    }


    public double distanceTo(Point to) {
        //Prej this object qe eshte vet klasa -> to (deri te to object)
        // rrenja katrore [(X2-x1)^2+ (y2-y1)^2];
        return Math.sqrt((this.x - to.x) * (this.x - to.x) + (this.y - to.y) * (this.y - to.y));
//        return Math.sqrt(Math.pow(this.x - to.x, 2) + Math.pow(this.y - to.y, 2));
    }

}
