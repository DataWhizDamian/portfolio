package com.company.package3.programowanie_obiektowe.box2.interfaceExample;

import java.io.Serializable;

public class Cat implements CatStrokeable, Voiceable {

    @Override
    public void doSomethingAsStrokeableCat() {
        System.out.println("I like being stroked");
    }

    @Override
    public void beStroked() {
        System.out.println("I am stroked and it's really nice man!");
    }

    @Override
    public String gimmeVoice() {
        return "I'm giving you my voice";
    }

    @Override
    public void sing(String songName) {
        System.out.println("I'm singing the song: " + songName);

    }

}
