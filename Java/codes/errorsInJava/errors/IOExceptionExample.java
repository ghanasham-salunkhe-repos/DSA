package errorsInJava.errors;

import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
    //Caught IOException: nonexistentfile.txt (No such file or directory)
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("nonexistentfile.txt");
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}
