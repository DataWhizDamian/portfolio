package com.company.package3.programowanie_obiektowe.box2.garbage;

public class Cat {
    public String name;

    private Owner owner;

    public Cat(String name) {
        this.name = name;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Deprecated
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize called");
    }
}
