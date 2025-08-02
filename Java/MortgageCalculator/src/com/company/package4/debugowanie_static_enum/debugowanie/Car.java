package com.company.package4.debugowanie_static_enum.debugowanie;

public abstract class Car implements Hornable  {
    private String company;
    private String model;
    private String color;
    private String[] additionalEquipment;

    public Car(final String company, final String model, final String color, final String... additionalEquipments) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.additionalEquipment = additionalEquipments;
        method2();
    }

    private void method2() {
        System.out.println("example");
    }

    protected abstract String openDoors();
    protected abstract String openTrunk();

    protected String sayHello(String company, String model, String color) {
        return String.format("Hello my name is %s %s. I'm %s", company, model, color);
    }

    public int countAdditionalEquipmentElements() {
        return additionalEquipment.length;
    }

    public String getAdditionalEquipment() {
        StringBuilder sb = new StringBuilder("Equipment: ");
        int index = 0;
        for (String s : additionalEquipment) {
           if(additionalEquipment.length - 1 == index) {
               sb.append(s);
           } else {
            sb.append(s).append(", ");
           }
           index++;
        }
        greetings();
        return sb.toString();
    }

    public void greetings() {
        System.out.println(sayHello(company,model,color));
        System.out.println(horn());
        System.out.println(openDoors());
        System.out.println(openTrunk());
    }
}
