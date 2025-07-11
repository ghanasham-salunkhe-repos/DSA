package oopsConcepts.inheritanceInJava.basics;

// we use extends keyword to extend/inherit some class
// you cant inherit multiple classes in java(multiple inheritance cant be achieved via class--> can be with interfaces)
public class ChildClass extends ParentClass {

    // lets declare some datapoint here to
    private Double someRandomDouble;


    // if we have parametized constructor we need to inherit with super keyword in child constructor
    public ChildClass() {
        // it mandatory to pass super in constructor as first code line
        super("somestring",true,1000);
        System.out.println("ChildClass constructor is called");
    }

    // we can write function to get parent data
    public void getParentData(){
        // as someRandomeBoolean, someRandomeString, someRandomeInteger all are private it cant be accessed in child
        // with encapsulation we can access them
//        we can use super keyword to access parent
        System.out.println(getSomeRandomBoolean());
        System.out.println(getSomeRandomString());
        System.out.println(getSomeRandomInteger());

        // we can directly access protected attributes & functions
        someRandomCharacter='a';
        System.out.println(someRandomCharacter);
        someProtectedMethodParentClass();

    }

    // super keyword gives us access to parent class

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.getParentData();

        // we can access parent level data with parent level reference to child class
        // just like super can access in class
        // parent reference cant access child data
        ParentClass parentClass=childClass;
        System.out.println(parentClass.getSomeRandomBoolean());

//        if any class is overidden, even referenc is parent, child function is invoked as object belong to child class
        // keep this scenario in mind while working on overriding functions in inheritance scenario
        System.out.println(childClass);//
        System.out.println(parentClass);// both are
    }
//    output :
//      ParentCass constructor is called --> parent class is always called while creating child class too
//      ChildClass constructor is called
//      true
//      somestring
//      1000
//      a
//      parent protected function is called
    // true


    @Override
    public String toString() {
        return STR."ChildClass{someRandomDouble=\{someRandomDouble}, someRandomCharacter=\{someRandomCharacter}}";
    }
}
