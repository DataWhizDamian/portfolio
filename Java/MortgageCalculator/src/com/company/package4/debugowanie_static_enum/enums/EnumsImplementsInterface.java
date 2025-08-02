package com.company.package4.debugowanie_static_enum.enums;

public class EnumsImplementsInterface {
    public static void main(String[] args) {
        System.out.println(Volkswagen.GOLF.doSomething());

        Volkswagen v1 = getV1();
        Volkswagen v2 = getV2();
        System.out.println(v1 == v2);
        System.out.println(v1.equals(v2));

        System.out.println(v1.ordinal());  //.ordinal() - miejsce na którym znajduje się wartość
        System.out.println(Volkswagen.GOLF.ordinal());

    }

    private static Volkswagen getV1() {
        return Volkswagen.ARTEON;
    }

    private static Volkswagen getV2() {
        return Volkswagen.TOUAREG;
    }
}
