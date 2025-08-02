package com.company.package7.date_time_lambda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalManipulatedExample {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2020,1,20);
        System.out.println("Not manipulated: " + localDate);
        System.out.println(localDate.plusDays(1));
        System.out.println(localDate.plusWeeks(2));
        System.out.println(localDate.plusMonths(3));
        System.out.println(localDate.plusYears(4));
        System.out.println(localDate.atStartOfDay());

        System.out.println("chaining: " + localDate.plusDays(3).minusMonths(3));
        System.out.println(localDate.toEpochDay());
        System.out.println();



        LocalTime localTime = LocalTime.of(10,50,10);
        System.out.println(localTime);
        System.out.println(localTime.toSecondOfDay());
        System.out.println();


        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);
        System.out.println(localDateTime.toLocalDate());

        System.out.println(localTime.atDate(localDate)); //= localDateTime

    }
}
