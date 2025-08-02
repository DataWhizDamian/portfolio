package com.company.package7.date_time_lambda;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class DurationExample {

    public static void main(String[] args) {

        System.out.println("Duration.ofDays: " + Duration.ofDays(1));
        System.out.println("Duration.ofHours: " + Duration.ofHours(1));
        System.out.println("Duration.ofMinutes: " + Duration.ofMinutes(1));
        System.out.println("Duration.ofSeconds: " + Duration.ofSeconds(1));
        System.out.println("Duration.ofMilis: " + Duration.ofMillis(1));
        System.out.println("Duration.ofNanos: " + Duration.ofNanos(1));
        System.out.println();


        System.out.println("Duration.of: " + Duration.of(1, ChronoUnit.DAYS));
        System.out.println("Duration.of: " + Duration.of(1, ChronoUnit.HOURS));
        System.out.println("Duration.of: " + Duration.of(1, ChronoUnit.MINUTES));
        System.out.println("Duration.of: " + Duration.of(1, ChronoUnit.SECONDS));
        System.out.println("Duration.of: " + Duration.of(1, ChronoUnit.MILLIS));
        System.out.println("Duration.of: " + Duration.of(1, ChronoUnit.NANOS));
        System.out.println();



        LocalTime localTime = LocalTime.of(10,30,15);
        Duration duration = Duration.ofDays(1);

        System.out.println(localTime.plus(duration));


        System.out.println(duration.truncatedTo(ChronoUnit.MINUTES));
        System.out.println(duration.truncatedTo(ChronoUnit.SECONDS));
        System.out.println(duration.truncatedTo(ChronoUnit.HOURS));



    }


}
