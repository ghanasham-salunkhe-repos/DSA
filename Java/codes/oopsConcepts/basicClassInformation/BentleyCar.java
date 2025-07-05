package oopsConcepts.basicClassInformation;

// so now we have bently which will inherit parent class so does its propertied
// code reusability and scalabilty is very easy
// strong encapsulation of data
// without writing any additional code we got code for the
public class BentleyCar extends CarClass {

    public BentleyCar(int wheels, int gears, boolean electric, double engineTopSpeed, double enginePower, String color,String carModel) {
        super(wheels, gears, electric, engineTopSpeed, enginePower, color);
        this.carCompany = "BENTLEY";
        this.carModel = carModel;
    }

    public BentleyCar() {
        super(4,5,false,100,1000,"");// primitive datatype cant access null as value

    }
    private String carModel;
    private String carCompany;


    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }


    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }
}
