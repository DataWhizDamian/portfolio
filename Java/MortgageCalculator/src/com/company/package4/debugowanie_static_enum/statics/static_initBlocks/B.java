package com.company.package4.debugowanie_static_enum.statics.static_initBlocks;

public class B extends A{

    static String staticField1ClassB;
    static String staticField2ClassB = initStaticField2ClassB();

    private String nonStaticField1ClassB;
    private String nonStaticField2ClassB;
    private String nonStaticField3ClassB = initField3ClassB();

    // static init block
    static {
        System.out.println("1B) staticFieldClassB");                                      //4
      staticField1ClassB = "staticFieldClassB";
//      nonStaticField2ClassB = "nonStaticField2ClassB";
    }
    {
        System.out.println("2B) nonStaticFieldClassB");                                   //9
        nonStaticField2ClassB = "nonStaticField2ClassB";
        staticField1ClassB = "staticFieldClassB";
    }

    public B(String nonStaticField1ClassA, String nonStaticField1ClassB) {
        super(nonStaticField1ClassA);
        System.out.println("3B) this.nonStaticField1ClassB = nonStaticField1ClassB;");    //10
        this.nonStaticField1ClassB = nonStaticField1ClassB;
    }

    private String initField3ClassB() {
        System.out.println("4B) initField3ClassB");                                       //8
        return "initField3ClassB";
    }

    private static String initStaticField2ClassB() {
        System.out.println("5B) initStaticField2ClassB");                                 //3
        return "initStaticField2ClassB";
    }
}
