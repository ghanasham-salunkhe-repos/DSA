package conditionsAndLoops;

public class DoWhileLoop {

    // a variation of while loop which runs atleast one time
    // usefull for game

//    The do/while loop always runs at least once, even if the condition is already false.
//    This is different from a regular while loop, which would skip the loop entirely if the condition is false at the start.
//    This behavior makes do/while useful when you want to ensure something happens at least once, like showing a message or asking for user input.
    public static void main(String[] args) {

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);// this semicolon is important

    }
}
