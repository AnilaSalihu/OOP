package oop.cacttus.education.java8.preworkshop;

public class MainTest {
    public static void main(String[] args) {
            SportVehicle s = new SportVehicle();
            //s.setFuel(FuelType.PETROL);
            s.setMaxSpeed(400);
            s.setCurrentSpeed(0);
            s.setVinNo("12346567");
            s.setNumberOfWheels(4);
            s.setSeats(2);

            //thirrja me static
//            RentACarManager.registerNewVehicle(s);
//            RentACarManager.testAllVehicles();


        //thirrja me objekt
        RentACarManager rent = new RentACarManager();
        rent.registerNewVehicle(s);
        rent.testAllVehicles();

    }

    private void showMenu(){

    }
}
