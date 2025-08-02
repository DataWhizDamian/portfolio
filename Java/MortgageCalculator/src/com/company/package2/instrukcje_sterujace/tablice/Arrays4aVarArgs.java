package com.company.package2.instrukcje_sterujace.tablice;

public class Arrays4aVarArgs {

    public static void main(String... args) {
        someMethod(1,2,3,4);
        someMethod(1,2,3,4,5,6);
    }

//    private static void someMethod(int i, int i1, int i2, int i3) {} //gdy chcemy zapisać wiele parametrów tego samego typu
    private static void someMethod(int... argsy) {
        int a = argsy[2]; // a = 3

        int result = 1;
        for (int arg : argsy) {
            result *= arg;
        }
        System.out.println(result);
    }
}
