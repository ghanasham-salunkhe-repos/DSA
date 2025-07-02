package org.example;

public class NewJavaClass {

    private static void abc(int value){
        System.out.println(value);
    }

    private static void abc(String value){
        System.out.println(value);
    }

    public static void main(String[] args){
        System.out.println("hello world!!");

//        lets create some lists
        String[] strings= new String[5];

        for (int i = 0; i < strings.length; i++) {
            strings[i]=i+"abc"+(i+1);
        }

        for (String word:strings) {
            System.out.println(word);
        }
        // two overloaded functions
        abc(10);
        abc("ghansham");

        // lets send data inside the args and paste it
        for (String word1:args){
            System.out.println(word1);
        }

        System.out.println("end");
    }
}
