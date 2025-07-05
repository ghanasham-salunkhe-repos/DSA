package oopsConcepts.ConstructorInformation;

public class Serpent extends  Animals{

    boolean doesAnimalCrawl;

    public Serpent(Integer legs,String name,String voice,boolean isHerbivorous,boolean doesAnimalCrawl){
        // when we have inherited class, we can use super to fill data in parent attribute
        super(legs,name,voice,isHerbivorous);
        this.doesAnimalCrawl = doesAnimalCrawl;
    }

    public void setDoesAnimalCrawl(boolean doesAnimalCrawl) {
        this.doesAnimalCrawl = doesAnimalCrawl;
    }

    public boolean isDoesAnimalCrawl() {
        return doesAnimalCrawl;
    }

    @Override
    public String toString() {
        // super keyword only used from child class not object of child class
        return super.toString();
    }

    //The super keyword can only be used within a child class to refer to the parent class's methods
    // or attributes. It cannot be used directly from an object of the class. It is specifically designed
    // for inheritance scenarios to access parent class functionality.

//    we will study more on constructors after some time
}
