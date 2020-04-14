package oop.cacttus.education.java7;

import java.util.ArrayList;

public class TalkingParrot extends Parrot {
    private String[] phrases;

    public TalkingParrot(String color, String food, String[] phrases) {
        super(color, food);
        this.phrases = phrases;
    }

    public String[] getPhrases() {
        return phrases;
    }

    public void setPhrases(String[] phrases) {
        this.phrases = phrases;
    }

    public void saySomething() {
        int random = (int)Math.random()*phrases.length;

        System.out.println(phrases[random]);


    }
}
