package basics;

public class FibonacciSeries {

    public static void main(String[] args) {

        for (int i = 1; i < 60; i++) {
            System.out.format("%d number of series is : %d\n",i,fibonacciNumber(i));
        }
    }

    public static long fibonacciNumber(int index){

        if (index==1)
            return 0;
        else if (index==2)
            return 1;
        else
            return fibonacciNumber(index-1)+fibonacciNumber(index-2);
    }
}
