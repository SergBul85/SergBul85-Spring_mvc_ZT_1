package com.hstn.spring.mvc;


import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Employee {

    private String name;
    private String surname;
    private int salary;

    private String department;
    private Map<String, String> departments;

    private String carBrand;
    private Map<String, String> carBrands;

    private String[] languages;
    private Map<String, String> languageList;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");

        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");
        carBrands.put("Mercedes-Benz", "MB");

        languageList = new HashMap<>();
        languageList.put("EN", "English");
        languageList.put("DE", "Deutch");
        languageList.put("RU", "Russian");

    }

    public Employee(String name, String surname, int salary, String department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
        departments = new HashMap<>();
        departments.put("IT", "Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
