package ArraysInJava;

import java.util.Arrays;
import java.util.OptionalInt;

public class ArrayExamples {

    public static double getAverage(int[] arrayOfAges){

        double sum=0;
        for (int i = 0; i < arrayOfAges.length; i++) {
            sum+=arrayOfAges[i];
        }
        // another way to get sum
        sum= Arrays.stream(arrayOfAges).sum(); //easy way

        return (double) sum/arrayOfAges.length;

    }

    public static OptionalInt getSmallestNumber(int[] arrayofNumbers){
        return Arrays.stream(arrayofNumbers).min();
    }

    public static OptionalInt getLargestNumber(int[] arrayofNumbers){
        return Arrays.stream(arrayofNumbers).max();
    }

    public static int getRandomNumber(int start, int end){
        return start + (int)(Math.random()*(end-start));

    }

    public static void main(String[] args) {

        int[] listOfIntegers=new int[10];

        for (int i = 0; i < 10; i++)
        {
            int number=getRandomNumber(1,100);
            listOfIntegers[i]=number;
            System.out.println(number);
        }
        System.out.println(getAverage(listOfIntegers));
        System.out.println(getSmallestNumber(listOfIntegers).getAsInt());
        System.out.println(getLargestNumber(listOfIntegers).getAsInt());
    }
}
