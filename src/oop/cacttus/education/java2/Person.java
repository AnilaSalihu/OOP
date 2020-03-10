package oop.cacttus.education.java2;

public class Person {
    private int id;
    private String name;
    private String surname;
    private byte age;
    private short yearOfBirth;
    private String nationality;
    private float height;
    private float weight;
    private String eyeColor;
    private boolean isInfectedWithVirus;


    public Person() {
        //default constroctor
    }

    public Person(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public Person(String name, String surname, String nationality) {
        setName(name);
        setSurname(surname);
        setNationality(nationality);
    }

    public Person(int id, String name, String surname) {
        this.id = id;
        setName(name);
        setSurname(surname);
    }

    public Person(int id, String name, String surname, byte age) {
        this.id = id;
        setName(name);
        setSurname(surname);
        setAge(age);
    }
    // te emri variabla klikojm ALT + Enter
    // ALT + Insert

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (isStringValid(name))
            this.name = name.trim();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (isStringValid(surname))
            this.surname = surname.trim();
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        if (age >= 0 && age <= Byte.MAX_VALUE)
            this.age = age;
    }

    public short getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(short yearOfBirth) {
        if (yearOfBirth >= 1900)
            this.yearOfBirth = yearOfBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        if (isStringValid(nationality))
            this.nationality = nationality;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (height > 0)
            this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 0)
            this.weight = weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }


    public boolean isInfectedWithVirus() {
        return isInfectedWithVirus;
    }

    public void setInfectedWithVirus(boolean infectedWithVirus) {
        isInfectedWithVirus = infectedWithVirus;
    }

    private boolean isStringValid(String value) {
        return value != null && value.trim().equals("") && value.trim().length() > 1;
    }
}
