package oop.cacttus.education.online1_java2;

import oop.cacttus.education.Main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainOnline1 {
    public static void main(String[] args) {
        System.out.println(Vehicle.getVehicleCount());
        Vehicle vehicle = new Vehicle();
        System.out.println(Vehicle.getVehicleCount());
        Vehicle vehicle1 = new Vehicle("BMV", "X5", 280f);
        System.out.println(Vehicle.getVehicleCount());

        LocalDate ld = LocalDate.parse("2020-02-29");

        ld=ld.minusYears(-1);
        System.out.println(ld.format(DateTimeFormatter.BASIC_ISO_DATE));
        ld=ld.plusYears(1);
        System.out.println(ld.format(DateTimeFormatter.BASIC_ISO_DATE));
        //qysh me kriju nje objekt te klases MainOnline1
        //MainOnline1 main1 = new MainOnline1();

    }
}
