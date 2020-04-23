package oop.cacttus.education.java8.preworkshop;

public class Engine {
    private FuelType fuel;
    private int horsePower;

    public Engine() {
    }

    public Engine(FuelType fuel, int horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
    }

    public FuelType getFuel() {
        return fuel;
    }

    public void setFuel(FuelType fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
