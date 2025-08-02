package com.company.package8.przydatne_klasy;

import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;

public class BigIntExample {

    public static void main(String[] args) {


        BigInteger bigInteger = BigInteger.ONE;

        BigInteger bigInteger1 = BigInteger.valueOf(Long.MAX_VALUE);

        int a = 23;
        int b = 21;
        int c = a + b;
        System.out.println(c);

        BigInteger A = BigInteger.valueOf(23);
        BigInteger B = BigInteger.valueOf(21);
        BigInteger C = A.add(B);
        System.out.println(C);

        System.out.println();


        System.out.println("2!: " + factorial(2));
        System.out.println("3!: " + factorial(3));
        System.out.println("4!: " + factorial(4));
        System.out.println("5!: " + factorial(5));
        System.out.println("6!: " + factorial(6));

        System.out.println("20!: " + factorial(20));
        System.out.println("BI 20!: " + factorial1(20));
    }

    private static int factorial(final int n) {
        int f = 1;

        for (int i = 2; i<= n; i++ ) {
            f = f * i;
        }
        return  f;
    }

    private static BigInteger factorial1(final int n) {
        BigInteger f = BigInteger.ONE;

        for (int i = 2; i<= n; i++ ) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return  f;
    }
}
