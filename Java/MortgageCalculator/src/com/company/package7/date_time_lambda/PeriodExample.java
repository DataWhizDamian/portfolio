package com.company.package7.date_time_lambda;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class PeriodExample {

    public static void main(String[] args) {
        System.out.println(Period.of(10,2,34));

        System.out.println("Period.ofDays: " + Period.ofDays(1));
        System.out.println("Period.ofWeeks: " + Period.ofWeeks(2));
        System.out.println("Period.ofMonths: " + Period.ofMonths(3));
        System.out.println("Period.ofYears: " + Period.ofYears(4));
        System.out.println();



        LocalDate localDate1 = LocalDate.of(2020,10,3);
        LocalDate localDate2 = LocalDate.of(2020,12,9);

        System.out.println("localDate1.isBefore: " + localDate1.isBefore(localDate2));
        System.out.println("localDate1.isLeapYear: " + localDate1.isLeapYear()); //czy jest rokiem przestępnym
        System.out.println("localDate1.isAfter: " + localDate1.isAfter(localDate2));
        System.out.println();



        LocalDate localDate = LocalDate.of(2021,11,4);
        LocalTime localTime = LocalTime.of(13,15);
        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);

        System.out.println("localDate.plus: " + localDate.plus(Period.of(2,3,10)));
        System.out.println("localDateTime.plus: " + localDateTime.plus(Period.of(2,3,10)));

        System.out.println("OffsetDateTime.now.plus: " + OffsetDateTime.now().plus(Period.of(2,3,10)));
        System.out.println("ZonedDateTime.now.plus: " + ZonedDateTime.now().plus(Period.of(2,3,10)));
        System.out.println();


        System.out.println("localDate.isSupported: " + localDate.isSupported(ChronoUnit.HOURS));
        System.out.println("localDate.isSupported: " + localDate.isSupported(ChronoUnit.DAYS));
        System.out.println("localDate.plus: " + localDate.plus(2,ChronoUnit.DAYS));

        System.out.println("localDate.isSupported: " + localDate.isSupported(ChronoUnit.MONTHS));
        System.out.println("localDate.plus: " + localDate.plus(2,ChronoUnit.MONTHS));

        System.out.println("localDate.isSupported: " + localDate.isSupported(ChronoUnit.YEARS));
        System.out.println("localDate.plus: " + localDate.plus(2,ChronoUnit.YEARS));
        System.out.println();




        System.out.println("Period.between: " + Period.between(localDate1,localDate2));
        System.out.println("Period.between: " + Period.between(localDate2,localDate1));
        System.out.println("Period.between: " + Period.between(localDate1,localDate1));
        System.out.println();

        Period period = Period.between(localDate1,localDate2);
        System.out.println("period.get: " + period.get(ChronoUnit.DAYS));
        System.out.println("period.get: " + period.get(ChronoUnit.MONTHS));
        System.out.println("period.get: " + period.get(ChronoUnit.YEARS));
        System.out.println();

        System.out.println("period.getDays: " + period.getDays());
        System.out.println("period.getMonths: " + period.getMonths());
        System.out.println("period.getYears: " + period.getYears());
        System.out.println();

        System.out.println("period.isNegative: " + period.isNegative());
        System.out.println("period.isZero: " + period.isZero());
        System.out.println("period.isZero: " + period.ZERO.isZero());
        System.out.println("period.totalMonths: " + period.toTotalMonths());
        System.out.println("period.getUnits: " + period.getUnits()); //jednostki






    }
}
