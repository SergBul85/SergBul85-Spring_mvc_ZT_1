package com.hstn.spring.mvc;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Getter
@Setter
public class Employee {

    @Size(min = 2, message = "Name must be min 2 symbols")
    private String name;

    @NotBlank(message = "Surname is required")
    private String surname;

    @Min(value = 100, message = "Must be greater than 99")
    @Max(value = 1000, message = "Must be less than 1001")
    private int salary;

    private String department;
    private Map<String, String> departments;

    private String carBrand;
    private Map<String, String> carBrands;

    private String[] languages;
    private Map<String, String> languageList;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "Enter valid phone number in format XXX-XX-XX")
    private String phoneNumber;

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


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", departments=" + departments +
                ", carBrand='" + carBrand + '\'' +
                ", carBrands=" + carBrands +
                ", languages=" + Arrays.toString(languages) +
                ", languageList=" + languageList +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
