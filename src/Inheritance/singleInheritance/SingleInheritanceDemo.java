package Inheritance.singleInheritance;

// Superclass
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited from Animal class
        dog.bark(); // Specific to Dog class
    }
}
