package com.company.package7.date_time_lambda;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class OffsetExample {
    public static void main(String[] args) {

        System.out.println(OffsetDateTime.now(ZoneId.of("UTC")));
        System.out.println(OffsetDateTime.of(2020,10,3,15,40,10,123, ZoneOffset.UTC));

        System.out.println(OffsetDateTime.MAX);
        System.out.println(OffsetDateTime.MIN);
        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.UTC);

        OffsetDateTime offsetDateTime = OffsetDateTime.of(2020,10,20,10,1,1,1,ZoneOffset.ofHours(2));
    }
}
