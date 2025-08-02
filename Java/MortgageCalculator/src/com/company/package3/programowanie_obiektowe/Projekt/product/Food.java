package com.company.package3.programowanie_obiektowe.Projekt.product;

import com.company.package3.programowanie_obiektowe.Projekt.person.ConsumingMan;
import com.company.package3.programowanie_obiektowe.Projekt.person.ProducingMan;

public abstract class Food {

    private final String name;
    private final ProducingMan producingMan;
    private final ConsumingMan consumingMan;

    public Food(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        this.name = name;
        this.producingMan = producingMan;
        this.consumingMan = consumingMan;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", producingMan=" + producingMan +
                ", consumingMan=" + consumingMan +
                '}';
    }
}
