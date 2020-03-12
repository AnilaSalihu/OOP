package oop.cacttus.education.online1_java2;

import oop.cacttus.education.Main;

public class MainOnline1 {
    public static void main(String[] args) {
        System.out.println(Vehicle.getVehicleCount());
        Vehicle vehicle = new Vehicle();
        System.out.println(Vehicle.getVehicleCount());
        Vehicle vehicle1 = new Vehicle("BMV", "X5", 280f);
        System.out.println(Vehicle.getVehicleCount());


        //qysh me kriju nje objekt te klases MainOnline1
        //MainOnline1 main1 = new MainOnline1();

    }
}
