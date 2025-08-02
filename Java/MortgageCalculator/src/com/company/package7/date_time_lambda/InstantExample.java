package com.company.package7.date_time_lambda;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class InstantExample {

    public static void main(String[] args) {
        System.out.println(Instant.ofEpochSecond(2000451325L));
        System.out.println(Instant.now());
        System.out.println();


        ZoneId zone1 = ZoneId.of("Europe/Belgrade");
        ZoneId zone2 = ZoneId.of("Asia/Singapore");

        LocalDate date1 = LocalDate.of(2020,11,3);
        LocalTime time1 = LocalTime.of(12,36);

        System.out.println("Non Instant:" + ZonedDateTime.of(date1,time1,zone1));
        System.out.println("Instant:" + ZonedDateTime.of(date1,time1,zone1).toInstant());
        System.out.println("Non Instant:" + ZonedDateTime.of(date1,time1,zone2));
        System.out.println("Instant:" + ZonedDateTime.of(date1,time1,zone2).toInstant());
        System.out.println();


        ZonedDateTime zonedDateTime = ZonedDateTime.of(date1, time1, zone1);
        Instant instantOriginal = Instant.ofEpochSecond(zonedDateTime.toEpochSecond());
        Instant instantPeriod = instantOriginal.plus(Period.of(0,0,2));
        Instant instantDuration = instantOriginal.plus(Duration.ofHours(78));

        System.out.println(instantOriginal);
        Instant instant = instantOriginal.plus(1, ChronoUnit.DAYS);
        System.out.println(instant);
        instant = instant.plus(1, ChronoUnit.HOURS);
        System.out.println(instant);

        System.out.println("instantPeriod: " + instantPeriod.isAfter(instantOriginal));
        System.out.println("instantPeriod: " + instantDuration.isBefore(instantOriginal));

        System.out.println("instant.truncatedTo: " + instant.truncatedTo(ChronoUnit.DAYS));





    }
}
