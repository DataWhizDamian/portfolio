package com.company.package8.przydatne_klasy.objects;

import java.util.Optional;

public class SteeringWheel {

    private final double diameter;

    public SteeringWheel(final double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        System.out.println("getting diameter");
        return diameter;
    }

    public Optional<Double> getDiameterOpt() {
        return Optional.of(diameter);
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "diameter=" + diameter +
                '}';
    }
}
