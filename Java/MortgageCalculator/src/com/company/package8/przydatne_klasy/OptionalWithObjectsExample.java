package com.company.package8.przydatne_klasy;

import com.company.package8.przydatne_klasy.objects.Car;

import java.util.Optional;

public class OptionalWithObjectsExample {
    public static void main(String[] args) {
        Optional<Car> car = Optional.of(new Car());
//        Optional<Car> car = Optional.empty();

        //Nie używając Optionala
//        Car car1 = new Car();
//        SteeringWheel steeringWheel = car1.getSteeringWheel();
//        double diameter1 = steeringWheel.getDiameter();


        Optional<Double> diameter2 = car
                .map(c -> c.getSteeringWheel())
                .map(sw -> sw.getDiameter())
//                .filter(d -> d >= 0.5)
//                .filter(d -> d < 0.7);
                .filter(d -> {
                    System.out.println("filtering d >= 0.5");
                    return d >= 0.5;
                })
                .filter(d -> {
                    System.out.println("filtering d < 0.7");
                    return d < 0.7;
                });
        System.out.println(diameter2);
        System.out.println();


        Optional<Car> or = car
                .or(() -> {
                    System.out.println("first");
                    return Optional.empty();
                })
                .or(() -> {
                    System.out.println("second");
                    return Optional.of(new Car());
                });
        System.out.println(or);
    }


}
