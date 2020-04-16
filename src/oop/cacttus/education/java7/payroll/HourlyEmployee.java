package oop.cacttus.education.java7.payroll;

public class HourlyEmployee extends Employee {

    private int hours;
    private double hourlyWage;

    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(int id, String name, String surname, int hours, double hourlyWage) {
        super(id, name, surname);
        setHours(hours);
        setHourlyWage(hourlyWage);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0)
            this.hours = hours;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        if (hourlyWage >= 0)
            this.hourlyWage = hourlyWage;
    }

    public double getSalary() {
        return this.hours * this.hourlyWage;
    }
}
