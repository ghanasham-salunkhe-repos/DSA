package oopsConceptsInJava;

// see this class

public class CarClass {

    // it has properites
    private int wheels;
    private int gears;
    private boolean electric;
    private double engineTopSpeed;
    private double enginePower;// in hp

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;

    // functions
    @Override
    public String toString() {
        return STR."CarClass{wheels=\{wheels}, gears=\{gears}, electric=\{electric}, engineTopSpeed=\{engineTopSpeed}, enginePower=\{enginePower}}";
    }


    //lets also create setter, getter, tostring and constructor
    public CarClass(int wheels, int gears, boolean electric, double engineTopSpeed, double enginePower, String color) {
        this.wheels = wheels;
        this.gears = gears;
        this.electric = electric;
        this.engineTopSpeed = engineTopSpeed;
        this.enginePower = enginePower;
        this.color = color;
    }


    // lets write drive class
    public void drive(){
        System.out.printf("a %s car having %d wheels,%d gears with topSpeedOf %.2f and %.2f enginepower is driving\n",color,wheels,gears,engineTopSpeed,enginePower);
    }

    public void breakFunction(){
        System.out.println("applied break");
    }
    public void turnOff(){
        System.out.println("applied turnOff");;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    public double getEngineTopSpeed() {
        return engineTopSpeed;
    }

    public void setEngineTopSpeed(double engineTopSpeed) {
        this.engineTopSpeed = engineTopSpeed;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }


}
