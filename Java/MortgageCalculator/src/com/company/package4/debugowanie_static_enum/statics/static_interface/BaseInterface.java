package com.company.package4.debugowanie_static_enum.statics.static_interface;

public interface BaseInterface {

    static void print() {
        System.out.println("Interface printing");
        otherPrint();
    }
    private static void otherPrint() {
        System.out.println("other print");
    }

    void toOverride();
}
