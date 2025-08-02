package com.company.package9.klasy_zagniezdzone.anonymousInnerClass;

public class AnonymousMain {

    public static void main(String[] args) {
        AnonymousMain main = new AnonymousMain();
        System.out.println(main.callInnerInterface());
        System.out.println(main.callInnerAbstractClass());
    }

    private String callInnerAbstractClass() {
        Animal animal = new Animal() {
            @Override
            String whatsYourName() {
                return "my name is Abstract Class";
            }
        };
        return animal.whatsYourName();
    }

    private String callInnerInterface() {
        Signable signable = songName -> "I'm singing a song with: " + songName;
        return signable.singASong("My beautiful song!");
    }


    interface Voiceable {
        String silentVoice();

        String loudVoice();
    }

    interface Signable {
        String singASong(String songName);
    }

    abstract class Animal {
        abstract String whatsYourName();
    }
}
