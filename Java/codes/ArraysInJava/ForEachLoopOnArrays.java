package ArraysInJava;

class Person {
    String name;
    Person(String name) { this.name = name; }

    @Override
    public String toString() {
        return "{ "+name+" }";
    }
}

public class ForEachLoopOnArrays {

    public static void main(String[] args) {


        Person[] people = { new Person("Alice"), new Person("Bob") };

// Modifying internal state (works)
        for (Person p : people) {
            p.name = "name is changed";
        }
        System.out.println(people[0]);

// Assigning new object (does NOT change array)
        for (Person p : people) {
            p = new Person("New"); // This does not update the array
        }
        System.out.println(people[0]);
    }
}
