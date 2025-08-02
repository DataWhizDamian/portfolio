package com.company.package3.programowanie_obiektowe.box1.inheritance;

public class Car extends Vehicle{
    //extands - dziedziczenie (klasa Car rozszerza klase Vehicle, więc ma dostęp do jego pól i metod)
    //extands Object - dziedziczenie domyślne
    public String model = "8 series";

    public String horn() {return "CAR beep beep!";}
}
