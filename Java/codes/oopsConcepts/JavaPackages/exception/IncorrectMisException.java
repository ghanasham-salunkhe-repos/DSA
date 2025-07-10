package oopsConcepts.JavaPackages.exception;

// here extend is nothing but inheritance
// we will study about it in upcoming time
public class IncorrectMisException extends RuntimeException {

    // constructor and sending message to parent
    public IncorrectMisException(String message) {
        super(message);
    }
}
