package basics;

public class VariablesInJava {
    /*
    * The general rules for naming variables are:
        Names can contain letters, digits, underscores, and dollar signs
        Names must begin with a letter
        Names should start with a lowercase letter, and cannot contain whitespace
        Names can also begin with $ and _
        Names are case-sensitive ("myVar" and "myvar" are different variables)
        Reserved words (like Java keywords, such as int or boolean) cannot be used as names
* */


//    lets create the java main function here
    public static void main(String[] arguments){

//        variable is nothing but container for the datatype
        /*
        string ==> ""
        char ==> ''
        * */

//        java variable name are unique ==> identifier
//        it makes your code more reading friendly if you give appropiate naming to variables
        int a=10;
        double b=10.3;
        long c=123l;
        float f=23.344f;
        char cc='c';
        char num='1';
        boolean flag=true;
        String string="String";

//        var is container not attched to specific type
        var aaa=133;
//        aaa="ksfjks";  var automatically determine type but then variable data type cant be changed
        var bbb=133.4;
        var ccc=21.3423F;
        var longNUmber=1242523535L;

//        String is set of characters
//        you can directly use foreach directly on string
//        while you can use to charArray function to create a array of characters from string
        for(char cccc: string.substring(0,1).toCharArray()){
            System.out.println(cccc);
        }

//        you can use int typecast to get asci code
        System.out.println((int)num);
        System.out.println("asci for a : "+ (int)'a');
        System.out.println("asci for z : "+ (int)'z');
        System.out.println("asci for A : "+ (int)'A');
        System.out.println("asci for Z : "+ (int)'Z');

//        ascii for numbers
        System.out.println("asci for 0 : "+ (int)'0');
        System.out.println("asci for 9 : "+ (int)'9');

//        opposite of this also can be doable by passing number to char we can get char from ascii
        System.out.println((char)90);
        for (int i = 0; i < 128; i++) {
            System.out.printf("character for ascii code %d : %s\n",i,(char)i);
        }

        // if some variables value you want to make constant use final
        final double pie=(double) 22/7;
        // final variable cant be reassigned value if does, will throw error
//        pie=23;

//        you can declare multiple varibles at once
//        multiple variable declarations in single line
        int blah=10, grs=111, banty=233, anway=132;
//        assign single value to multiple variable of same type at once
        blah=grs=banty=anway=1;

        // meaningful variable name increase code maintainability
//        say we're explaining a employee
        System.out.println("|====================| Employee |====================|\n");

        int employeeId=1234;
        String employeeName="ghansham";
        Double employeeSalary=99459.78;
        boolean isEmployeeRetired=false;
        String employeeDepartment="GSCI-GBTO-XRM-CCR";

        System.out.println("\t\tid : "+employeeId);
        System.out.println("\t\tname : "+employeeName);
        System.out.println("\t\tdepartment : "+employeeDepartment);
        System.out.println("\t\tsalary : "+employeeSalary);
        System.out.println("\t\tisRetired : "+isEmployeeRetired);
        System.out.println();
        System.out.println("|====================================================|");

    }


}