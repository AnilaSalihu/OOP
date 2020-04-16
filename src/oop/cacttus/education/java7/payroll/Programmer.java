package oop.cacttus.education.java7.payroll;

import java.util.ArrayList;

public class Programmer extends SalariedEmployee {
    private ArrayList<String> programmingLanguages;

    public Programmer() {
        programmingLanguages=new ArrayList<>();
        programmingLanguages.add("C#");
        programmingLanguages.add("JavaScript");
    }

    public Programmer(int id, String name, String surname, double salary,
                      String[] programmingLanguages) {

        super(id, name, surname, salary);
        this.programmingLanguages = new ArrayList<>();
        for (String language:programmingLanguages) {
            this.programmingLanguages.add(language);
        }
    }

    public void addProgrammingLanguage(String language) {
        programmingLanguages.add(language);
    }

    public ArrayList<String> getProgrammingLanguages() {
        return programmingLanguages;
    }
}
