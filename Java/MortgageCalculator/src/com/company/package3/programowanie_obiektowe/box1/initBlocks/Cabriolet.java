package com.company.package3.programowanie_obiektowe.box1.initBlocks;

public class Cabriolet extends Car{

    //block starts
    {
        this.company = "Audi";
        printDuringInitBlock();
    }
    //block ends

    private String company;
    private String model;

    public Cabriolet(String model) {
        System.out.println(Cabriolet.class + " constructor called");
        this.model = model;
    }

//    public Cabriolet(String model) {
//        System.out.println(Cabriolet.class + " constructor called");
//        this.model = model;
//    }


    private void printDuringInitBlock() {
        System.out.println("I'm printing during init block" + Cabriolet.class);
    }

    @Override
    public String toString() {
        return "Cabriolet{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                "} " + super.toString();
    }
}
