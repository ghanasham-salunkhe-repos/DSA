package errorsInJava;

public class ErrorsInJava {

    // we can have 3 main types of errors
//    1) compile time errors/ syntax error : error received due to wrong syntax in code and caught in compile time
//    2) Runtime error : these kinda error happens in runtime of class and not get caught in compile time
//        --> run time errorc can be caught using java exceptions (try catch block)
//    3) Logical Error : as name suggest logical error, hard to find, you need to debug and find out about this

    public static void main(String[] args) {

        // missing semicolon or braces is very common compile time error
//        System.out.println("das")//';' expected
//        IDE is good enough to find out the compile time error

//        runtime error
//        ex divide by 0
//        System.out.println(10/0);// it will not be caught by compiler
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at errorsInJava.ErrorsInJava.main(ErrorsInJava.java:19)

//        you can use try catch(exception handling in java to handle these kinda errors)
//        ex :

        // we will comeback to excptions and exception handling after sometime
        try
        {
            System.out.println(10/0);
        }catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught");
        }//ArithmeticException caught

        String[] listOfString=new String[2];
        //array out of bound is also common runtime error
        try
        {
            System.out.println(listOfString[10]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }

        // logical error which i make so often so no need to explain it
    }
}
