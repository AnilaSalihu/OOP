package oop.cacttus.education.parameterpassing;

import com.sun.source.tree.Scope;

public class ScopeExample {
    private int i = 1; //attribute, field, data

    public ScopeExample() {
        this.i = 100;
    }

    public void firstMethod() {
        int i = 4, j = 5;
        this.i = i + j;
        secondMethod(7);
    }

    public void secondMethod(int i) {
        int j = 8;
        this.i = i + j;
    }

}
