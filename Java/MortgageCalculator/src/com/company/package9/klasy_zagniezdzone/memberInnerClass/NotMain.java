package com.company.package9.klasy_zagniezdzone.memberInnerClass;

public class NotMain {

    private final static String hello = "hello";

    public void call() {
        Inner1 inner1 = new Inner1("MainInner");
        inner1.innerCall();
    }

    public class Inner1 {

        private String hello;


        public Inner1(String hello) {
            this.hello = hello;
        }

        public void innerCall() {
            System.out.println("Calling inner!" + hello);
        }

    }





    private int a = 1;


    class Inner {
        private int a = 2;

        class InnerInner {
            private int a = 3;

            class InnerInnerInner {
                private int a = 4;

                public void printALLa() {
                    System.out.println(a);
                    System.out.println(this.a);
                    System.out.println(InnerInnerInner.this.a);
                    System.out.println(InnerInner.this.a);
                    System.out.println(Inner.this.a);
                    System.out.println(NotMain.this.a);
                }
            }
        }
    }





    private interface KtoBogatemuZabroni {
        void call();

        default void call2() {

        }
    }
}
