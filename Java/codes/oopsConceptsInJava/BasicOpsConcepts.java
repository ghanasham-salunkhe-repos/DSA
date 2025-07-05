package oopsConceptsInJava;

public class BasicOpsConcepts {

    // oops is nothing but Object oriented programming
    // in oop we write objects which has functions plus data both

//    Object-oriented programming has several advantages over procedural programming:
//
//    OOP is faster and easier to execute
//    OOP provides a clear structure for the programs
//    OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
//    OOP makes it possible to create full reusable applications with less code and shorter development time
    public static void main(String[] args) {

        // in oop the class is blueprint of object
        // in normal procedural language we go function to function
        // in oops we have properties(data) and behavior(functions)

//        lets create objects of car
        // in oops we gave class example --> CarClass which act as blueprint for object
        // object is instance of the class
        // when a instance of class (object)  is created then it will inherit attribute(properties) and behaviour(methods) from class
        CarClass carClass=new CarClass(4,6,false,180,1500,"red");
        System.out.println(carClass);

        carClass.drive();
        carClass.turnOff();
        carClass.breakFunction();

        System.out.println();
        // now create object with bently
        // we can create n number of objects from single class
        BentleyCar bentleyCar=new BentleyCar(4,6,false,280,2500,"red","GRS17");

        // lets drive bentley
        bentleyCar.drive();
        // lets apply break
        bentleyCar.breakFunction();
//        lets take a turn
        bentleyCar.turnOff();
    }
}
