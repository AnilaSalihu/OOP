package oop.cacttus.education.java8;

public class B {

    B() {
        //pjesa ku vendoset initializer blok para se me u ekzekutu dicka nga konstruktori femi
        //
        System.out.println("U thirr konstruktori");
    }

//    void changeValue(final int a) { //10
//        System.out.println(a);
//        a++;
//    }
    //initializer block
    {
        for(int i=0; i<10;i++) {
            System.out.println(i);
        }
        System.out.println("U thirr initializer block");
    }

    {
        System.out.println("Tjeter instance inicializuese");
    }
}
