package com.company.package3.programowanie_obiektowe.Projekt.product;

import com.company.package3.programowanie_obiektowe.Projekt.person.ConsumingMan;
import com.company.package3.programowanie_obiektowe.Projekt.person.ProducingMan;

public class Chocolate extends Food {
    public Chocolate(String name, ProducingMan producingMan, ConsumingMan consumingMan) {
        super(name, producingMan, consumingMan);
    }
}
