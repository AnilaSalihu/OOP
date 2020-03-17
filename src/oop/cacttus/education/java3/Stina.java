package oop.cacttus.education.java3;

public enum Stina {
    VERA(1,"SUMMER"), VJESHTA(2,"FALL"), DIMIR(3,"WINTER"), PRANVERA(4,"SPRING");

    private int value; //data, variable, attribute, fields
    private String nameEng;

    private Stina(int value,String nameEng) {
        this.value=value;
        this.nameEng=nameEng;
    }

    public int getValue() {return value;}
    public String getNameEng() {return nameEng;}



}
