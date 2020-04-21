package oop.cacttus.education.java8;

public class Cat extends Animal {
    private int numberOfLifes = 9;
    private String color;
    private String catType;


    public Cat() {
        super();
    }

    public Cat(String name, String color, String catType) {
        super(name);
        this.color=color;
        this.catType=catType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCatType() {
        return catType;
    }

    public void setCatType(String catType) {
        this.catType = catType;
    }
    public void simulateCatDeath() {
        if(numberOfLifes>0) numberOfLifes--;
        else System.out.println("Cat already death!!!");
    }

    public int getNumberOfLifes(){
        return numberOfLifes;
    }

    public void voice() {
        System.out.println("MJAU MJAU");
    }

}
