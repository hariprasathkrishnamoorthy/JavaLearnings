package Inheritance.Hierarchical;

// Superclass
class Vehicle {


    Vehicle ()
    {

        System.out.println("Vehicle constructor");
    }
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Subclass 1
class Car extends Vehicle {

    Car()
    {
        super();
    }

    void drive() {

        System.out.println("Car is driving...");
    }
}

// Subclass 2
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is riding...");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        car.start(); // Inherited from Vehicle
        car.drive(); // Specific to Car
        bike.start(); // Inherited from Vehicle
        bike.ride(); // Specific to Bike
    }
}

