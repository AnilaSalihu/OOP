package oop.cacttus.education.java9.efatura;

import java.util.ArrayList;

public class FaturaTjera extends Fatura {
    private ArrayList<Artikulli> artikujt;

    public double getTotaliFatures() {
        double sum=0;
        for(Artikulli a: artikujt) {
            sum += a.getTotal();
        }

        return sum;
    }

    @Override
    public void print() {

        System.out.println("Shfaq te dhenat e fatures HEADER");
        System.out.println("SHFAQ DETALET QE I KE BLE ");
        for(Artikulli a: artikujt) {
            System.out.println(a.toString());
        }

        System.out.println("SHFAQ TOTALIN NETO, TVSH DHE AMOUNT");
    }
}
