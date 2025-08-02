package com.company.package8.przydatne_klasy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalExample {
    public static void main(String[] args) {

        System.out.println(new BigDecimal("123.569285730950238457649324975461239084375639479"));

        BigDecimal bd = BigDecimal.valueOf(5). setScale(10,RoundingMode.HALF_UP);
        BigDecimal bd1 = BigDecimal.valueOf(10);
        BigDecimal bd2 = BigDecimal.valueOf(15);

        BigDecimal bd3 = bd1.add(bd2);
        BigDecimal bd4 = bd1.subtract(bd2);
        BigDecimal bd5 = bd1.multiply(bd2);
        BigDecimal bd6 = bd1.divide(bd2, RoundingMode.HALF_UP);
        BigDecimal bd7 = bd1.pow(3);
        BigDecimal bd8 = bd1.negate();

        System.out.println(bd);
        System.out.println(bd1);
        System.out.println(bd2);
        System.out.println();
        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(bd5);
        System.out.println(bd6);
        System.out.println(bd7);
        System.out.println(bd8);
        System.out.println();





        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);

        BigDecimal bigDecimal1 = new BigDecimal("0.1");
        BigDecimal bigDecimal2 = new BigDecimal("0.2");
        System.out.println(bigDecimal1.add(bigDecimal2));


    }
}
