package oop.cacttus.education.java5.advancetodo;

import java.util.ArrayList;

public class ToDoManager {
    private static ArrayList<TodoItem> todos = new ArrayList<>();

    public static void add(String name, String note) {
        TodoItem item = new TodoItem(name, note, false);
        todos.add(item);
    }

    public static TodoItem get(int index) {
        return todos.get(index);
    }

    public static TodoItem getFirstByName(String name) {
        for (TodoItem item : todos) {
            if (name.toLowerCase().equals(item.getName().toLowerCase())) {
                return item;
            }
        }
        return null;
    }


    public static ArrayList<TodoItem> getAll() {
        return todos;
    }

    public static void remove(int index) {
        todos.remove(index);
    }

}
