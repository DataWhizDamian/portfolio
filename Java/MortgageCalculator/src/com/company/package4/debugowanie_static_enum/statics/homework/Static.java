package com.company.package4.debugowanie_static_enum.statics.homework;

public class Static {

    private static int counter;

    static {
        System.out.println("create static class");
    }

    private final String name;

    public Static(String name) {
        this.name = name;
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }
}
