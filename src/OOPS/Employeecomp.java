package OOPS;

import java.util.*;
import java.lang.*;

public class Employeecomp implements Comparable<Employeecomp> {
    private String name;
    private int salary;

    public Employeecomp(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employeecomp e) {
        // Compare employees based on their salary
        return this.salary-e.getSalary();
    }

    public static void main(String[] args) {
        // Create a list of Employee objects
        List<Employeecomp> employees = new ArrayList<>();
        Set<Employeecomp>  empset= new HashSet<>();
        employees.add(new Employeecomp("John Smith", 50000));
        employees.add(new Employeecomp("Jane Doe", 60000));
        employees.add(new Employeecomp("Bob Johnson", 55000));

        empset.add(new Employeecomp("John", 50000));
        empset.add(new Employeecomp("John", 50000));
        empset.add(new Employeecomp("John", 50000));

        ListIterator<Employeecomp> it = employees.listIterator();

        while(it.hasNext())
        {
            Employeecomp e= it.next();

            System.out.println("name--- "+e.getName());
        }

        for (Employeecomp e : empset)
        {

            System.out.println("set values "+e.getName());
        }


        // Print employee information before sorting
        for (Employeecomp employee : employees) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
        }

        System.out.println("-------------------------------------------------");

        // Sort the list of employees based on salary
        Collections.sort(employees);

        // Print employee information after sorting
        for (Employeecomp employee : employees) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
        }

        it = employees.listIterator();

        while(it.hasNext())
        {

            System.out.println("name--- "+it.next().getName());
        }
    }
}

