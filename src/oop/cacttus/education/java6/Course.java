package oop.cacttus.education.java6;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Course {
    private final int ID;
    private String name;
    private String lecturer; // ne te ardhmen kjo mundet me qene objekt i kalses Profesor/Lecturer
    //private Student[] enrolledStudents;
    private ArrayList<Student> enrolledStudents; //lidhja e nje kursi me 0..N studenta

    public Course(int ID, String name, String lecturer) {
        this.ID = ID;
        this.name = name;
        this.lecturer = lecturer;
        enrolledStudents = new ArrayList<Student>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public int getID() {
        return ID;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void printCourseDetails() {
        System.out.println("Kursi: " + this.name);
        System.out.println("Lecturer: "+this.lecturer);
        System.out.println("Total student enrolled: " + this.enrolledStudents.size());
        for (Student s : enrolledStudents) {
            System.out.printf("%d - %s %s %s %n",
                    s.getID(), s.getName(), s.getSurname(), s.getBirthdate().format(DateTimeFormatter.ISO_DATE));

        }
    }
}
