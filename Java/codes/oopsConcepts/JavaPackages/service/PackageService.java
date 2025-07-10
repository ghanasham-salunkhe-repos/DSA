package oopsConcepts.JavaPackages.service;

import oopsConcepts.JavaPackages.dto.Student;
import oopsConcepts.JavaPackages.exception.IncorrectMisException;

// here we're importing class
import java.util.Arrays;
import java.util.List;

public class PackageService {
    public static void process(String[] args) {
        List<Student> students = getStudents();

        for (Student student : students) {
            System.out.println(student);
            if (student.getBranchName().equals("CE")) {
                throw new IncorrectMisException("invalid branch name");
            }
        }
    }

    private static List<Student> getStudents() {
        return Arrays.asList(
                new Student("vijay",21,111903034,"CS"),
                new Student("rutvik",22,111903035,"EE"),
                new Student("ghansham",23,111903033,"ENTC"),
                new Student("vishal",24,111903036,"CE")
                );
    };
}
