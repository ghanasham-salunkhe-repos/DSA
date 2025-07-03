package conditionsAndLoops;

public class IfConditionalBlock {

    // here inside this code i will explain things about if condition
    public static void main(String[] args) {
        /*
        1) normal if block
            if(condition){
                code inside this will be triggered if condition is true
            }

        2) if else statement
           if(condition){
                this code will be triggered if condition is true
           }else{
                 this code will be triggered if condition is false
           }

        3) if else if else block : used when we have multiple conditions to check & validate
           if(condition1){
                this code will be ran if condition1 is true

           }else if(condition2){
                this code will be ran if condition2 is true and condition 1 is false
           }
           else{
                this block of code will run when condition1 and condition2 both are false
           }

        4) we have ternary operator for quickly checkinf if else condition

            (condition)?code if condition is true: code if condition is false;
            --> we can create if else ladder here too

         5) we also have switch case for hadling multiple conditions
         --> we will study about that in other class
        */

        System.out.println("44 is even : "+ oddEven(44));//true
        System.out.println("327476874682323 is even : "+oddEven(327476874682323L));//false
        System.out.println("age 14 : "+movieEligibility(14));// allowed with parents
        System.out.println("age 54 : "+movieEligibility(54));//not allowed
        System.out.println("age 34 : "+movieEligibility(34));//allowed

    }


//    lets write some functions where we can use these if else block and test them

//    A) odd -> false even --> true
    // simple function
    public static boolean oddEven(int number){
        if (number%2==0)
            return true;
        else
            return false;
    }

    public static boolean oddEven(Long number){
//        with ternary operator
        return number%2==0?true:false;
    }

//    if else ladder
    public static String movieEligibility(int age){
//        12 to 18 --> allowed with parents
//        18 to 45 --> allowed
//        else : not allowed
        if(age>=12 && age <18){
            return "allowed with parents";
        }
        else if (age>=18 && age<=45){
            return "allwoed";
        }
        else
            return "not allowed";
    }

}
