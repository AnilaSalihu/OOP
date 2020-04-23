package oop.cacttus.education.java8.preworkshop;

public class SportVehicle extends PassengerVehicle {
    private  double speedBoost;

    public SportVehicle() {
        speedBoost=100;
        Engine eng = new Engine(FuelType.PETROL,300);
        this.setEngine(eng);
        //this.setFuel(FuelType.PETROL);
    }

    public SportVehicle(int numberOfWheels, String color, FuelType fuel, int maxSpeed, int currentSpeed, String vinNo, int seats, double speedBoost) {
        super(numberOfWheels, color, fuel, maxSpeed, currentSpeed, vinNo, seats);
        this.speedBoost=speedBoost;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("Speedboost  = %f",speedBoost);
    }
}
