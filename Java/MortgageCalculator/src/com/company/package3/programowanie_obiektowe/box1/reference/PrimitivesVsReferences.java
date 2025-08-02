package com.company.package3.programowanie_obiektowe.box1.reference;

public class PrimitivesVsReferences {
    public static void main(String[] args) {

        int a = 4;
        double c = 10;
        boolean f = false;
        String abc = "abc";
        Cat refCat1 = new Cat("CAT1");
        Cat refCat2 = refCat1;
        Cat refCat3 = refCat1;
        Cat refCat4 = refCat1;

        System.out.println(refCat1);
        refCat1.name = "CAT_OTHER";
        System.out.println(refCat3);



        Cat cat = new Cat("Andrzej");
        System.out.println(cat); //Andrzej
        passByReferenceOrPassByValue(cat);
        System.out.println(cat); // Andrzej (przy przypisaniu nowego obiektu); Rafał (przy użyciu settera)

        int i = 10;
        System.out.println(i); // i = 10
        passByReferenceOrPassByValue(i);
        System.out.println(i); // i = 10
        //Java jest Pass by value

    }

    private static void passByReferenceOrPassByValue(Cat anotherReferenceToCat) {
        System.out.println("inside method 1: " + anotherReferenceToCat); // Andrzej
//        anotherReferenceToCat = new Cat("Rafał"); //przypisanie nowego obiektu
        anotherReferenceToCat.setName("Rafał"); //setter
        System.out.println("inside method 2: " + anotherReferenceToCat); // Rafał

    }

    private static void passByReferenceOrPassByValue(int i) {
        System.out.println("inside method 1: " + i); //10
        i = 20;
        System.out.println("inside method 2: " + i); //20
    }
}
