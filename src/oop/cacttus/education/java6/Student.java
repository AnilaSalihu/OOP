package oop.cacttus.education.java6;

import java.time.LocalDate;

public class Student {
    //final nese perdoret tek variablat -> e ka kuptimin se eshte konstante
    //dhe duhet te inicializohet menjehere ose ne konstruktore
    private final int ID;
    private String name;
    private String surname;
    private LocalDate birthdate; //u kriju nje lidhje me klasen LocalDate-> kompozicioni/agregation

    public Student(int ID, String name, String surname, LocalDate birthdate) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public Student(int ID, String name, String surname) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.birthdate = LocalDate.now();//gjithqysh duhet me pas vlere per kompozicion
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public int getID() {
        return this.ID;
    }

//    public void setID(int id) {
//        this.ID=id;
//    }
}
