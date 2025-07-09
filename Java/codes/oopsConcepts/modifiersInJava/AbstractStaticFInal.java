package oopsConcepts.modifiersInJava;

// we going to learn about the static, final and abstract here
// btw final abstract and static all three are non access modifiers
public final class AbstractStaticFInal {
    public static void main(String[] args) {

//        final make something final
//        you can use file on attribute function class, you can t override final functions and cant extend final class
        //Applied to: classes, methods, variables.
        //Class: Cannot be subclassed.
        //Method: Cannot be overridden.
        //Variable: Value cannot be changed (constant).


        // abstract can be used on function and class level only
        // abstract is used to add contract on class level that function need to be implemented in subclasss
        // abstract and private cant be combined as abstract is contract so it need to be fullfilled
        //Cannot be combined with final, private, or static on methods.
//        ---> we will learn more about the abstract with abstraction and abstract classes


        // static as you know cant be added on class level, can be added on attribute and functions
        // static functionality and the attribute accessed from class level and shared between objects
        // static can be public private

    }

    // you can apply any access level on inner class
    class abc{};
    public class absbas{};
    protected class  ajsf{};
    private abstract class asfbka{};
    private static class ashdakf{};// static can be applied on nested class
}
