package Inheritance.multipleInheritance;

// Interface 1
interface Flying {
    void fly();
}

// Interface 2
interface Swimming {
    void swim();
}

// Class implementing both interfaces
class Bird implements Flying, Swimming {
    @Override
    public void fly() {
        System.out.println("Bird is flying...");
    }

    @Override
    public void swim() {
        System.out.println("Bird is swimming...");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.swim();
    }
}

