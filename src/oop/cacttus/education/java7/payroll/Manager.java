package oop.cacttus.education.java7.payroll;

public class Manager extends SalariedEmployee {
    private String department;

    public Manager() {

    }

    public Manager(int id, String name, String surname, double salary, String department) {
        super(id, name, surname, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
