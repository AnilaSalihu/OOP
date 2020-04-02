package oop.cacttus.education;

import oop.cacttus.education.java1.Person;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList names = new ArrayList( );
        names.add("Billy");
        names.add(190l);
        names.add(190d);
        int c = 3;
        names.add(c);

        ArrayList<Integer> list = new ArrayList<>(10);

        Object x = names.get(0);
        Object y = names.get(1);
        String k = names.get(1).toString();
        System.out.println(x);
        System.out.println(k);
        System.out.println(y);
        System.out.println(names.get(2));
        System.out.println(names.get(3));
        int a[] =new int[10];
        a[0]=10;
        a[1]=2;

        //krijimi i objektit nga klasa Person
//        int a;
//        int[] b;
//        int c[];
//        Person person1; //deklarimi i variables me tip reference
//        person1 = new Person(); //inicializimi i variables, kontruktimi i variables
//        //krijimi i objektit
//
//        Person person2 = new Person(); // deklarimi dhe inicializmi
//        person1.setName("Naim");
//        person1.setSurname("Sulejmani");
//        person1.setYearOfBirth((short)-1999);
//
//        System.out.printf("%s %s i lindur me %d",person1.getName(),person1.getSurname(),
//                person1.getYearOfBirth());
    }


}
