package oop.cacttus.education.java3;

import java.time.LocalDate;

public class Artikulli {
    private int id;
    private String emri;
    private String pershkrimi;
    private double cmimi;
    private int sasia;
    private LocalDate dataProdhimit;
    private LocalDate dataSkadimit;
    private Status statusiArtikullit;

    public Artikulli(){

    }

    public Artikulli(int id, String emri, String pershkrimi, double cmimi, int sasia, LocalDate dataProdhimit, LocalDate dataSkadimit) {
        this.id = id;
        this.emri = emri;
        this.pershkrimi = pershkrimi;
        this.cmimi = cmimi;
        this.sasia = sasia;
        this.dataProdhimit = dataProdhimit;
        this.dataSkadimit = dataSkadimit;
    }

    public Artikulli(int id, String emri, String pershkrimi, double cmimi, int sasia, LocalDate dataProdhimit, LocalDate dataSkadimit, Status statusiArtikullit) {
        this.id = id;
        this.emri = emri;
        this.pershkrimi = pershkrimi;
        this.cmimi = cmimi;
        this.sasia = sasia;
        this.dataProdhimit = dataProdhimit;
        this.dataSkadimit = dataSkadimit;
        this.statusiArtikullit = statusiArtikullit;
    }

    public Status getStatusiArtikullit() {
        return statusiArtikullit;
    }

    public void setStatusiArtikullit(Status statusiArtikullit) {
        this.statusiArtikullit = statusiArtikullit;
    }

    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getPershkrimi() {
        return pershkrimi;
    }

    public void setPershkrimi(String pershkrimi) {
        this.pershkrimi = pershkrimi;
    }

    public double getCmimi() {
        return cmimi;
    }

    public void setCmimi(double cmimi) {
        this.cmimi = cmimi;
    }

    public int getSasia() {
        return sasia;
    }

    public void setSasia(int sasia) {
        this.sasia = sasia;
    }

    public LocalDate getDataProdhimit() {
        return dataProdhimit;
    }

    public void setDataProdhimit(LocalDate dataProdhimit) {
        this.dataProdhimit = dataProdhimit;
    }

    public LocalDate getDataSkadimit() {
        return dataSkadimit;
    }

    public void setDataSkadimit(LocalDate dataSkadimit) {
        this.dataSkadimit = dataSkadimit;
    }
}
