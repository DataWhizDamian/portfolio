package com.company.package3.programowanie_obiektowe.Projekt.person;

import com.company.package3.programowanie_obiektowe.Projekt.product.Food;

public interface ProducingMan {
    Food produce(String productName, ConsumingMan consumingMan);
}
