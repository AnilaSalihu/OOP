package oop.cacttus.education.java2;

public class Java2Main {
    public static void main(String[] args) {
        Counter numratori;

        numratori = new Counter();

        numratori.increment();
        Counter nota = new Counter(5,10);
        nota.increment();
        nota.increment();
        System.out.println(nota.getCounter());

        Person person1 = new Person();
        Person person2 = new Person("Naim"," Sulejmani   ");

    }
}
