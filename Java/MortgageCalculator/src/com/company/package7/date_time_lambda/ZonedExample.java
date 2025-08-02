package com.company.package7.date_time_lambda;

import java.time.*;

public class ZonedExample {
    public static void main(String[] args) {

        ZoneOffset utc = ZoneOffset.UTC;
        ZoneId usPacific = ZoneId.of("US/Pacific");
        ZoneId paris = ZoneId.of("Europe/Paris");

        System.out.println(ZonedDateTime.of(2000,10,10,1,2,3,4, utc));
        System.out.println(ZonedDateTime.of(LocalDate.of(2020,10,3), LocalTime.of(10,30,2), utc));
        System.out.println(ZonedDateTime.of(LocalDate.of(2020,10,3), LocalTime.of(10,30,2), paris));
        System.out.println(ZonedDateTime.of(LocalDateTime.of(2020,10,3,10,30,2), usPacific));
        System.out.println();

        System.out.println(ZonedDateTime.now());
        System.out.println("ZoneId.getAvailableZoneIds: " + ZoneId.getAvailableZoneIds());
        System.out.println("ZoneId.of: " + ZoneId.of("Poland"));
        System.out.println("ZoneId.systemDefault: " + ZoneId.systemDefault());
        System.out.println();
        System.out.println();


        ZonedDateTime zonedDateTime = ZonedDateTime.of(2000,12,10,11,10,3,5,utc);
        System.out.println("ZonedDateTime.toLocalDateTime: " + zonedDateTime.toLocalDateTime());
        System.out.println("ZonedDateTime.toLocalDate: " + zonedDateTime.toLocalDate());
        System.out.println("ZonedDateTime.toLocalTime: " + zonedDateTime.toLocalTime());
        System.out.println("ZonedDateTime.toOffsetDateTime: " + zonedDateTime.toOffsetDateTime());

        System.out.println("ZonedDateTime.getOffset: " + zonedDateTime.getOffset());
        System.out.println("ZonedDateTime.getZone: " + zonedDateTime.getZone());
        System.out.println("ZonedDateTime.getDayOfMonth: " + zonedDateTime.getDayOfMonth());
        System.out.println("ZonedDateTime.getDayOfWeek: " + zonedDateTime.getDayOfWeek());
        System.out.println("ZonedDateTime.getDayOfYear: " + zonedDateTime.getDayOfYear());
        System.out.println();



        //zmiana strefy czasowej
        ZoneId zone = ZoneId.of("Europe/Paris");

        LocalDate date1 = LocalDate.of(2018,3,25);
        LocalTime time1 = LocalTime.of(1,55);
        ZonedDateTime dateTime1 = ZonedDateTime.of(date1,time1,zone);

        System.out.println("Step1: " + dateTime1);
        dateTime1 = dateTime1.plusHours(1);
        System.out.println("Step2: " + dateTime1);


    }
}
