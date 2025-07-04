package methodsInJava;

public class FunctionOverloading {

//    we can create multiple functions with same name with change in parameter
    // java will automatically identify and return data

//    lets create overloaded fuction for summing up multiple numbers
    //The return type does not play a role in distinguishing overloaded methods in Java.
// Method overloading is determined solely by the method name and the parameter list
// (number, type, or order of parameters). In your example,
// the methods are considered overloaded because their parameter types differ (int vs double).
// The return type difference is irrelevant for method overloading.

    // in overloaded functions the function call is dependent on parameter according to parameters function will be called
    // if i pass two integers this function will be triggered
    public static int someRandomFunction(int a, int b){
        return a + b;
    }

    public static double someRandomFunction(double a, double b){
        return a + b;
    }

    public static long someRandomFunction(long a, long b){
        return a + b;
    }

    public static float someRandomFunction(float a, float b){
        return a + b;
    }
    // if two functions has same parameter and same returntype that problem
//    public static float someRandomFunction(float a, float b){
//        return a + b;
//    }

    // two functions with same parameters and different datatypes is also problem
//    public static double someRandomFunction(float a, float b){
//        return a + b;
//    }

//Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.
    public static void main(String[] args) {

        int sum=someRandomFunction(10,20);
        System.out.println(sum);
        double sum1=someRandomFunction(10,20);
        System.out.println(sum1);
        float sum2=someRandomFunction(10.23f,20.23f);
        System.out.println(sum2);
        long sum3=someRandomFunction(1l,2l);
        System.out.println(sum3);

        System.out.println(someRandomFunction(192,132.42));// this will trigger ==>
        // public static double someRandomFunction(double a, double b){return a + b;}
    }

    // java scope
//    scope inside function is call local scope
}
