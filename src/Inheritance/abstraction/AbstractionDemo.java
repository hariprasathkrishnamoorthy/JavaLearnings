package Inheritance.abstraction;

// Abstract class representing a general shape
abstract class Shape {
    // Abstract method for calculating area (no implementation)
    public abstract double calculateArea();

    // Abstract method for calculating perimeter (no implementation)
    public abstract double calculatePerimeter();

    // Concrete method (with implementation) for displaying information
    public void displayInfo() {
        System.out.println("This is a shape.");
    }
}

// Concrete class Circle that extends the Shape class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea for a circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementation of calculatePerimeter for a circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Concrete class Rectangle that extends the Shape class
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of calculateArea for a rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Implementation of calculatePerimeter for a rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        // Creating instances of Circle and Rectangle
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Calculating and displaying area and perimeter for the shapes
        System.out.println("Circle - Area: " + circle.calculateArea() + ", Perimeter: " + circle.calculatePerimeter());
        System.out.println("Rectangle - Area: " + rectangle.calculateArea() + ", Perimeter: " + rectangle.calculatePerimeter());

        // Using the displayInfo method
        circle.displayInfo();
        rectangle.displayInfo();
    }
}
