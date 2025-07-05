package oopsConcepts.ConstructorInformation;

// lets create a class of animal to explain the concepts of the constructors in java
// constructor is function which dont have any returntype (not even void)
public class Animals {

    // lets declare some properties
    private Integer legs;
    private String name;
    private String voice;
    private Boolean isHerbivorous;

    @Override
    public String toString() {
        return STR."Animals{legs=\{legs}, name='\{name}', voice='\{voice}', isHerbivorous=\{isHerbivorous}}";
    }

    // lets also create some methods too
    public void makeNoice(){
        System.out.printf("%s! %s! %s!\n",voice,voice,voice);
    }


    // by default java has default constructor which dont have any parameter
    // default constructor
    // a class can have multiple constructor according to need
//    constructor can be used to set initial values for object attributes

    public Animals(){

    }

    //if you can observe constructors can be overloaded jsut like functions
    // new keyword is used to create object of some class
    // constructor takes parameter to set the initial values to object
    // a constructor which taking all attribute values as parameter called as AllArgsConstructor
    public Animals(Integer legs, String name, String voice, Boolean isHerbivorous){

        // this is keyword is used to point to current object instance
        // its very helpfull
        // this keyword in Java refers to the current object in a method or constructor.
        //this keyword is often used to avoid confusion when class attributes have the same name as method or constructor parameters.

        this.legs = legs;
        this.name  = name;
        this.voice = voice;
        this.isHerbivorous = isHerbivorous;
    }

//    lets create constructor which takes only legs and name
    public Animals(Integer legs, String name){
        this.legs = legs;
        this.name  = name;
    }

    // lets create constructor taking 3 values
    public Animals(Integer legs, String name, String voice){
        this.legs = legs;
        this.name  = name;
        this.voice = voice;

    }

    // lets create constructor which will take only name of the animal
    public Animals(String name){
//        Note: The call to this() must be the first statement inside the constructor. else compiler throw exception
        this(4,"SOMEVOICE",true);// calling another constructor a constructor
        this.name = name;
    }

    public Animals(Integer legs,String voice, Boolean isHerbivorous){
        this.legs = legs;
        this.voice = voice;
        this.isHerbivorous = isHerbivorous;
    }

    public Integer getLegs() {
        return legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public Boolean getHerbivorous() {
        return isHerbivorous;
    }

    public void setHerbivorous(Boolean herbivorous) {
        isHerbivorous = herbivorous;
    }

}
