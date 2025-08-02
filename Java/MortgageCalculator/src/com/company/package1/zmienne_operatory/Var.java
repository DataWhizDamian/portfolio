package com.company.package1.zmienne_operatory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Var {

    public static void main(String[] args) {
        var variable = getSomething();               //var - może skrócić forme zapisu
        System.out.println(variable);                                      //(Map<String, List<String>> == var)
    }

    private static Map<String, List<String>> getSomething() {
        return new HashMap<>();
    }
}
