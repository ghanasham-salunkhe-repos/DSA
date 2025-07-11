package oopsConcepts.inheritanceInJava;

// in java we have feature called inheritance which help us to pass on properties and methods from one class to another
// class which you're inheriting is parent class/ superclass
// class which inheritating some other class is child class/ subclass
public class ParentClass {

    // we use protected access modifier to provide access to parent outside the package too
    protected void someRandomClass(){
        System.out.println("hello world");
    }

    // lets declare some variables
    private String someRandomString;
    private Boolean someRandomBoolean;
    private Integer someRandomInteger;

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
    public Boolean getSomeRandomBoolean() {
        return  someRandomBoolean;
    }
    public Integer getSomeRandomInteger() {
        return  someRandomInteger;
    }
    public String getSomeRandomString() {
        return  someRandomString;
    }
}
