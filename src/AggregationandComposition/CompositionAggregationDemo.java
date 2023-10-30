package AggregationandComposition;

class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println(type + " engine started.");
    }

    public void stop() {
        System.out.println(type + " engine stopped.");
    }
}

class Car {
    private String model;
    private Engine engine; // Composition

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void start() {
        System.out.println("Car model " + model + " is starting.");
        engine.start();
    }

    public void stop() {
        System.out.println("Car model " + model + " is stopping.");
        engine.stop();
    }
}

class Person {
    private String name;
    private Car car; // Aggregation

    public Person(String name, Car car) {
        this.name = name;
        this.car = car;
    }

    public void drive() {
        System.out.println(name + " is driving the car.");
        car.start();
    }

    public void park() {
        System.out.println(name + " is parking the car.");
        car.stop();
    }
}

public class CompositionAggregationDemo {
    public static void main(String[] args) {
        Engine v6Engine = new Engine("V6");
        Car sportsCar = new Car("Sports Car", v6Engine);
        Person driver = new Person("Alice", sportsCar);

        driver.drive();
        driver.park();
    }
}

