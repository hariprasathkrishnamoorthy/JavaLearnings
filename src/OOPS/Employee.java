package OOPS;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
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
        // Create three Employee objects
        Employee employee1 = new Employee("John Smith", 50000.0);
        Employee employee2 = new Employee("Jane Doe", 60000.0);
        Employee employee3 = new Employee("Bob Johnson", 55000.0);

        // Print employee information
        System.out.println("Employee 1:");
        System.out.println("Name: " + employee1.getName());
        System.out.println("Salary: " + employee1.getSalary());
        System.out.println();

        System.out.println("Employee 2:");
        System.out.println("Name: " + employee2.getName());
        System.out.println("Salary: " + employee2.getSalary());
        System.out.println();

        System.out.println("Employee 3:");
        System.out.println("Name: " + employee3.getName());
        System.out.println("Salary: " + employee3.getSalary());
    }
}
