package com.company.package3.programowanie_obiektowe.Projekt.product;

import com.company.package3.programowanie_obiektowe.Projekt.person.ConsumingMan;
import com.company.package3.programowanie_obiektowe.Projekt.person.ProducingMan;

public class Soup extends Food {
    public Soup(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        super(name, producingMan, consumingMan);
    }
}
