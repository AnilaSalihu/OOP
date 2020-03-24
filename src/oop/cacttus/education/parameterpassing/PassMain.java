package oop.cacttus.education.parameterpassing;

public class PassMain {
    public static void main(String[] args) {
        PassTest pt = new PassTest();

        int value = 2020;
        pt.changePrimitiveTypes(value);
        System.out.println(value);


        //from  adresa memorike 0xF1
        MyDate from = new MyDate(19, 3, 2020);
        //to adresa memorike    0xF2
        MyDate to = new MyDate(20, 4, 2021);

        // kur thret nje metode dhe jep vlera reference -> i shkojne kopjet e references


        pt.changeReference(from, to);
        System.out.println(from.getYear());

        System.out.println(from.getDay());
        pt.changeObjectDate(from,1);
        System.out.println(from.getDay());


    }
}
