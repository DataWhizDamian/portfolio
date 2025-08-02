package com.company.package9.klasy_zagniezdzone.staticNestedClass;

public class StaticMainAnother {

    private String nonStaticHello;

    static class Nested {

        private String nonStaticHello;

        private static String hello = "hello";


        private static void staticMethod() {
            StaticMainAnother staticMainAnother = new StaticMainAnother();
            System.out.println(staticMainAnother.nonStaticHello);
        }

        private void nonStaticMethod() {
            System.out.println("nonStaticMethod");
        }

        static class NestedNested {
            private String nestedNestedHello = "nestedNestedHello";

            private static String nestedNestedHelloStatic = "nestedNestedHelloStatic";

            public void nestedNestedStaticMethod() {
                System.out.println("staticMethod" + Nested.hello);
            }
        }

    }

}
