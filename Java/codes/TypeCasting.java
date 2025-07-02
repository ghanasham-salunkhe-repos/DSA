public class TypeCasting {

//    in java we can typecast variables value from one datatype to another called typecast
//    typecast can be loseless (widening typecasting) & lossful (narrowing type casting)

//    Widening Casting (automatically) - converting a smaller type to a larger type size
//    byte -> short -> char -> int -> long -> float -> double
//
//    Narrowing Casting (manually) - converting a larger type to a smaller size type
//    double -> float -> long -> int -> char -> short -> byte

    // type casting can be easily done within the primitive datatypes
    public static void main(String[] args) {

//        byte to long
        byte b= (byte) 1332;
        long l=b; // easily
        System.out.println("byte value is : "+b);
        System.out.println("long value is : "+l);

        double d=(double) 22/7;
        int dd=(int)d;
        System.out.println("double value is : "+d);
        System.out.println("integer value is : "+dd);

//        if you type cast a number to char it will give character for that ascii code
        System.out.println((char) 65);// 65==>A

        // if you type cast char to int we will get ascii code for that
        System.out.println((int)'A');// A==>65

        System.out.println(Math.round(13214.81423));

    }
}
