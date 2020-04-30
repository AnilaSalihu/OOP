package oop.cacttus.education.java9.exceptions.exceptions;

public class NegativeNumberException extends Exception {
    private int negativeNumber;

    public NegativeNumberException(String message) {
        super(message);
    }

    public NegativeNumberException(String message, int negativeNumber) {
        super(message);
        setNegativeNumber(negativeNumber);
    }

    public int getNegativeNumber() {
        return negativeNumber;
    }

    public void setNegativeNumber(int negativeNumber) {
        this.negativeNumber = negativeNumber;
    }
    //metode te re me printu hjeshum me ba dicka
}
