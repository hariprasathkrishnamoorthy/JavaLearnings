package Inheritance.multilevel;

// Grandparent class
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Parent class inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Child class inheriting from Dog
class GermanShepherd extends Dog {
    void guard() {
        System.out.println("German Shepherd is guarding...");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        GermanShepherd dog = new GermanShepherd();
        dog.eat();    // Inherited from Animal
        dog.bark();   // Inherited from Dog
        dog.guard();  // Specific to GermanShepherd
    }
}
