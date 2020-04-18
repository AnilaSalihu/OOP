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

    public static void calculateNetSalary(double brutSalary){
        double pagaPragu1=0;
        double pagaPragu2=0;
        double pagaPragu3=0;
        double pagaPragu4=0;
        double tatimi4=0;
        double tatimi8=0;
        double tatimi10=0;
        double pagaNeto=0;
        double kontributiPunedhenesit = brutSalary*0.05;
        double kontributiPunetorit = brutSalary*0.05;
        double pagaTatueshme = brutSalary-kontributiPunetorit;
        if(pagaTatueshme<=80){
            pagaPragu1 = pagaTatueshme;}
        else{
            pagaPragu1 = 80;
        }
        if((pagaTatueshme-pagaPragu1)<=170 && pagaTatueshme<=250){
            pagaPragu2 = pagaTatueshme-pagaPragu1;
        }
        else{
            pagaPragu2=170;
        }
        if((pagaTatueshme-pagaPragu1-pagaPragu2)<=200 && pagaTatueshme<=450){
            pagaPragu3 = pagaTatueshme-pagaPragu1-pagaPragu2;
        }
        else{
            pagaPragu3 = 200;
        }
        if(pagaPragu3==200 && pagaTatueshme>450){
            pagaPragu4 = pagaTatueshme-pagaPragu1-pagaPragu2-pagaPragu3;
        }
        else{
            pagaPragu4 = 0;
        }
        tatimi4 = pagaPragu2*0.04;
        tatimi8 = pagaPragu3*0.08;
        tatimi10 = pagaPragu4*0.1;
        double totalTatim = tatimi4+tatimi8+tatimi10;
        pagaNeto = pagaTatueshme-totalTatim;
        System.out.printf("Paga bruto: %.2f%n",brutSalary);
        System.out.println("________________________________________");
        System.out.printf("Kontributi nga punetori :%.2f%n",kontributiPunetorit);
        System.out.printf("Kontributi nga punedhenesi :%.2f%n",kontributiPunedhenesit);
        System.out.printf("Totali i kontributit: %.2f%n",(kontributiPunedhenesit+kontributiPunetorit));
        System.out.printf("Total taksa: %.2f%n",totalTatim);
        System.out.println("_________________________________________");
        System.out.printf("Paga neto: %.2f%n",pagaNeto);
    }
    public static void calculateBrutoSalary(double pagaNeto){
        double pagaNeto12Muaj= pagaNeto*12;
        double pagaBruto = 0;
        if(pagaNeto12Muaj<=960){
            pagaBruto = (pagaNeto12Muaj/0.95)/12;
        }
        else if(pagaNeto12Muaj>960 && pagaNeto12Muaj<=3000){
            pagaBruto = ((pagaNeto12Muaj-38.4)/0.912)/12;
        }
        else if(pagaNeto12Muaj>3000 && pagaNeto12Muaj<=5400){
            pagaBruto = (((pagaNeto12Muaj+81.6)-240)/0.874)/12;
        }
        else if(pagaNeto12Muaj>5400){
            pagaBruto = (((pagaNeto12Muaj+273.6)-540)/0.855)/12;
        }
        calculateNetSalary(pagaBruto);
//        System.out.println(pagaBruto);
    }

    public void printPayCheck() {
        //nese objekti prind u kriju nga femija dhe te dyte e kane metoden toString() ose metoda tjera
        //kur therasim metoden e prindit ai e therret te femise nese e ka te njejten
        System.out.println(employee.toString());

        if(employee instanceof HourlyEmployee) {

            // ((HourlyEmployee) employee).getSalary()
            calculateNetSalary(((HourlyEmployee) employee).getSalary());
        }
        else if(employee instanceof SalariedEmployee){
            calculateNetSalary(((SalariedEmployee)employee).getSalary());
        }
        else {
            System.out.println("Nuk jane puntore qe kane te definuara pagese");
        }

        //ish dasht te dhanat e puntorit mi shtyp
        //te dhanat e paycheck
        //te dhant e pages dhe kalkulimit te pages
    }


}
