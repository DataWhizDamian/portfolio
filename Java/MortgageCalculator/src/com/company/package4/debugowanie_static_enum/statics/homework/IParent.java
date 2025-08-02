package com.company.package4.debugowanie_static_enum.statics.homework;

public interface IParent {
    default String getName() {return "Parent name";}
    static String getClassName() {return "Parent";}
}
