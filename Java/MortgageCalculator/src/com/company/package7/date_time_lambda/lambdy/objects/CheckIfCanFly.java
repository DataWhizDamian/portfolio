package com.company.package7.date_time_lambda.lambdy.objects;

public class CheckIfCanFly implements Checkable {

    @Override
    public boolean test(final Animal a) {
        return a.isCanFly();
    }


}
