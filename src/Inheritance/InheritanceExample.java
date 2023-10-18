package Inheritance;

// Parent class (superclass)
class Animal {


    Animal() {
        System.out.println("This is the Animal class constructor.");
    }

    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (subclass) inheriting from Animal
class Dog extends Animal {


    void eat() {
        System.out.println("This dog eats food.");
    }

    Dog() {
        System.out.println("This is the Dog class constructor.");
    }

    void bark() {
        System.out.println("The dog barks.");
    }
}

public class InheritanceExample {

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();  // Inherited from Animal
        myDog.bark(); // Defined in Dog

       // Allowed
        Animal animal1= new Dog();
        animal1.eat();


        Animal animal2= new Animal();

        // Not allowed
        // Dog myDog1 = new Animal();
    }
}
