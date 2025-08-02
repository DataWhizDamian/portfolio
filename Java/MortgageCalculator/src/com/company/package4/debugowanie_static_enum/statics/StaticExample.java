package com.company.package4.debugowanie_static_enum.statics;

public class StaticExample {
    public static void main(String[] args) {
        Dog dog1 = new Dog("burek");
        //static należy do klasy (nie do instancji obiektu), więc odwołujemy się do klasy (Dog zamiast dog1/dog2/dog3)
        System.out.println("Dog1: " + Dog.staticExample());
        Dog dog2 = new Dog("Bati");
        System.out.println("Dog2: " + Dog.staticExample());
        Dog dog3 = new Dog("szczekacz");
        System.out.println("Dog3: " + Dog.staticExample());

        dog2.nonStaticExample();

//instancja klasy StaticExample (stworzony obiekt), za pomocą której można się odwołać do metody niestatycznej
        StaticExample staticExamples = new StaticExample();
        staticExamples.nonstaticExamples();
    }

    public void nonstaticExamples() {
        System.out.println("Static example");
    }


}
