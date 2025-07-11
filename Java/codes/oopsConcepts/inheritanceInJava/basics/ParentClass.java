package oopsConcepts.inheritanceInJava.basics;

// in java we have feature called inheritance which help us to pass on properties and methods from one class to another
// class which you're inheriting is parent class/ superclass
// class which inheritating some other class is child class/ subclass
// inheritance used to create maintainable code + help to reuse code
// inheritance used to hierarchical classification(tree like structure with class and subclass) + polymorphism(we will learn in next topic)
public class ParentClass {

    // we use protected access modifier to provide access to parent outside the package too
    protected void someProtectedMethodParentClass() {
        System.out.println("parent protected function is called");
    }

    // also create one private function
    private void somePrivateMethodParentClass(){
        System.out.println("parent private function is called");
    }

    // lets declare some variables

    private String someRandomString;
    private Boolean someRandomBoolean;
    private Integer someRandomInteger;
    // this character will can be access via child
    protected Character someRandomCharacter;
//    lets also create one constructor
    // by default while creating object of child class parent class constructor will be called

    public ParentClass(String someRandomString, Boolean someRandomBoolean, Integer someRandomInteger) {
        System.out.println("ParentCass constructor is called");
        this.someRandomString = someRandomString;
        this.someRandomBoolean = someRandomBoolean;
        this.someRandomInteger = someRandomInteger;
    }
    //lets create some getters and setters too

    public void setSomeRandomString(String someRandomString) {
        this.someRandomString = someRandomString;
    }
    public void setSomeRandomBoolean(Boolean someRandomBoolean) {
        this.someRandomBoolean = someRandomBoolean;
    }

    public void setSomeRandomInteger(Integer someRandomInteger) {
        this.someRandomInteger = someRandomInteger;
    }

    public  void setSomeRandomCharacter(Character someRandomCharacter) {
        this.someRandomCharacter = someRandomCharacter;
    }

    public Boolean getSomeRandomBoolean() {
        return  someRandomBoolean;
    }

    public Integer getSomeRandomInteger() {
        return  someRandomInteger;
    }

    public String getSomeRandomString() {
        return  someRandomString;
    }

    public Character getSomeRandomCharacter() {
        return  someRandomCharacter;
    }

    @Override
    public String toString() {
        return STR."ParentClass{someRandomString='\{someRandomString}', someRandomBoolean=\{someRandomBoolean}, someRandomInteger=\{someRandomInteger}, someRandomCharacter=\{someRandomCharacter}}";
    }
}
