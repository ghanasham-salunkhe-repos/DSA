package oopsConcepts.basicClassInformation;

public class Student{

    // properties inside class are known as attribute
    // any variables inside class are properties of class all object will have those properties
    private int age;
    private String firstName;
    private String surname;
    private String birthDate;
    private final long mis;
    public static String collegeDomain;

    // collegeName is final but we're already writing the value so no need to initialize via constructor
    // static value are created on class level it will be shared between all objects
    // static final are class level shared object whose value need to written in class level and cant be changed
    private static final String collegeName="COEP";


    public static String getCollegeDomain() {
        return collegeDomain;
    }

    public static void setCollegeDomain(String collegeDomain) {
        Student.collegeDomain = collegeDomain;
    }

    public String getCollegeName() {
        return collegeName;
    }

    // must need to pass in constructor
    public Student(long mis) {
        this.mis = mis;
    }


    // following are getters and setters
    // function used to get and set value to object
    // its always good idea to use setter instead of directly accessing attribute outside class
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public long getMis() {
        return mis;
    }

    @Override
    public String toString() {
        return STR."Student{age=\{age}, firstName='\{firstName}', surname='\{surname}', birthDate='\{birthDate}', mis=\{mis}, collegeName=COEP}";
    }

    // behaviour is methods inside the class
    // lets try to access the value and check is adult or not
    public boolean isAdult(){
        return age >=18;
    }

    public static void myFunction(){
        System.out.println("college domain : "+collegeDomain);
        System.out.println("college name : "+collegeName);


        // i cant access non static attributes in static function
//        System.out.println(age);// error : java: non-static variable age cannot be referenced from a static context
    }
}