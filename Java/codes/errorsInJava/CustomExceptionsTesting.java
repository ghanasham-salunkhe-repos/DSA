package errorsInJava;

import errorsInJava.exceptions.GhanshamSalunkheException;

public class CustomExceptionsTesting {

    public static void main(String[] args) {

        System.out.println(addNumbers(100,12));
    // Exception in thread "main" errorsInJava.exceptions.GhanshamSalunkheException
        //	at errorsInJava.CustomExceptionsTesting.addNumbers(CustomExceptionsTesting.java:18)
        //	at errorsInJava.CustomExceptionsTesting.main(CustomExceptionsTesting.java:9)

//        we are throwing custom exceptions here
    }

//    lets create a randome exception
    public static Integer addNumbers(Integer a, Integer b)throws  GhanshamSalunkheException{
        if (a>b){
            // throw is used to throw new exception
//            while throws used to push the exception out of the function signature
            throw new GhanshamSalunkheException();
        }
        return a + b;
    }
}
