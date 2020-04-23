package oop.cacttus.education.java8.preworkshop;

public class PassengerVehicle extends Vehicle {
    private int seats;

    public PassengerVehicle() {
        //0 seats, maxSpeed=0
    }

    public PassengerVehicle(int numberOfWheels, String color, FuelType fuel, int maxSpeed, int currentSpeed, String vinNo, int seats) {
        super(numberOfWheels, color, fuel, maxSpeed, currentSpeed, vinNo);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("%n Seats = %d %n",getSeats());
    }
}
