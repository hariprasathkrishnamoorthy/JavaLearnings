package OOPS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class NameComparator implements Comparator<Employeecomporator> {
    @Override
    public int compare(Employeecomporator emp1, Employeecomporator emp2) {
        return emp1.getName().compareTo(emp2.getName());
    }
}

public class Employeecomporator{
    private String name;
    private double salary;

    public Employeecomporator(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        // Create a list of Employee objects
        List<Employeecomporator> employees = new ArrayList<>();
        employees.add(new Employeecomporator("John Smith", 50000.0));
        employees.add(new Employeecomporator("Jane Doe", 60000.0));
        employees.add(new Employeecomporator("Bob Johnson", 55000.0));

        // Create a NameComparator to sort employees by name
        Comparator<Employeecomporator> nameComparator = new NameComparator();

        // Sort the list of employees based on name
        Collections.sort(employees, nameComparator);

        // Print employee information after sorting
        for (Employeecomporator employee : employees) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
        }
    }
}

