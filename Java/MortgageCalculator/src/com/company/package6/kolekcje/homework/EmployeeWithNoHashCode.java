package com.company.package6.kolekcje.homework;

public class EmployeeWithNoHashCode {

    private final String name;
    private final String surname;

    public EmployeeWithNoHashCode(final String name, final String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "EmployeeWithNoHashCode{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
