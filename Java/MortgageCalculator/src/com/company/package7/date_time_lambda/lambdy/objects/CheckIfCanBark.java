package com.company.package7.date_time_lambda.lambdy.objects;

public class CheckIfCanBark implements Checkable {

    @Override
    public boolean test(Animal a) {
        return a.isCanBark();
    }



}
