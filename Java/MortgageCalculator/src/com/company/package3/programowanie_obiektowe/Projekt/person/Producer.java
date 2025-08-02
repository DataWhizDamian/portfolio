package com.company.package3.programowanie_obiektowe.Projekt.person;

import com.company.package3.programowanie_obiektowe.Projekt.product.Chocolate;
import com.company.package3.programowanie_obiektowe.Projekt.product.Food;
import com.company.package3.programowanie_obiektowe.Projekt.product.Sandwitch;
import com.company.package3.programowanie_obiektowe.Projekt.product.Soup;

public class Producer extends Person implements ProducingMan{

    public Producer(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String getExpectations() {
        return "no expectations";
    }

    @Override
    public void consume(Food food) {
        System.out.println("Producent consuming food: " + food);
    }

    @Override
    public Food produce(String productName, ConsumingMan consumingMan) {
        switch (productName) {
            case "chocolate":
                return new Chocolate(productName,this, consumingMan);
            case "soup":
                return new Soup(productName,this, consumingMan);
            default:
                return new Sandwitch(productName,this, consumingMan);
        }
    }
}
