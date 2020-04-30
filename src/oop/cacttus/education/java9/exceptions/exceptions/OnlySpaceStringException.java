package oop.cacttus.education.java9.exceptions.exceptions;

public class OnlySpaceStringException extends Exception {
    private int countSpace=0;
    public OnlySpaceStringException(String message) {
        super(message);
    }
    public OnlySpaceStringException(String message,String obj) {
        super(message);
        countSpace = obj.length();
    }

    public int getCountSpace() {
        return countSpace;
    }
}
