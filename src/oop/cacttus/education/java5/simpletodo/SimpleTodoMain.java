package oop.cacttus.education.java5.simpletodo;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleTodoMain {
    public static void main(String[] args) {
        // me menaxhu nje menu
        showMenu();
        Scanner reader = new Scanner(System.in);
        String selectedMenu = reader.nextLine();
        ToDoManager toDoManager = new ToDoManager(); //gabimi SCOPE
        //ArrayList<String> toDoManager = new ArrayList<>();
        while(!selectedMenu.equals("X")) {

            switch (selectedMenu) {
                case "1":
                    System.out.println("Shkruaj taskun: ");
                    String taskName = reader.nextLine();
                    toDoManager.add(taskName);
                    break;
                case "2":
                    System.out.println("Shkruaj index:");
                    int index = reader.nextInt();
                    String todo = toDoManager.get(index);
                    System.out.printf("Todo e zgjedhur eshte: %s",todo);
                    break;
                case "3":
                    System.out.println("Shkruaj index:");
                    int indexRemove = reader.nextInt();
                    toDoManager.remove(indexRemove);
                    break;
                case "4":
                    System.out.println("Lista e tasqeve:");
                    System.out.println("-----------------------");
                    for(String s:toDoManager.getAll()){
                        System.out.println(s);
                    }
                    System.out.println("-----------------------");
                    break;
                default:
                    System.out.println("Ju lutem zgjedhni task tjeter:");

            }
            showMenu();
            selectedMenu = reader.nextLine();
        }
    }
    public  static void showMenu() {
        System.out.println("-------------------------------------");
        System.out.println("Shtyp 1 per insertim te taskut te ri");
        System.out.println("Shtyp 2 per te lexuar taskun sipas indexit:");
        System.out.println("Shtyp 3 per te fshire taskun");
        System.out.println("Shtyp 4 per te pare te gjitha tasqet");
//        System.out.println("Shtyp 5 per te pare se a ekziston tasku i dhene");
//        System.out.println("Shtyp 6 per ti numeruar tasqet");
        System.out.println("Shtyp X per te perfunduar...");
        System.out.println("-------------------------------------");
        System.out.println("Ju lutem zgjedhni nga lista me larte: ");
    }
}
