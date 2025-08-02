package com.company.package7.date_time_lambda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;

public class LocalExample {

    public static void main(String[] args) {
        System.out.println("LocalDate.now: " + LocalDate.now());
        System.out.println("LocalTime.now: " + LocalTime.now());
        System.out.println("LocalDateTime.now: " + LocalDateTime.now());
        System.out.println();

        System.out.println("LocalDate.of: " + LocalDate.of(2020,4,20));
        System.out.println("LocalTime.of: " + LocalTime.of(23,10));
        System.out.println("LocalDateTime.of: " + LocalDateTime.of(1999, Month.APRIL,10,12,30));
        System.out.println();

        System.out.println("LocalDate.ofYearDay: " + LocalDate.ofYearDay(2000,360));
        System.out.println("LocalDate.ofYearDay: " + LocalDate.ofYearDay(2000,360));
        System.out.println("LocalDate.ofEpochDay: " + LocalDate.ofEpochDay(1));
        System.out.println("LocalDateTime.from: " + LocalDateTime.from(LocalDateTime.of(LocalDate.of(2020,2,3), LocalTime.of(12,10))));
        System.out.println();

        System.out.println("LocalDate.MIN: " + LocalDate.MIN);
        System.out.println("LocalDate.NOON: " + LocalTime.NOON);
        System.out.println("LocalDate.MIDNIGHT: " + LocalTime.MIDNIGHT);
        System.out.println();

        System.out.println(Arrays.toString(Month.values()));

    }
}
