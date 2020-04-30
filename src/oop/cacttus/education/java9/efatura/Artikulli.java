package oop.cacttus.education.java9.efatura;

public class Artikulli {
    private int id;
    private String name;
    private double price;
    private double quantity;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getTotal() {
        return getPrice()*getQuantity();
    }

    @Override
    public String toString() {
        return String.format("%d  %s     %f    %f   %f",id,name,quantity,price,getTotal());
    }
}
