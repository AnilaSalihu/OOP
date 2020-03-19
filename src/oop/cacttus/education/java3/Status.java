package oop.cacttus.education.java3;

public enum Status {

    ACTIVE(true), PASIVE(false);
 //BIT -> 0 false, 1 true
    private boolean value;
    Status(boolean value) {
        this.value = value;
    }
    public boolean getValue() {
        return value;
    }

}
