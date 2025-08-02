package com.company.package4.debugowanie_static_enum.enums;

import java.util.Arrays;

public class Enums {
//Enum - enumerator, pozwala zastosować jedynie wartości, które w nim istnieją (klasa, która określa jakie wartości można w niej użyć)
    //czyli - zbiór możliwych do wykorzystania wartości
    public static void main(String[] args) {
        Volkswagen volkswagen = getEnum();  // cmd + option + m = tworzy metode
//      Volkswagen volkswagen = Volkswagen.GOLF;
        System.out.println(volkswagen);


            System.out.println();
            System.out.println("2) INSTRUKCJE STERUJĄCE");
        if (Volkswagen.ARTEON.equals(volkswagen)) {
            System.out.println("my car is Arteon");
        } else {
            System.out.println("My car is not Arteon");
        }

// w przypadku używania switcha z enumami, podajemy w case konkretną wartość enuma a nie jego ordinal()
        switch (volkswagen) {
            case PASSAT:
            case ARTEON:
                System.out.println("Passat or Arteon");
                break;
            case GOLF:
                System.out.println("Golf");
                break;
            case TIGUAN:
            case TOUAREG:
                System.out.println("other car");
                break;
        }


            System.out.println();
            System.out.println("3) GETTERY I SETTERY");
        System.out.println(volkswagen.getColors()); //potrzebne gettery w Volkswagen
        System.out.println(volkswagen.PASSAT.getColors());
        Volkswagen.GOLF.setColors("brown");
        System.out.println(volkswagen.getColors());


            System.out.println();
            System.out.println("4) TABLICE");
        Volkswagen[] values = Volkswagen.values();
        System.out.println(Arrays.toString(values));


            System.out.println();
            System.out.println("5) ITEROWANIE");
        for (Volkswagen value : values) {
            System.out.println(value);
        }

            System.out.println();
            System.out.println("6) valueOf");
        Volkswagen golf = Volkswagen.valueOf("GOLF");
        System.out.println(golf);
    }

    private static Volkswagen getEnum() { //cmd + option + n = usuwa metodę
        return Volkswagen.GOLF;
    }
}
