package Bai3;

import java.util.*;
import java.util.stream.Collectors;

// Class Employee
class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class exthree {
    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee(1, "Hoàng", 900),
                new Employee(2, "Bình", 1500),
                new Employee(3, "Miu", 2000),
                new Employee(4, "Thanh Bình", 800)
        );

        List<String> result = list.stream()
                .filter(e -> e.getSalary() > 1000)  
                .map(Employee::getName)             
                .sorted()                            
                .collect(Collectors.toList());       

        System.out.println("Danh sách nhân viên lương > 1000:");
        result.forEach(System.out::println);
    }
}