package com.company.package3.programowanie_obiektowe.box1.wlasciwosciKlasy.example;

import java.util.Objects;

public class Car {
    private String company;
    private String model;
    private int productionYear;

//gettery
    public String getCompany() {
        return this.company;
    }
    public String getModel() {
        return this.model;
    }

    public int getProductionYear() {
        return this.productionYear ;
    }

//Setter
public String setCompany(String company) {
    return this.company = company;
}
    public String setModel(String model) {
        return this.model = model;
    }

    public int setProductionYear(int productionYear) {
        return this.productionYear = productionYear;
    }




    public Car(String company, String model, int productionYear) {
        this.company = company;
        this.model = model;
        this.productionYear = productionYear;
    }
//    this. -definiuje konstruktor, czyli służy do nazywania parametrów wyjściowych metody identycznie jak pola w klasie

    // equals principles(zasady)
    // - x.equals(x) should be always true
    // - x.equals(y) == true  ->  y.equals(x) == true
    // - x.equals(y) == true  &  y.equals(z) == true  ->  x.equals(z) == true
    // in case of null  ->  false


//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (obj instanceof Car) {
//            Car otherCar = (Car) obj;
//            return company.equals(otherCar.company)
//                    && model.equals(otherCar.model)
//                    && productionYear == otherCar.productionYear;
//        }
//        return false;
//    }

    // cmd + n  ->  [equals() and hashCode()]
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Car car = (Car) o;

        if (productionYear != car.productionYear) {
            return false;
        }
        if (!Objects.equals(company, car.company)) {
            return false;
        }
        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        int result = company != null ? company.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + productionYear;
        return result;
    }

    // - x.equals(y) = true  ->  x.hashCode()  ==  y.hashCode()
    // - calling x.hashCode() multiple times on an object that was not modified in the middle shoudl return the same result
    // - x.hashCode()  ==  y.hashCode()  ->  does not need x.equals(y)  ==  true
    //Jeżeli obiekty nie są sobie równe, to może się zdarzyć, że będą miały ten sam wynik metody hashCode()

    public String toString() {
        return "Car{" +
                "company='" + company + "\'" +
                ", model='" + model + "\'" +
                ", productionYear=" + productionYear +
                '}';
    }
}
