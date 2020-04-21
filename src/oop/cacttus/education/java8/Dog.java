package oop.cacttus.education.java8;

public class Dog extends Animal {
    private final int LEGS = 4; //qe konstante
    private String dogType;
    private String color;

    public Dog() {
        super();
    }

    public Dog(String name, String dogType, String color) {
        super(name);

        this.dogType=dogType;
        this.color=color;
    }

    public String getDogType() {
        return dogType;
    }

    public void setDogType(String dogType) {
        this.dogType = dogType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public final int getLegs() {
        return LEGS;
    }

    public void voice() {
        System.out.println("HAM HAM");
    }
}

