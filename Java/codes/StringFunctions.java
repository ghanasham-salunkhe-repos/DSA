import java.util.Arrays;

public class StringFunctions {

    // there are alot of function present for string we will go one by one
    public static void main(String[] args) {

        String abc="abcdef";

        System.out.println(abc.charAt(5));// get character at perticular index inside string
        System.out.println(abc.charAt(abc.length()-1));// last character
//        System.out.println(abc.charAt(1000));// will throw error for invalid value
//        System.out.println(abc.charAt(-1));// IndexOutOfBoundsException exception

//        you can use codePointAt to get ascii code for perticular index
        System.out.println(abc.codePointAt(1));//'a'==> 97
//        System.out.println(abc.codePointAt(111));// IndexOutOfBoundsException for wrong entries
        System.out.println((int)abc.charAt(1));// another way to do same
//        to get ascii for previous character
        System.out.println(abc.codePointBefore(2));// for 2 will point to index 1
//        abc.codePoints().forEach(System.out::println); codepoints give stream of ascii codes

//        compare to function used to compare two string return 0 if match
        // compareto needs case to be same
//    if word 1 has more character then value >0 else <0
        System.out.println("abc".compareTo("abc")); // 0
        System.out.println("abcdef".compareTo("abc")); // 3 more characters
        System.out.println("abc".compareTo("abcdef")); // 3 less characters
        System.out.println("abc".compareTo("ABC")); //32 ascii code will come to picture()
        // ascii of a > A
        System.out.println("ABC".compareTo("abc"));//-32

//        we similarly have comparetoignorecase which will ignore case used to  compare lexicographically
        System.out.println("ABC".compareToIgnoreCase("abc"));//0
        System.out.println("abc".compareToIgnoreCase("ABC"));//0

        // we can use equals to get true or false op
        System.out.println("abc".equals("abc"));//true
        System.out.println("abc".equals("asfsaf"));//false
        System.out.println("abc".equals("ABC"));//false
        // we have case ignore equals checker
        System.out.println("abc".equalsIgnoreCase("ABC"));//true

        // contains and concat
        System.out.println("abc".concat("bcd"));// do string concatenation (a+b for string)
        System.out.println("abcdef".contains("abc"));// return true or false : true
        System.out.println("abcdef".contains("sda"));//  false

//        contentEquals check strings are exactly smae or not return value in true or false
        System.out.println("abc".contentEquals("abc")); //true
        System.out.println("abc".contentEquals("a")); //false should be exact same sequence
        System.out.println("abcdef".contentEquals("bcd"));//false
        System.out.println("abcdef".contentEquals("abc")); //false

//        copyValueOf used to create substring from entire string
        String blah="abcdefghijklmnopqrstuvwxyz";
        String op="";
        System.out.println(op.copyValueOf(blah.toCharArray())); // copy entire string
        System.out.println(op.copyValueOf(blah.toCharArray(),1,4));// can be used to create substrings

//        better function is there substring functions more dynamic & easy to use
        String opp=blah.substring(2,5);// first index i inclusive and last is exclusive
        // we have subsequence function to do same work
        System.out.println("asfam  akbfsksaf jkansf".subSequence(1,12));//sfam  akbfs
        System.out.println(opp);

        // endwith used to check a string is ending with some string return true or false
        System.out.println(blah.endsWith("wxyz"));
        // similar start with function is also there & also we can provide start index
        System.out.println(blah.startsWith("abcd"));
        System.out.println(blah.startsWith("efgh",4));// start index is inclusive

        System.out.println(blah.toCharArray());// convert string into chararray
//        similar getChars function is also there not much useful
        for (int i = 0; i < 4; i++) {
            System.out.println(blah.getBytes()[i]);// basically convert string into unicodes
        }// convert into bytearry

        System.out.println(blah.hashCode());// hashocode return hashcode of string
//        The hash code for a String object is computed like this:
//        s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]

        System.out.println(blah.indexOf("ghi"));// indexof function returns the index inside the string
        System.out.println("abcabc".lastIndexOf("abc"));// 3// lastIndexOf give last occurance of some string return -1
        System.out.println("abc".lastIndexOf("dsada"));// -1
        System.out.println("".isBlank());//is blank check for is string is blank
        System.out.println("".isEmpty());//isempty check is string empty : widely used

//        join function used to join multiple strings
        System.out.println(String.join("abc","def","ghi"));//

//        replace and replaceAll functions are there to replace values inside string

//        replace: Replaces all occurrences of a character or a CharSequence (literal string) with another character or CharSequence. It does not use regular expressions.
//        replaceAll: Replaces each substring that matches a given regular expression with the given replacement. It uses regex patterns.
//        both replace and replaceALl replace all positions whenever possible
        System.out.println("abcdabcd".replace('a','z'));// replace used to replace a character with z
        System.out.println("abcdabcd".replace("ab","xy"));// we can use string to replace too
        System.out.println("abcdefghiabcdefghi".replaceAll("abcd","wxyz"));// replace all is used as regex
        System.out.println("abcdefghiabcdefghi".replaceFirst("abcd","wxyz"));// just replace first instance

//        split function is used to split string on some value
        // split function also regex based so you can use regular expression to do the spliting
        String data="abc def ghi jkl mno";
        for (String string : data.split(" ")) {
            System.out.println(string);
        }

//        we have trim function to remove whitespace  at start and end
        System.out.println("        safs sdgsadg sgdd sgd   |".trim());//
        System.out.println(" aasdsa     ");
    }
}
