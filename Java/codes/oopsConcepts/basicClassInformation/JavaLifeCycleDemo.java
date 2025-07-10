package oopsConcepts.basicClassInformation;

public class JavaLifeCycleDemo {
    // 1. Static field
    static int staticValue = initializeStatic("staticValue");

    // 2. Static block
    static {
        System.out.println("Static block executed");
    }

    // 3. Final field
    final int finalValue = initialize("finalValue");

    // 4. Instance field
    int instanceValue = initialize("instanceValue");

    // 5. Instance initializer block
    {
        System.out.println("Instance initializer block executed");
    }

    // 6. Constructor
    public JavaLifeCycleDemo() {
        System.out.println("Constructor executed");
        functionCallInConstructor();
    }

    // 7. Method called from constructor
    void functionCallInConstructor() {
        System.out.println("Function called from constructor");
    }

    // Helper methods for initialization
    static int initializeStatic(String name) {
        System.out.println("Static field " + name + " initialized");
        return 1;
    }

    int initialize(String name) {
        System.out.println("Instance field " + name + " initialized");
        return 2;
    }

    public static void main(String[] args) {
        System.out.println("Main started");
        JavaLifeCycleDemo obj = new JavaLifeCycleDemo();
    }
}

//Output Order:

//Static field staticValue initialized
//Static block executed
//Main started
//Instance field finalValue initialized
//Instance field instanceValue initialized
//Instance initializer block executed
//Constructor executed
//Function called from constructor


//Notes:
//static fields/blocks run once when the class is loaded.
//final fields must be initialized once, either at declaration or in the constructor.
//Instance fields and initializer blocks run before the constructor, in the order they appear.
//Methods called from the constructor execute after all instance fields and blocks.
//If you have inheritance, superclass static blocks/fields run before subclass, and superclass constructors run before subclass constructors.
//This covers the complete lifecycle and order of execution, including the effect of static and final modifiers.