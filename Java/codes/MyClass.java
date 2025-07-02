class MyClass {
    public static void main(String[] args) {
        System.out.println("hello world!");// println -> new line inserted at the end of data
        System.out.println(10+1939*73);
        for(String abc : args){
            System.out.println(abc);
        }

        // "" --> string; ''-> character
        System.out.print("|0abc4"); // print -> no start at new line
        System.out.print("|1abc5");
        System.out.print("|2abc6");
        System.out.print("|3abc7\n");

        System.out.println(10); // number print
        System.out.println(11+23);// mathematical operation
        System.out.println("24"+23);// string concatenation

        // single comment example

        /*
        * multiline
        * comment
        * example
        * */
    }
}