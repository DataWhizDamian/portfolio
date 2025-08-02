package com.company.package8.przydatne_klasy.homework;

public class User {

    private final int id;
    private final String name;
    private final String surname;

   //5) konstruktor domyślny
    public User() {
        this.id = 0;
        this.name = "default";
        this.surname = "default";
    }

    public User(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
