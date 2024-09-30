package com.Assement;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Sowmya"));
        employees.add(new Employee("XYZ"));
        employees.add(new Employee("ABC"));
        employees.add(new Employee("Animal"));

        List<Employee> employees2 = employees.stream().filter(emp -> emp.getName().startsWith("A")).collect(Collectors.toList());
        System.out.println("Employees whosse name starts with 'A': ");
        employees2.forEach(System.out::println);
    }
}
