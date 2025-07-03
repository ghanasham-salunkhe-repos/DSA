package conditionsAndLoops;

import java.util.ArrayList;
import java.util.List;

public class WhileLoops {

    // function to get the prime number or not
    // be aware about the infinite loop condition inside while loop
    public static boolean isPrime(int number){
        if (number==1 || number<=0){
            return false;
        }
        else if(number==2){
            return true;
        }
        else {
            int value=2;
            while (value <= number / 2) {
                if (number%value==0){
                    return false;
                }
                value++;
            }
            return true;

        }
    }

    // while loops are loops when when you dont know until what time you need to run loop
    public static void main(String[] args) {

        System.out.println("-2 is prime : "+isPrime(22));//false
        System.out.println("0 is prime : "+isPrime(0));//false
        System.out.println("1 is prime : "+isPrime(1));//false
        System.out.println("2 is prime : "+isPrime(2));//true
        System.out.println("3 is prime : "+isPrime(3));//true
        System.out.println("7 is prime : "+isPrime(7));//true
        System.out.println("13 is prime : "+isPrime(13));//true
        System.out.println("23 is prime : "+isPrime(23));//true
        System.out.println("83 is prime : "+isPrime(83));//true

        List<Integer> primeNumberList= new ArrayList<>();

//        while loop to print prime numbers from 1 to 1000;
        int end=10000;
        int counter=0;
        boolean primeNumberFlag;
        while (counter<end){
            primeNumberFlag=isPrime(counter);
            System.out.println(counter+" is prime : "+primeNumberFlag);
            if (primeNumberFlag){
                primeNumberList.add(counter);
            }
            counter++;
        }

        System.out.println(primeNumberList);
        System.out.println(primeNumberList.size());
    }
}
