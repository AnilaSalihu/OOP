package oop.cacttus.education;

import oop.cacttus.education.java1.Person;

public class Main {

    public static void main(String[] args) {
	//krijimi i objektit nga klasa Person
        int a;
        Person person1; //deklarimi i variables me tip reference
        person1 = new Person(); //inicializimi i variables, kontruktimi i variables
        //krijimi i objektit

        Person person2 = new Person(); // deklarimi dhe inicializmi
        person1.setName("Naim");
        person1.setSurname("Sulejmani");
        person1.setYearOfBirth((short)-1999);

        System.out.printf("%s %s i lindur me %d",person1.getName(),person1.getSurname(),
                person1.getYearOfBirth());
    }


}
