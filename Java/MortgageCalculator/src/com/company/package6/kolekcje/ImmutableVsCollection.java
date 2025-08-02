package com.company.package6.kolekcje;

import java.util.HashSet;
import java.util.Set;

public final class ImmutableVsCollection {

    private final Set<String> someSet;

    public ImmutableVsCollection(String someElement1, String someElement2) {
        Set<String> objects = new HashSet<>();
        objects.add(someElement1);
        objects.add(someElement2);
        this.someSet = objects;
    }

//    public final Set<String> getSomeSet() { // nie jest immutable
//        return someSet;
//    }

    public final Set<String> getSomeSet() { //jest immutable = bo jest robiona kopia Seta - new HashSet<>(someSet), przez co nie bedzie się dało na tym Setcie operować
        return new HashSet<>(someSet);
    }

    public static void main(String[] args) {
        ImmutableVsCollection obj = new ImmutableVsCollection("element1", "element2");
        System.out.println(obj.getSomeSet()); //tutaj operujemy na kopii Seta
        obj.getSomeSet().add("element3");
        System.out.println(obj.getSomeSet()); //tutaj operujemy na kopii Seta
    }
}
