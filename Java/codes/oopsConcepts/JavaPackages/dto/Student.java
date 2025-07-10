package oopsConcepts.JavaPackages.dto;

// create a class with encapsulation
public class Student {

    // attributes of dto
    private String name;
    private int age;
    private long mis;
    private String branchName;

    @Override
    public String toString() {
        return STR."Student{name='\{name}', age=\{age}, mis=\{mis}, branchName='\{branchName}'}";
    }

    //lets create one all args constructor
    public Student(String name, int age, long mis, String branchName) {
        this.name   = name;
        this.age   = age;
        this.mis   = mis;
        this.branchName = branchName;
    }

    // getters and setters
    public long getMis() {
        return mis;
    }

    public void setMis(long mis) {
        this.mis = mis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}
