package methodsInJava;

public class RecursionInJava {

//    recursive function for getting factorial of number
    public static long factorial(int number){
        if (number == 1 || number==0) return 1;

        // recurssion call
        else
            return number*factorial(number-1);
    }

    // sum of numbers from o to n
    // recurssion is internally a loop
    // we should have base conditions
    public static long sumOfNumberUntilN(int n){
        if (n==0)
            return 0;
        else if (n==1)
            return 1+0;
        else
            return sumOfNumberUntilN(n-1)+n;
    }

//    calling ownself inside self function body is called recurssion
//    very important part of coding and dynamic coding
    public static void main(String[] args) {

        for (int i = 0; i <= 20; i++) {
            System.out.print("factorial of "+i +" is : "+factorial(i)+"\n");
        }

        System.out.println("sum of number until 1000 is : "+sumOfNumberUntilN(1000));
    }
}
