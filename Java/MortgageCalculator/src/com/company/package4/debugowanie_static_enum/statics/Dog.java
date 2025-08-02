package com.company.package4.debugowanie_static_enum.statics;

public class Dog extends Animal{

    public static final int NUMBER_OF_LEGS = 4;


    public static int howManyDogsWeHaveInOurProgram = 0;

    private String name;

    public Dog(String name) {
        this.name = name;
        Dog.howManyDogsWeHaveInOurProgram++;
    }

    public static String staticExample() {
        return "Static example";
//        nonStaticExample();           // nie można się odwoływać do metod z obiektem (niestatycznych)
//        System.out.println(name);     // ani do pól
    }

//    public static void exampleBehaviour() {
//        super.exampleBehaviour();
//    }

    public void nonStaticExample() {
        System.out.println("Non static example");
        staticExample();
    }
}
