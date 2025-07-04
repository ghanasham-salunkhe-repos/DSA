package methodsInJava;

// in this class we will study briefly about methods/functions in java
public class FunctionInJava {
    // a function need to be written inside the java class
    // function is code which we can call it many times
    // we can pass some parameters in function and write logic accordingly
    // functions can provide output (non void function) and we have void functions to which do not provide any output
    // Why use methods? To reuse code: define the code once, and use it many times.
    // access identifier static(for access) datatye functionname(datatype parameter.....){
    //  //method body
    //  // return statment if you're returning anything from the function
     //
    // }

    // in java we have many predefined function ex : system.out.println()

    public static int someRandomFunction(int number, String value){

        // some randome operations
        number=number+100;
        System.out.println(number);
        System.out.println(value);

        // return the processed value
        return number+1000;
    }

    public static void main(String[] args) {

        FunctionInJava functionInJava = new FunctionInJava();
        // function call
        // the value which we pass in function is called argumen
        // we pass argument in function as parameter
        System.out.println(someRandomFunction(11,"ghansham"));
    }

    //each class has special function which has same name as class called as constructor
    // we will have default constructor created default
    // constructor can have parameter and it will return class object so no return type declared
    public FunctionInJava() {
        System.out.println("functionInJava constructor is called");
    }
}
