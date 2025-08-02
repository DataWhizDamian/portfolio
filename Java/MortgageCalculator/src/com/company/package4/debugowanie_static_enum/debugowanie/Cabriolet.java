package com.company.package4.debugowanie_static_enum.debugowanie;

public class Cabriolet extends Car{
    private boolean roofOpened;

    public Cabriolet(final String company, final String model, final String color, final boolean roofOpened, final String... additionalEquipments) {
        super(company, model, color, additionalEquipments);
        this.roofOpened = roofOpened;
    }

    @Override
    protected String openDoors() {
        return "Cabrio opening doors";
    }

    @Override
    protected String openTrunk() {
        return "Cabrio opening trunk";
    }

    @Override
    public String horn() {
        return "Cabrio making sound";
    }

    public void openRoof() {
        if (!roofOpened) {
            System.out.println("Cabrio opening the roof");
            this.roofOpened = true;
        }
    }

    public void closeRoof() {
        if (roofOpened) {
            System.out.println("Cabrio closing the roof");
            this.roofOpened = false;
        }
    }
}
