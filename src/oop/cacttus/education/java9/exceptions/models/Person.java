package oop.cacttus.education.java9.exceptions.models;

import oop.cacttus.education.java9.exceptions.exceptions.EmptyStringException;
import oop.cacttus.education.java9.exceptions.exceptions.NegativeNumberException;
import oop.cacttus.education.java9.exceptions.exceptions.OnlySpaceStringException;

import java.time.LocalDate;
//class -> model
public class Person {
    private int id; // 0
    private String name; // null
    private String surname;
    private LocalDate birthDate; // null

    public Person() {
    }

    public Person(int id, String name, String surname, LocalDate birthDate)
            throws NegativeNumberException,OnlySpaceStringException,EmptyStringException {
        setId(id);
        setName(name);
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws NegativeNumberException {
        if(id<=0) throw new NegativeNumberException("Numer negative",id);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws EmptyStringException, OnlySpaceStringException {
        if(name.equals("")) throw new EmptyStringException("Tekst i zbrazet, ju lutem plotesoni!");
        if(name.trim().equals("")) throw new OnlySpaceStringException("Mos leni hapesira ne tekst!",name);

        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
