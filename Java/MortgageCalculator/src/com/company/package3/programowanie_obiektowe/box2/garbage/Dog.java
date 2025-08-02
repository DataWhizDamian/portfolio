package com.company.package3.programowanie_obiektowe.box2.garbage;

public class Dog {

    private String name;
    private String color;
    private String age;
    private String hoursOfSleeping;

    public Dog setName(String name) {
        this.name = name;
        return this;
    }

    public Dog setColor(String color) {
        this.color = color;
        return this;
    }

    public Dog setAge(String age) {
        this.age = age;
        return this;
    }

    public Dog setHoursOfSleeping(String hoursOfSleeping) {
        this.hoursOfSleeping = hoursOfSleeping;
        return this;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age='" + age + '\'' +
                ", hoursOfSleeping='" + hoursOfSleeping + '\'' +
                '}';
    }
}
