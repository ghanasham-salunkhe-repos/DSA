package oopsConcepts.modifiersInJava;

//noaccess modifer : applied on // fucntioning

//# already discussed
//  static : Variables, methods, blocks,nested classes // static data belongs to the class, not instances
//  final : Classes, methods, variables // Makes entities unchangeable (constant, non-overridable,or non-inheritable)
//  abstract : Classes, methods // Incomplete implementation must be extended or overridden --> just like interfaces contract but for the function
//|--> for abstract class you cannot create the object from abstract class

//  synchronized : Methods, blocks //  Controls access in multi-threaded environments
//  volatile : Variables // Ensures visibility across threads, Flags shared across threads; guarantees most up-to-date value
//  transient : Variables // Excludes field from serialization --> while serializging the class transient variable are avoid to convert in chunk as they have sensitive data

// dont worry about them
//  native : Methods // Declares method is implemented in native code (e.g.,C/C++)
//  strictfp : Classes, methods // Enforces floating-point precision consistency across, platforms

//abstract can be applied on class or methos
abstract class abc{

    // abstract method will only present inside abstract class
    abstract void abstractMethod();
}

public class NonAccessModifiers extends abc{

    // you can run the static blocks to
    //Static blocks in Java are executed when the class is first loaded into memory by the Java Virtual Machine (JVM),
    // before any object of the class is created and before any static methods are called. They run only once per class loading.
    static {
        System.out.println("Static static");
    }

    static int count;
     String abc;

     // volatile make sure changes to the variable are visible to all threads.
     volatile int counter=0;

//    transient Prevents a field from being serialized.
//    while class serilization (convert java code into chunks)
// Serialization in Java is the process of converting an object into a byte stream, so it can be easily saved to a file,
// sent over a network, or stored in memory. This allows the object's state to be persisted or transferred and later reconstructed (deserialized)
// back into a copy of the original object.To serialize an object, the class must implement the java.io.Serializable interface.
// Fields marked as transient are skipped during serialization.

    public static void main(String[] args) {

    }

    // we will study more about volatile and synchronized in threads
    // if we have multithreaded function we have case like chasing for resources
    // in those conditions synchronized mandate only one thread can access the function at once
    // synchronized can only applied on blocks or methods
    public synchronized void increment() {
        count++;
    }

    // overiddne class can throw exception
    @Override
    void abstractMethod() throws RuntimeException{
        System.out.println("Abstract Method");
    }

//    Declares a method implemented in native code (e.g., C/C++).

}
