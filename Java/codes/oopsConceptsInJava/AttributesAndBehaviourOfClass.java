package oopsConceptsInJava;

public class AttributesAndBehaviourOfClass {

    // this is inner class we will study about it afterwords
    // a static class can accessed inside static function


    public static void main(String[] args) {

        // we use constructor to create instance of class
        // as i make mis final that attribute must be passed while creating the object
        Student ghansham=new Student(111903033);

        // we have this dot operator which will be used by object of class to access attribute and functions
        ghansham.setFirstName("Ghansham");
        ghansham.setSurname("Salunkhe");
        ghansham.setBirthDate("17-01-2002");
        ghansham.setAge(23);
        // as mis is final we cant set it again it will throw error
//        ghansham.setMis(111903033);

        //lets print string
        // whenever you print a object toString function from that class gets called and passed into println function

//        we can validate class of object with instance of keyword
        System.out.println(ghansham);//Student{age=23, firstName='Ghansham', surname='Salunkhe', birthDate='17-01-2002', mis=111903033, collegeName=COEP}
        System.out.println(ghansham instanceof Student);//true instanceof is very usefull to validate the class

        // lets check adult condition
        // we're accessing function inside the class
        // non static function needs a object to access that function
        // while static functions can directly accessed on class level (unfortunatly they can access public functions or non static attribute)
        System.out.println(
                ghansham.isAdult()
        );


        // lets use instance of to check bently and car
        System.out.println(new BentleyCar() instanceof CarClass);// child class is instance is also instanceof parent class

        // parent class instance will not be instance of child class (isnt it obvious)
        System.out.println(new CarClass(1,2,true,1,1,"") instanceof BentleyCar);

        // static values are created on class level, it will be shared on object level
        Student student1=new Student(111903034);
        Student student2=new Student(111903035);

        // static object can directly accessed on class level
        Student.setCollegeDomain("coep.ac.in");
        System.out.println(Student.getCollegeDomain());//

        // im changing static data from class level
        student1.collegeDomain="coeptech.ac.in";
        System.out.println(student1.collegeDomain);
        System.out.println(student2.collegeDomain);// changed by student1 but also changed for student2
        // thats how static data will be shared
        // all non static attribute are completly related to that object instance only static will be shared

        //lets try to access static finction from student
        student1.myFunction();

        // same function can be access other way directly on class level
        Student.myFunction();
    }
}
