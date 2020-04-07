package oop.cacttus.education.java6;

import java.time.LocalDate;

public class Java6Main {
    public static void main(String[] args) {
        Course c = new Course(1,"OOP","Naim Sulejmani");


        Student s = new Student(1,"Ardit","Hoti");
        c.enrollStudent(s);
        //anonymous object -> anonymous array
        c.enrollStudent(new Student(2,"Ardita","Krasniqi"));


        c.enrollStudent(new Student(3,"Ali","Aliu", LocalDate.parse("2000-03-07")));
    }
}
