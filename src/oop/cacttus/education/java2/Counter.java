

package oop.cacttus.education.java2;

public class Counter {
    private int counter; //nje atribut (variabel) i inicializuar
    private int maxCounterValue;

    //deklarimi i konstruktoreve
    public Counter() {
        //default konstruktori - pergjegjes me ndertu/inicializu objektin
        counter = 0;
        maxCounterValue = Integer.MAX_VALUE;
    }

    public Counter(int startNo, int endNo) {
        counter = startNo;
        maxCounterValue = endNo;
    }

    public void increment() {
        if (counter < maxCounterValue)
            counter++;
    }

    public int getCounter() {
        return counter;
    }
}
