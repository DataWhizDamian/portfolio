package com.company.package4.debugowanie_static_enum.statics.homework;

public class AnotherChild implements IParent{
    @Override
    public String getName() {
        return "another child name";
    }

    public static String getClassName() {return "another child";}
}
