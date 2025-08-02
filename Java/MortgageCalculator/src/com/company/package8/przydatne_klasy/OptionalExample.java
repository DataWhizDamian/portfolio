package com.company.package8.przydatne_klasy;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<String> op1 = Optional.empty();
        Optional<String> op2 = Optional.of("Something");
        Optional<String> op3 = Optional.ofNullable(null);
        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);
        System.out.println();



        System.out.println(op1.isEmpty());
        System.out.println(op1.isPresent());
        System.out.println();



        if (op2.isPresent()) {
            String variable = op2.get();
            System.out.println(variable);
        }
        System.out.println();



        String variable1 = op1.orElse(default1());
        String variable2 = op1.orElseGet(() -> default2());
//        op1.orElseThrow(() -> new RuntimeException("Empty value"));
        System.out.println();


        String old = null;
        if (old != null) {
            System.out.println("not null");
        } else {
            System.out.println("is null");
        }

        op2.ifPresentOrElse(element -> System.out.println(element), () -> System.out.println("default"));



    }

    private static Optional<String> someMethod() {
        return null;
    }


    private static String default1() {
        System.out.println("default1");
        return "default1";
    }
    private static String default2() {
        System.out.println("default2");
        return "default2";
    }



}
