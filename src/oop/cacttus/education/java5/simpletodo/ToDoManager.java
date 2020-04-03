package oop.cacttus.education.java5.simpletodo;

import java.util.ArrayList;

public class ToDoManager {
    // duhet te kete nje liste ku ruhen te gjitha todo task
    private ArrayList<String> todos;
    public ToDoManager() {
        todos = new ArrayList<>(); // i rezervon 10 Objekte String[] todos  = new String[10]
    }
    public void add(String todoItem) {
        todos.add(todoItem);
    }
    public String get(int index) {
        return todos.get(index);
    }
    public void remove(int index) {
        todos.remove(index);
    }
    public void remove(String todoItem) {
        todos.remove(todoItem);
    }
    public boolean contains(String todoItem) {
        return todos.contains(todoItem);
    }
    public ArrayList<String> getAll() {
        return todos;
    }


    //duhet te kete nje metode e cila shton todo
    //duhet te kete nje metode e cila lexon nga todo
    //duhet te kete nje metode e cila fshin nga todo
}
