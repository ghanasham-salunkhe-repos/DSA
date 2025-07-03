package basics;

public class JavaDataTypes {

    public static void main(String[] args) {

//        we have 8 primitive types and many non-primitive datatypes
//        int,char,double,float,boolean,long,byte,short;
    /*
        Data Type	Description
        byte	Stores whole numbers from -128 to 127
        short	Stores whole numbers from -32,768 to 32,767
        int	Stores whole numbers from -2,147,483,648 to 2,147,483,647
        long	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
        boolean	Stores true or false values
        char	Stores a single character/letter or ASCII values
        *
        * */

//        long > int > short> byte
//        double > float
//        bigger container can hold small value

//        for integer number int is default type
//        for float double in default type
        // for other you need to use some flag at end or type cast
        int a=100;
        double bb=2321.42354325;
        double asas=2324.235235d;
        // non default types
        long b=a;
        byte c= (byte) a; // data loss can happen
        c= (byte) 133;
        long sda=3425235346L; // to declare long we need to have L at end
        float daa=23142.42325F; // same for float
//        in primitive datatype we have 6 as number types  where 4 are integer based & 2 are floating values

//        while String Integer, etc are non primitive datatypes

//        we can also use scientif numbers too
        float sc1=372e3f;
        double sc2=32123e11d;
        System.out.println(sc1);
        System.out.println(sc2);

        // boolean are there when you have yes or no scenario
//        we can use the boolean variables as the flags
        boolean flag=true;
        System.out.println(flag);

        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);
    }

//    additional information
/*
    Non-Primitive Data Types
    Non-primitive data types are called reference types because they refer to objects.

    The main differences between primitive and non-primitive data types are:
        Primitive types in Java are predefined and built into the language, while non-primitive types are created by the programmer (except for String).
        Non-primitive types can be used to call methods to perform certain operations, whereas primitive types cannot.
        Primitive types start with a lowercase letter (like int), while non-primitive types typically starts with an uppercase letter (like String).
        Primitive types always hold a value, whereas non-primitive types can be null.
        Examples of non-primitive types are Strings, Arrays, Classes etc. You will learn more about these in a later chapter.
* */

}
