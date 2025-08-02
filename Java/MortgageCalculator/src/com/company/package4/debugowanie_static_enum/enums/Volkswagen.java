package com.company.package4.debugowanie_static_enum.enums;

public enum Volkswagen implements MyExampleInterface{
    PASSAT("white", 2020),
    GOLF("red", 2100),
    ARTEON("green",3238),
    TIGUAN("blue",2400),
    TOUAREG("brown",1964);

    private String colors;

    private int productionYear;

    Volkswagen(String colors, int productionYear) {
        this.colors = colors;
        this.productionYear = productionYear;
    }

    public String getColors() {
        return colors;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Volkswagen{" +
                "colors='" + colors + '\'' +
                ", productionYear=" + productionYear +
                "} " + super.toString();
    }

    @Override
    public String doSomething() {//implementuje(overriduje = nadpisuje) metodę doSomething() z interfejsu MyExampleInterface
        return productionYear + "ohoho";
    }
}
