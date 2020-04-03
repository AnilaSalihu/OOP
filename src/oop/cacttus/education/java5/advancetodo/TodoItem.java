package oop.cacttus.education.java5.advancetodo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//emertimi Shift + F6
public class TodoItem {
    private String name;
    private String note;
    private boolean isCompleted;
    private LocalDate createdDate;

    public TodoItem() {
        createdDate = LocalDate.now();
    }

    public TodoItem(String name, String note, boolean isCompleted) {
        this.name = name;
        this.note = note;
        this.isCompleted = isCompleted;
        this.createdDate = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void print() {
        System.out.printf("Emri Taskut: %s %n", this.name);
        System.out.printf("Pershkrimi: %s %n", this.note);
        System.out.printf("A eshte i perfunduar: %s %n", this.isCompleted ? "PO" : "JO");
        System.out.printf("Data krijimit: %s %n",this.createdDate.format(DateTimeFormatter.ISO_DATE));
    }
}
