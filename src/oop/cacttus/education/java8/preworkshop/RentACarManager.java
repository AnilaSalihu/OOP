package oop.cacttus.education.java8.preworkshop;

import java.util.ArrayList;

public class RentACarManager {
    private  ArrayList<Vehicle> stockVehicles = new ArrayList<>();

    public  void registerNewVehicle(Vehicle vehicle) {
        stockVehicles.add(vehicle);
    }


    public  void testAllVehicles() {
        for (Vehicle vehicle : stockVehicles) {
            //njejt sikur me thirr    vehicle.toString(), java  si t eshte objet e thirr toString()
            System.out.printf("%s %s",vehicle, vehicle.start() ? "Vetura punon" : "Vethura nuk u dhez");
        }
    }
}
