package com.company.package3.programowanie_obiektowe.box2.interfaceExample;

public interface Voiceable {

// domyślnie w interfejsach jest public abstract
    String gimmeVoice();

    default void sing(String songName) {
       singMeASongWithName(songName);
    }

   private void singMeASongWithName(String songName) {
       System.out.println("Default singing song method: " + songName);
   }

}
