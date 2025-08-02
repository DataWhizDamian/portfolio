package com.company.package3.programowanie_obiektowe.box2.finalKeyword;

public class Main {
    public static void main(String[] args) {
        String a = "Hello World";
        a.replace("World", "Karol");
        System.out.println(a); // Hello World
        String replaced = a.replace("World","Karol"); //Stworzony nowy obiekt
        System.out.println(replaced); // Hello Karol

        Cabriolet cabriolet = new Cabriolet("red",true);
        cabriolet.getColor();
        cabriolet.isRoofOpened();
        Cabriolet cabriolet1 = cabriolet.closeTheRoof();
        System.out.println("cabrio: " + cabriolet);
        System.out.println("cabrio1: " + cabriolet1);
        System.out.println(cabriolet == cabriolet1);



    }
}
