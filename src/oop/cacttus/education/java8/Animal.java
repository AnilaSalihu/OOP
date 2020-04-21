package oop.cacttus.education.java8;

public class Animal {
    public String name;

    public Animal() {

    }

    public Animal(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println("no voice");
    }

}
