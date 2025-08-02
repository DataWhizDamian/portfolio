package com.company.package4.debugowanie_static_enum.statics.instanceVsClass;

public class Car {
    private String company;
    private String model;
    private int productionYear;

    private SteeringWheel steeringWheel;


    static long staticNumberOfCarsCreated;
    long numberOfCarsCreated;

    public Car() {
        this.company = "BMW";
        this.model = "X5";
        this.productionYear = 2020;
        this.steeringWheel = new SteeringWheel(0.35);
        horn();
        numberOfCarsCreated++;
        staticNumberOfCarsCreated++;
    }


    public void horn() {
        int i = 5;
        System.out.println("Car horn!");
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", steeringWheel=" + steeringWheel +
                '}';
    }
}
