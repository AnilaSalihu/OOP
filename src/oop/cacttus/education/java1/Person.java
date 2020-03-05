package oop.cacttus.education.java1;

public class Person {
    // fillimisht duhet te definohen variablat e klases
    private String name;
    private String surname;
    private short yearOfBirth;

    //deklarimi i vetive per ti percaktuar qasjet ne variabla
    public String getName() {
        return name;
    }

    public void setName(String _name) {
        name = _name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public short getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(short yearOfBirth) {
        if(yearOfBirth>1900)
            this.yearOfBirth = yearOfBirth;
        else this.yearOfBirth=2020;
    }

}






