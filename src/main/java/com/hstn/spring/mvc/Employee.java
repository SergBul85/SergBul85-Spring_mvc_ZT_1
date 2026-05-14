package com.hstn.spring.mvc;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

    private String name;
    private String surname;
    private int salary;
    private String department;

    public Employee() {
    }

    public Employee(String name, String surname, int salary, String department) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.department = department;
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
