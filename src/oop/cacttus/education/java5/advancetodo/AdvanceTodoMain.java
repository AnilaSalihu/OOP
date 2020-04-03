package oop.cacttus.education.java5.advancetodo;

import oop.cacttus.education.java5.simpletodo.SimpleTodoMain;

import java.util.Scanner;

public class AdvanceTodoMain {
    public static void main(String[] args) {
        SimpleTodoMain.showMenu();
        Scanner reader = new Scanner(System.in);
        String selectedMenu = reader.nextLine();
        while(!selectedMenu.toLowerCase().equals("x")) {
            switch (selectedMenu) {
                case "1":
                    System.out.println("Shkruaj emrin e taskut: ");
                    String name = reader.nextLine();
                    String note = "";
                    System.out.println("A ka note (P/J):");
                    String hasNote=reader.nextLine();
                    if(hasNote.toLowerCase().equals("p"))
                    {
                        System.out.println("Shkruaj note: ");
                        note = reader.nextLine();
                    }
                    ToDoManager.add(name,note);
                    break;
                case "2":
                    System.out.println("Shkruaj indexin per lexim: ");
                    int index = reader.nextInt();
                    reader.nextLine();
                    TodoItem item = ToDoManager.get(index);
                    item.print();
                    break;
                default:
                    System.out.println("Ju lutem zgjedhni nga ato qe ju shfaqen si menu!!!");
                    break;
            }
            SimpleTodoMain.showMenu();
            selectedMenu = reader.nextLine();
        }
    }
}
