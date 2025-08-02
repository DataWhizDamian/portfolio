package com.company.package9.klasy_zagniezdzone.staticNestedClass;

public class StaticMain {

    public static void main(String[] args) {
        StaticMainAnother.Nested.NestedNested nestedNested = new StaticMainAnother.Nested.NestedNested();
        nestedNested.nestedNestedStaticMethod();
    }
}
