package oop.cacttus.education.java7;

public class Bird  {
    private String color;
    private String food;
    private String movement;


    public Bird(String color, String food, String movement) {
        super();
        this.color = color;
        this.food = food;
        this.movement = movement;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getMovement() {
        return movement;
    }

//    protected void setMovement(String movement) {
//        this.movement = movement;
//    }


    @Override
    public String toString() {
        return String.format("%s %s %s",color,food,movement);
    }
}
