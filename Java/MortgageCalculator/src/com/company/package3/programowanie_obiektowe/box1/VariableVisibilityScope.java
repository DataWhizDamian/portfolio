package com.company.package3.programowanie_obiektowe.box1;

public class VariableVisibilityScope { //zmienny zakres widoczności

    public static void main(String[] args) {
        VariableVisibilityScope example = new VariableVisibilityScope();
        example.method3("ABC");
    }

    private String a;

    private void method(String b) {
        System.out.println(b);
    }

    private void method2(String c) {
        System.out.println(a);  //null
        System.out.println(c);
    }

    private void method3(String c, String ... e) {
        System.out.println(a);  // null
        System.out.println(c);
        System.out.println(e.length);  // pusta tablica
    }

    private void method4() {
        String d;
//        System.out.println(d);    // nie można wywołać, bo d musi być zainicjalizowana(przypisać wartość)
    }
}
