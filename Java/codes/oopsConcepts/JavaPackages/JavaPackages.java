// the first line of code you see it specifies package for the class you're going to write below
package oopsConcepts.JavaPackages;

// here you're importing method, similarly you can import class, whole package, functions, attributes too
import static oopsConcepts.JavaPackages.utils.PackageConstants.STUDENT;

// importing variables
import static oopsConcepts.JavaPackages.service.PackageService.process;
import static oopsConcepts.JavaPackages.utils.PackageConstants.ABC;

//we can also use wildcard too to import everything from package or class
// not recommendate but you can do that
//example
//import static oopsConcepts.JavaPackages.utils.PackageConstants.*;
// wildcard to import all constant variables from packageconstant class

// package is keyword and then you will have path from the main package to its subpackages
// packages are used to group some classes
// in java classes having similar functionlity can be stored under same package
// inside a package we can have subpackages like exception, service, utils,dto, models
// package is really good way to store code / group the code with functionlity
public class JavaPackages {

    public static void main(String[] args) {
//        if you see this package it has combination of multiple different classes service serving different purpose
        // combiningly used in package to provide some functionlity
//        lets call main function from service here

        System.out.println(ABC);
        System.out.println(STUDENT);
        process(args);
    }

    // in java we have predefined packages we use regularly
    // using predefined - built in packages we can create custom packages like this to provide some functionality
    // packages help us to write good maintainable code


}
