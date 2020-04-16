package oop.cacttus.education.java7.payroll;

import java.time.LocalDate;

public class Paycheck {
    private LocalDate payCheckDate;
    private String description;
    private int year;
    private int month;
    private Employee employee;


    public Paycheck(String description, int year, int month, Employee employee) {
        this.payCheckDate=LocalDate.now();
        this.description = description;
        this.year = year;
        this.month = month;
        this.employee = employee;
    }

    public Paycheck(LocalDate payCheckDate, String description, int year, int month, Employee employee) {
        this.payCheckDate = payCheckDate;
        this.description = description;
        this.year = year;
        this.month = month;
        this.employee = employee;
    }

    public void printPayCheck() {
        //ish dasht te dhanat e puntorit mi shtyp
        //te dhanat e paycheck
        //te dhant e pages dhe kalkulimit te pages
    }


}
