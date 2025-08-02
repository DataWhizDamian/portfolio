package com.company.package3.programowanie_obiektowe.box1;

public class Autoboxing {
    public static void main(String[] args) {
        byte a = 3;
        short b = 10;
        int c = 19;
        long d = 12;
        char e = 's';

        Byte aC = a;
        Short bC = b;
        Integer cC = c;
        Long dC = d;
        Character eC = e;

        int f = cC;

        String x = "12";
        int y = Integer.parseInt(x);  //przypisanie do prymitywa

        // mechanizm autoboxingu - jeśli Long   --> dłużej się renderuje
        // bez mechanizmu autoboxingu - jeśli long  --> krócej się renderuje (dlatego lepiej używać prymitywów gdzie się da)
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);


    }
}
