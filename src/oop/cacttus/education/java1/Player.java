package oop.cacttus.education.java1;

public class Player {
    private byte playerNo;
    private String name;
    private String surname;
    private short goals;

    //vetit - jane metoda
    // get - per me lexu vlere (kthen vleren sipas variables)
    //set - per me caktu vlere (parameter marrin tipin e variables)
    public byte getPlayerNo() { return  playerNo;}
    public String getName() {return name;}
    public String getSurname() {return surname;}
    public short getGoals() {return goals;}

    public void setPlayerNo(byte playerNo) { this.playerNo=playerNo;}
    public void setName(String name) {this.name=name;}
    public void setSurname(String surname) {this.surname=surname;}
    public void setGoals(short goals) {this.goals=goals;}

    public void print() {
        System.out.printf("%s %s me numer %d ka shenuar %d gola!%n",
                this.getName(),this.getSurname(),
                this.getPlayerNo(),this.getGoals());
    }
}







