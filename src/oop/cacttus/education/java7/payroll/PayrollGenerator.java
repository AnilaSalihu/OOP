package oop.cacttus.education.java7.payroll;

import java.util.ArrayList;

public class PayrollGenerator {
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void generatePaychekForAll(String description, int year, int month) {
        for(Employee e: employees) {
            Paycheck p = new Paycheck(description,year,month,e);
            p.printPayCheck();
        }
    }
    //ketu duhet me u ruajt lista e punetoreve
    //duhet me pas mundesi me kriju puntor te ri ose me fshi ose me bo update
    //duhet me pas mundesi nje metode e cila i krijon paycheck per te gjithe punetoret
}
