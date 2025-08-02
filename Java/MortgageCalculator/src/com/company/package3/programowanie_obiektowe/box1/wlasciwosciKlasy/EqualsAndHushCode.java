package com.company.package3.programowanie_obiektowe.box1.wlasciwosciKlasy;

import com.company.package3.programowanie_obiektowe.box1.wlasciwosciKlasy.example.Car;
import com.company.package3.programowanie_obiektowe.box1.wlasciwosciKlasy.example.Dog;

import java.math.BigDecimal;

public class EqualsAndHushCode {
    public static void main(String[] args) {
        System.out.println("simpleTypesComparision");
        EqualsAndHushCode.simpleTypesComparision();
        System.out.println();System.out.println();
        System.out.println("decimalTypesComparision");
        EqualsAndHushCode.decimalTypesComparision();
        System.out.println();System.out.println();
        System.out.println("egualsExample");
        EqualsAndHushCode.equalsExample();
    }

    private static void simpleTypesComparision() {
        System.out.println("19 == 19: " + (19 == 19));
        System.out.println("19 != 19: " + (19 != 19));
        System.out.println("10249L == 10249L: " + (10249L == 10249L));
        System.out.println("10249L != 10249L: " + (10249L != 10249L));
        System.out.println("'X' == 'X': " + ('X' == 'X'));
        System.out.println("'X' != 'X': " + ('X' != 'X'));
        System.out.println("true == true: " + (true == true));
        System.out.println("true != true: " + (true != true));
    }

    private static void decimalTypesComparision() {
        System.out.println("0.1 + 0.2 == 0.3: " + (0.1 + 0.2 == 0.3)); // ?!
        System.out.println(Math.abs(0.3 - (0.1 + 0.2)));
        System.out.println("0.1 + 0.2 == 0.3: " + (Math.abs(0.3 - (0.1 + 0.2)) < 0.0001));

        BigDecimal bd3 = new BigDecimal("0.3");
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");
        System.out.println(bd3 == bd1.add(bd2));
    }

    private static void equalsExample() {
        Car car1 = new Car("Mercedes", "A-Class", 2010);
        Car car2 = new Car("BMW", "X1", 2009);
        Car car3 = new Car("Volkswagen", "Golf", 2015);
        Car car4 = new Car("Audi", "A4", 2018);
        Car car5 = new Car("Audi", "A4", 2018);

        Dog dog = new Dog("Ciapek");

        System.out.println(car4 == car5);
        System.out.println(car4.equals(car5)); // metoda equals musi być zdefiniowana
        System.out.println(car4.equals(null));
        System.out.println(car4.equals(1));
        System.out.println(car4.equals("Hello"));
        System.out.println(car4.equals(dog));
        System.out.println(car4.equals(car3));
        System.out.println();
        // equals principles(zasady)
        // - x.equals(x) should be always true
        // - x.equals(y) == true  ->  y.equals(x) == true
        // - x.equals(y) == true  &  y.equals(z) == true  ->  x.equals(z) == true
        // in case of null  ->  false



    //hashCode() - zwraca dla każdego obiektu jego unikalną wartość liczbową
        System.out.println("hash1: " + car1.hashCode());
        System.out.println("hash2: " + car2.hashCode());
        System.out.println("hash3: " + car3.hashCode());
        System.out.println("hash4: " + car4.hashCode());
        System.out.println("hash5: " + car5.hashCode());

    }
}
