package oopsConcepts.modifiersInJava;
// there are two types of modifiers
// access modifiers and non-access modifiers

// we have 4 main access modifiers inside java

//access-modifer : applied on --> access level
//public: class, method, variable,constructor --> Everywhere (same class, package, subclass, outside package)
//protected : method, variable, constructor --> Same class, package, and subclass (even in different packages)
//default (no modifier) : class, method, variable,constructor --> Only within the same package (aka package-private)
//private : method, variable, constructor --> Only within the same class
// inside this i will learn about the access modifier and we can create some new tutorial for non-access modifiers

// private protected java: modifier protected not allowed here on top class level
// we can use private and protected on innner class level

//##important points
//we can use the private to encapsulate critical data




// top level public class
public class AccessModifiers {

    // access level restriction is uniform for access modifier irrespective of where we're applying it
    private static void logTransaction() { } // only inside class
    void debit(double amount) { } // Package level access
    protected void validateUser() { } // Accessible in child classes + same package
    public void withdraw(double amount) { }
}

// default class
class SomeRandomClass{

}

// we get access modifiers in all class so we wills study continuoslu
// for more understanding read the pdf file attached

//🧠 Tips & Best Practices
// 1. ✅ Always prefer private for fields, and expose access via getter/setter methods (encapsulation).
// 2. ✅ Minimize protected unless necessary.
// 3. ❌ Avoid public fields — it breaks encapsulation.
// 4. ✅ private constructors are useful in Singleton, Factory Patterns.
// 5. ✅ Use default (package-private) for internal utilities not meant to be exposed outside your package.
// 6. ✅ Inheritance and frameworks (like Spring) often use protected methods for extensibility hooks.
