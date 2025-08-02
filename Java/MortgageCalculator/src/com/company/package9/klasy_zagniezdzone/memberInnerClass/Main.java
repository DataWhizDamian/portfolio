package com.company.package9.klasy_zagniezdzone.memberInnerClass;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.call();

        System.out.println();

        main.call2();
    }

    public void call() {
        NotMain notMain = new NotMain();
        NotMain.Inner1 inner1 = notMain.new Inner1("inner1");
        NotMain.Inner1 inner12 = notMain.new Inner1("inner2");

        inner1.innerCall();
        inner12.innerCall();
    }

    public void call2() {
        NotMain notMain = new NotMain();

        NotMain.Inner inner = notMain.new Inner();
        NotMain.Inner.InnerInner innerInner = inner.new InnerInner();
        NotMain.Inner.InnerInner.InnerInnerInner innerInnerInner = innerInner.new InnerInnerInner();

        innerInnerInner.printALLa();
    }
}
