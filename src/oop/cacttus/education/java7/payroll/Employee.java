package oop.cacttus.education.java7.payroll;

public class Employee extends Object {
    private int id;
    private String name;
    private String surname;

    public Employee() {

    }

    public Employee(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
}
