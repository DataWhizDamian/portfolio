package com.company.package7.date_time_lambda.homework_date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class Exercise {
    public static void main(String[] args) {

//1. Przedstaw OffsetDateTime na ekranie w 4 różnych formatach
System.out.println("EXERCISE 1:");
        LocalDateTime localDateTime = LocalDateTime.of(2020, 10, 10, 12, 30);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(localDateTime, ZoneOffset.UTC);


        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(offsetDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(offsetDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(offsetDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(offsetDateTime));
        System.out.println();



//2. Jaki mamy dzień tygodnia dla podanej daty? 06.05.2018
System.out.println("EXERCISE 2:");

        LocalDate localDate = LocalDate.of(2018,5,6);
        System.out.println(localDate.getDayOfWeek());
        System.out.println();



//3. Na podstawie podanej daty (24.06.2012) wydrukuj na ekranie nazwę miesiąca słownie
System.out.println("EXERCISE 3:");

        LocalDate localDate3 = LocalDate.of(2012,6,24);
        System.out.println(localDate3.getMonth());
        System.out.println();




//4. Ile czasu minęło od epoch do dziś
System.out.println("EXERCISE 4:");

        Duration duration = Duration.of(Instant.now().getEpochSecond(), ChronoUnit.SECONDS);
        System.out.println(duration.toString());
        System.out.println(Period.ofDays((int) duration.toDays()));
        System.out.println();




//5. Oblicz okres między dwiema datami, spróbuj je wyrazić jako Period
System.out.println("EXERCISE 5:");

        LocalDate localDate1 = LocalDate.of(2020,10,1);
        LocalDate localDate2 = LocalDate.of(2021,11,12);
        System.out.println(Period.between(localDate1,localDate2));
        System.out.println();



//6. Która godzina jest w Nowym Jorku, jeżeli w Warszawie jest 02.10.2016 12:05:10
System.out.println("EXERCISE 6:");

        LocalDateTime localDateTime1 = LocalDateTime.of(2021,10,10,21,30,10);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime1, ZoneId.of("Poland"));
        System.out.println(zonedDateTime);
        ZoneId ny = ZoneId.of("US/Eastern");
        System.out.println(zonedDateTime.withZoneSameInstant(ny));




    }
}
