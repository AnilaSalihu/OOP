package oop.cacttus.education.java7.payroll;

public class PayrollMain {
    public static void main(String[] args) {
        Employee manager = new Manager(1,"Naim","Sulejmani",300,"IT");
        Employee programmer = new Programmer(2,"Astrit","Kurtishaj",550,new String[]{"Java","C"});
        System.out.println(manager instanceof Manager); //true per prindin,gjyshin -> false nese nuk trashegohet
        System.out.println(manager instanceof SalariedEmployee);
        System.out.println(manager instanceof Employee);
        System.out.println(manager instanceof HourlyEmployee);
        System.out.println(manager instanceof Programmer);
        System.out.println(manager instanceof Object);
        Paycheck paycheckForManager = new Paycheck("Pagesa mujore",2020,3,manager);
        paycheckForManager.printPayCheck();

        Paycheck paycheckForProgramer = new Paycheck("Vlersimi me page",2020,4,programmer);
        paycheckForProgramer.printPayCheck();

    }
}
