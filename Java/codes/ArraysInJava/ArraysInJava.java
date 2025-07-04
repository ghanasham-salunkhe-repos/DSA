package ArraysInJava;

public class ArraysInJava {

    // in java arrays are used to store multiple objects of same datatype together
    // arrays have lot of applications
    // arrays have fixed size and that cant be changed once done
    // arrays can store primitives + objects while list can store only non primitives
    // arrays are fixed while list gives flexibility
    public static void main(String[] args) {

//        lets create some arrays
//    Array of string

        String[] array= new String[5];// here 5 is size of array
        // you can use square braces to fill and read data from array
        // index of array start from 0
        array[0]="abx";
        array[1]="ds4";
        array[2]="ds3";
        array[3]="ds2";
        array[4]="ds1";

        System.out.println(array);// you cant directly print array
//        List<int> abc=new ArrayList<>();
        // you can use for each loop to traverse through array

        for(String word : array){
            System.out.print(word+" ");//abx ds4 ds3 ds2 ds1
        }
        System.out.println();
        // another way to create arrays
        // you can directly create the arrays with curly braces
        String[] array2={"dsa","sda","fds","fa"};

        for(String aa:array2){
            System.out.print(aa+" ");
        }//dsa sda fds fa

        System.out.println();
        // you can create array out of non primitive ex : string[] also primitives
        int[] listOfNumbers={122,123,124,125,126};

        // another way to do same thing
        int[] arr= new int[]{1,2,3,4,5,6,7,8};
        System.out.println(arr);

        //For object arrays, you can modify the object's internal state in a for-each loop,
        // but you cannot assign a new object to the array element.
        // basically say we have some property inside object in foreach loop we can change that but cant assign new object altogether
        for (Integer a:listOfNumbers){
            System.out.print(a+" ");//122 123 124 125 126
        }

        //another way
        System.out.println();
        for (int i = 0; i < listOfNumbers.length; i++) {
            System.out.print(listOfNumbers[i]+" ");//122 123 124 125 126

        }
        System.out.println();
        // 2d array
//        lets create 2d array

        int[][] twoDArray= new int[2][3];
        System.out.println(twoDArray);

        // another way to create 2 d array inside java
        int[][] multiDimensionalArray={{123,12,1},{124,12,1}};
        System.out.println(multiDimensionalArray);


    }
}
