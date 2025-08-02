package com.company.package4.debugowanie_static_enum.debugowanie;

public class Debugging {
    public static void main(String[] args) {
        Cabriolet cabriolet = new Cabriolet("BMW","8","red", false,
                "fire extinguisher", "message");
        Cabriolet cabriolet2 = new Cabriolet("Mercedes","SLR","white", true);
        cabriolet.greetings();
        cabriolet.closeRoof();
        System.out.println(cabriolet.countAdditionalEquipmentElements());
        System.out.println(cabriolet.getAdditionalEquipment());

    }
}
