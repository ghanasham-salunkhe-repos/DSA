package errorsInJava;

//lets complete this part for understanding the exception
//there are two types of exception :
//checked and unchecked exception
//1) checked exception -
// identified by compiler and need to be handled or throw out of function with throws from  function signature
// all checked exception have Exception as superclass
// this can be found

//2)  unchecked exceptions
// known as runtime exception which can arise inside the code like arithmaticException due to divide by 0 and array out of bound/ nullpointerexception
// for all unchecked exceptions have RuntimeException as parent exception
// these exception cant be identified by compiler as they happen in runtime stage

public class ExceptionHandlingInJava {
    public static void main(String[] args)
    // we can throw also
//            throws  Exception :this is also doable
    {

//        1) checked exception handling
        // we have one function which throw exception
        // this is checked exception as compiler will ask it handle or throw
        //we will handle it as we alredy thrown it
        // we can use try finally only but it will not handle the exception
        // finally will always execute even if we have return in catch
        //catch is important to manage the exception
        try{
            someRandomFunction();
        }catch (Exception e){
            // ideally we should not use printstacktrace in enterprise application
            // you should use logger to log error message
            e.printStackTrace();
        }
        finally {
//            finally is there to close the resources if any error arises
            // say you have scanner open, which is ideally closed so do that
            System.out.println("finally");
        };

//        2) Unchecked Exception
//        Yes, you can throw a runtime exception from a function body in Java.
//        However, it is generally not considered a good practice to use runtime exceptions
//        for handling predictable or recoverable errors. Runtime exceptions are typically used for
//        programming errors, such as invalid arguments or violations of invariants,
//        and should not be used as a substitute for proper error handling.

        try {
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        catch (RuntimeException exception){
            System.out.println("RuntimeException");
        }catch (Exception exception){
            System.out.println("exception");
        }

        // in excpetion handling we can have multiple catch statements order matches
        // order to specific to generic else, generic will handle the exception and specific will not even get chance

    }


//    lets create a function which has chances to throw exception
    public static void someRandomFunction() throws Exception {
        throw new Exception("some randome exception");
    }
}
