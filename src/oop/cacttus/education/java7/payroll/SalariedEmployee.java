package oop.cacttus.education.java7.payroll;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee() {
        //default e inicion super() ska nevoje per perseritje
    }

    public SalariedEmployee(int id, String name, String surname, double salary) {
        super(id, name, surname);
        setSalary(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("%n Rroga mujore bruto: %.2f %n", getSalary());
    }
}
