package oop.cacttus.education.java8.preworkshop;

public class Vehicle {
    private int numberOfWheels;
    private String color;
    private int maxLiter;
    private int currentLiter;
    private Engine engine;
    private int maxSpeed;
    private int currentSpeed;
    private String vinNo;

    public Vehicle() {
    }

    public Vehicle(int numberOfWheels, String color, FuelType fuel, int maxSpeed, int currentSpeed, String vinNo) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;
      //  this.fuel = fuel;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
        this.vinNo = vinNo;
    }


    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    public FuelType getFuel() {
//        return fuel;
//    }
//
//    public void setFuel(FuelType fuel) {
//        this.fuel = fuel;
//    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getVinNo() {
        return vinNo;
    }

    public void setVinNo(String vinNo) {
        this.vinNo = vinNo;
    }




    public boolean start() {
        return Math.random()>0.20;
    }

    public void brake() {
        if(currentSpeed>0) {
            currentSpeed--;
        }
    }

    public void accelerate() {
        if(currentSpeed<maxSpeed) {
            currentSpeed++;
        }
    }


    @Override
    public String toString() {
        return String.format("%d %s %s %d %d %s",getNumberOfWheels(),getColor(),getMaxSpeed(),getCurrentSpeed(),getVinNo());
    }
}
