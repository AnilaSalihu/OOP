package oop.cacttus.education.java9.exceptions;

import javafx.scene.media.MediaException;
import oop.cacttus.education.java9.exceptions.exceptions.EmptyStringException;
import oop.cacttus.education.java9.exceptions.exceptions.NegativeNumberException;
import oop.cacttus.education.java9.exceptions.exceptions.OnlySpaceStringException;
import oop.cacttus.education.java9.exceptions.models.Person;

public class ExceptionMain {
    public static void main(String[] args)
     //       throws Exception  //menyra 1 prindi mi menaxhu krejt
     //       throws NegativeNumberException, EmptyStringException, OnlySpaceStringException //menyra 2 secila vet e vet
    {
       // Person naimi = new Person(100,"       ","",null);
        try{
            Person naimi = new Person(100,"Naim","",null);
        }
        catch (NegativeNumberException ex) {
            System.out.println(ex.getNegativeNumber());
            System.out.println(ex.getMessage());
        }
        catch (OnlySpaceStringException ex) {
            System.out.println(ex.getCountSpace());
            System.out.println(ex.getMessage());
        }
        catch (EmptyStringException ex) {
            System.out.println(ex.getMessage());
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
