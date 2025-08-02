package com.company.package7.date_time_lambda;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormattingExample {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018, Month.OCTOBER,28);
        LocalTime time = LocalTime.of(1,50);
        LocalDateTime dateTime = LocalDateTime.of(date,time);
        OffsetDateTime offsetDateTime = OffsetDateTime.of(dateTime, ZoneOffset.ofHours(-4));
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, ZoneId.of("Europe/Paris"));
        Instant instant = zonedDateTime.toInstant();



//        System.out.println("ISO_LOCAL_DATE_TIME.format: " + DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(date));
//        System.out.println("ISO_LOCAL_DATE.format: " + DateTimeFormatter.ISO_LOCAL_DATE.format(time));
        System.out.println("ISO_LOCAL_DATE_TIME.format: " + DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(dateTime));
        System.out.println("ISO_LOCAL_DATE_TIME.format: " + DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(offsetDateTime));
        System.out.println("ISO_LOCAL_DATE_TIME.format: " + DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(zonedDateTime));
//        System.out.println("ISO_LOCAL_DATE.format: " + DateTimeFormatter.ISO_LOCAL_DATE.format(instant));
        System.out.println();

        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(zonedDateTime));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(zonedDateTime));
        System.out.println();

        //formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm z");
        System.out.println("Custom format: " + formatter.format(zonedDateTime));


        //parsing
        LocalDate localDate = LocalDate.parse("2020-03-15");
        LocalDateTime localDateTime = LocalDateTime.parse("2020-03-15T11:50:55");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.parse("2020-03-15T10:15+01:00[Europe/Paris]");

        String stringDate = "Mon, 05 May 1980";
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("EEE, d MMM yyyy", Locale.ENGLISH);
        System.out.println(LocalDate.parse(stringDate, formatter1));
    }
}
