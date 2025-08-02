package com.company.package4.debugowanie_static_enum.statics.static_interface;

public class Example implements BaseInterface{
    public static void main(String[] args) {
        Example example = new Example();
        example.toOverride();
        System.out.println();

        BaseInterface.print();
        example.print();
    }

    @Override
    public void toOverride() {
        System.out.println("to Override");
    }

//    @Override  --> Nie można overridować metod, które zostały zdefiniowane jako statyczne w interfejsie
    public void print() {
        System.out.println("Example printing");
    }
}
