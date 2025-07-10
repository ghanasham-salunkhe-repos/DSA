package oopsConcepts.oopProperties;

// visit : https://www.w3schools.com/java/java_encapsulation.asp for more and detailed information related to the topic

public class JavaEncapsulation {
//    encapsulation meaning wrap data with function in single unit
// ideally from outside of the class data// attribute should not be accessed directly
    // but we need to extract and provide data --> we can use encapsulation

//    while protecting data and serving access needs too, without providing direct access
//    we have getters and setter to use encapsulation

    // two private data
    private String myPassword;
    private Boolean areYouAdult;

    // getter are uses to get the data
    // for sensitive data you can only expose getter (i.e. read only access)
    public String getMyPassword() {
        return myPassword;
    }

    // setter are used to set the data
    public void setAreYouAdult(Boolean areYouAdult) {
        // this keyword is important too provide accurate mapping
        // this help us to segerate class attribute and parameter
        this.areYouAdult = areYouAdult;
    }

    public Boolean getAreYouAdult() {
        return areYouAdult;
    }

    public void setMyPassword(String myPassword) {
        this.myPassword = myPassword;
    }

    public static void main(String[] args) {

        // create object with constructor
        JavaEncapsulation javaEncapsulation = new JavaEncapsulation();

        // can easily set the data for class attributes
        javaEncapsulation.setMyPassword("myPassword");
        javaEncapsulation.setAreYouAdult(true);

        // can also retrive the data from class attribute
        System.out.println(javaEncapsulation.getMyPassword());
        System.out.println(javaEncapsulation.getAreYouAdult());
    }

    // encapsulation very powerfull property of class to maintain balance between access and secreting sensitive data
}
