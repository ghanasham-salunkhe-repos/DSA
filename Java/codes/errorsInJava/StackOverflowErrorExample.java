package errorsInJava;

//Definition: Errors represent serious issues that applications should not try to catch
// or handle. They are typically related to the environment in which the application is running.

//Superclass: All errors inherit from the Error class.

//Examples:
//OutOfMemoryError: Occurs when the JVM runs out of memory.
//StackOverflowError: Happens when the stack limit is exceeded, often due to deep or infinite recursion.
//NoClassDefFoundError: Thrown when a class definition is not found at runtime.

// some of the errors can be handled by compiler but not all
// OutOfMemoryError or StackOverflowError are similar
public class StackOverflowErrorExample {
    public static void main(String[] args) {
        recursiveFunction();
    }

    public static void recursiveFunction() {
        // Infinite recursion causes StackOverflowError
        recursiveFunction();
        ///usr/lib/jvm/default-java/bin/java --enable-preview -javaagent:/opt/intellij/lib/idea_rt.jar=33775 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /home/ghansham-rajaram-salunkhe/DSA/Java/codes/out/production/codes errorsInJava.StackOverflowErrorExample
        //Exception in thread "main" java.lang.StackOverflowError
        //	at errorsInJava.StackOverflowErrorExample.recursiveFunction(StackOverflowErrorExample.java:21)
        //	at errorsInJava.StackOverflowErrorExample.recursiveFunction(StackOverflowErrorExample.java:21)
        //	at errorsInJava.StackOverflowErrorExample.recursiveFunction(StackOverflowErrorExample.java:21)
        //	at errorsInJava.StackOverflowErrorExample.recursiveFunction(StackOverflowErrorExample.java:21)
        //	at errorsInJava.StackOverflowErrorExample.recursiveFunction(StackOverflowErrorExample.java:21)
        //	at errorsInJava.StackOverflowErrorExample.recursiveFunction(StackOverflowErrorExample.java:21)
        //	at errorsInJava.StackOverflowErrorExample.recursiveFunction(StackOverflowErrorExample.java:21)
        //	at errorsInJava.StackOverflowErrorExample.recursiveFunction(StackOverflowErrorExample.java:21)
    }
}

