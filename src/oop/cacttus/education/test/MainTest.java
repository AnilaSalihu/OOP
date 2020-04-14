package oop.cacttus.education.test;

import java.lang.reflect.Constructor;

public class MainTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class t = Class.forName("oop.cacttus.education.test.Test").getNestHost();
        System.out.println(t.getName());
        //Constructor[] constructors = t.getConstructors();
        for(Constructor c: t.getConstructors())
        {
            System.out.println(c.getParameterCount());
            System.out.println(c.getModifiers());
            System.out.println(c.getParameterTypes());
            
        }
        System.out.println(t.getCanonicalName());
    }
}
