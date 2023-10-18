package StaticFinal;

 class MyClass {
    // Static variable shared among all instances of MyClass
    static int staticVariable = 0;

    // Instance variable
    int instanceVariable;

    // Constructor to initialize instance variables
    MyClass(int value) {
        this.instanceVariable = value;
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Instance method
    void instanceMethod() {
        System.out.println("This is an instance method.");
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        // Create instances of MyClass
        MyClass obj1 = new MyClass(1);
        MyClass obj2 = new MyClass(2);

        // Access static variable using class name
        MyClass.staticVariable = 42;

        // Access instance variables
        System.out.println("obj1.instanceVariable: " + obj1.instanceVariable);
        System.out.println("obj2.instanceVariable: " + obj2.instanceVariable);

        // Access static variable through instances (not recommended)
        obj1.staticVariable = 10;
        System.out.println("obj1.staticVariable: " + obj1.staticVariable);
        System.out.println("obj2.staticVariable: " + obj2.staticVariable);

        // Call static method using class name
        MyClass.staticMethod();

        // Call instance methods through instances
        obj1.instanceMethod();
        obj2.instanceMethod();
    }
}
