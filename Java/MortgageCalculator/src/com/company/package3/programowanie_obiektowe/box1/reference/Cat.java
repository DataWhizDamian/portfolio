package com.company.package3.programowanie_obiektowe.box1.reference;

public class Cat {
    public String name;

    public Cat(String name) {
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
