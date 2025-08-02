package com.company.package7.date_time_lambda.lambdy.objects;

public class Animal {

    private String name;
    private boolean canFly;
    private boolean canBark;

    public Animal(final String name, final boolean canFly, final boolean canBark) {
        this.name = name;
        this.canFly = canFly;
        this.canBark = canBark;
    }


    public String getName() {
        return name;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public boolean isCanBark() {
        return canBark;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
