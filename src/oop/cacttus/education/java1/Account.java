package oop.cacttus.education.java1;

public class Account {
    private  String name;
    private  String surname;
    private  String bankName;
    private String accountType;
    private int accountNo;
    private int cardNo;
    private short secretCode;
    private byte validMonth;
    private short validYear;


    public String getName() {return name;}
    public String getSurname(){return surname;}
    public String getBankName() {return  bankName;}
    public String getAccountType(){return accountType;}
    public int getAccountNo() {return  accountNo;}
    public  int getCardNo() {return cardNo;}
    public short getSecretCode() {return secretCode;}
    //public short getValidYear() {return validYear;}
    //public byte getValidMonth() {return validMonth;}
    public void setName(String name) {this.name=name;}
    public void setSurname(String surname) {this.surname=surname;}
    public void setValidYear(short validYear) {this.validYear=validYear;}
    public void setValidMonth(byte validMonth){this.validMonth=validMonth;}

    public String getValidation(){
        return validMonth + "/"+validYear;
    }

}
