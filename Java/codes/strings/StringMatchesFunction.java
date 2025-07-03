package strings;

//::TODO : also refer replaceAll function
public class StringMatchesFunction {

    public static void main(String[] args) {

//        we use matches function inbuil in string to check the string is following regex or not
//        matches function will return the output in true or false flag
        /*
        Regular expression symbols:
        1) . (dot) --> any single character will match
        2) [abc] --> square braces and or anything character inside square braces we will have match
        3) [abc][ed] --> first character should present in first set and second should come from second set and so on
        4) [^abc] : its negation for case 2 and 3 if value is present then return false if not present then true
        5) [a-zA-z] : set with range you can ue ^ to negate this
        6) A|B : | is used as or so A or B (|)==> pipe
        7) ABC : exact ABC should match
         */

        //Case 1)  any single symbol will match with dot
        System.out.println("g".matches("."));//true
        System.out.println("1".matches("."));//true
        System.out.println("\\".matches("."));//true
        System.out.println("/".matches("."));//true
        System.out.println("\\".matches("."));//true
        System.out.println("\"".matches("."));//true

        System.out.println("--------------------------------------------------------------------");
        //Case 2) any symbol inside braces will have match
        String regex="[abcd'\"]";
        System.out.println("a".matches(regex));// true
        System.out.println("\'".matches(regex));//true
        System.out.println("'".matches(regex));//true
        System.out.println("z".matches(regex));//false as z is not part of
        System.out.println("x".matches(regex));//false

        System.out.println("--------------------------------------------------------------------");
        //Case 3) multiple character match within set
        regex="[abc][grs]";
        System.out.println("ag".matches(regex));// true only if both character match provided sets
        System.out.println("al".matches(regex));// false if any set is violated its false
        System.out.println("xg".matches(regex));// false if any set is violated its false

        regex="[a][efg][hi]";// we can provide any number of set of characters
        System.out.println("aeh".matches(regex));//true
        System.out.println("afi".matches(regex));//true

        System.out.println("--------------------------------------------------------------------");
        //Case 4) negation of set
        regex="[^abc]";// not in a or b or c
        System.out.println("a".matches(regex));//false
        System.out.println("x".matches(regex));//true

        System.out.println("--------------------------------------------------------------------");

//        this negation can be applied for multiple characters
        regex="[^abcdefhijklmnopqrstuvwxyz][^abcdefghijklmnopqstuvwxyz][^abcdefghijklmnopqrtuvwxyz]";
        System.out.println("grs".matches(regex));// true for grs only for rest all false
        System.out.println("cat".matches(regex));//false
        System.out.println("zxu".matches(regex));//false

        System.out.println("---------------------------------------------------------------------");
        //Case 5) regex set with range
        regex="[a-zA-Z]"; // ascii code 65 to 122 will be covered
        System.out.println("x".matches(regex));//true
        System.out.println("X".matches(regex));//true
        System.out.println("0".matches(regex));//false

        System.out.println("---------------------------------------------------------------------");
        // using not on range
        regex="[^a-zA-Z]";
        System.out.println("x".matches(regex));//false
        System.out.println("0".matches(regex));//true

//     simplifythis   regex="[^abcdefhijklmnopqrstuvwxyz][^abcdefghijklmnopqstuvwxyz][^abcdefghijklmnopqrtuvwxyz]";
    // range make regex simple and also easily
        // negation is used widely too
        regex="[^a-fh-z][^a-qs-z][^a-ru-z]";
        System.out.println("grs".matches(regex));//true
        System.out.println("sdd".matches(regex));//false

        System.out.println("---------------------------------------------------------------------");
        //Case 6) Or (|) in regex means this or that
        regex="G|R";//==> just like [GR]
        System.out.println("H".matches(regex));//false
        System.out.println("R".matches(regex));//true
        System.out.println("G".matches(regex));//true

        System.out.println("---------------------------------------------------------------------");
        //Case 7 : exact match
        regex="GRS";
        System.out.println("GRS".matches(regex));//true
        System.out.println("sfsdf".matches(regex));//false

        // multiple dots mean any 3 character symbol
        System.out.println("abc".matches("..."));// true as we have ...
        System.out.println("a c".matches("..."));//true : as space is also ascii

        // so for regex with starting grs
        regex="gr[a-z]";//regex for 3 digit word starting with gr

        System.out.println("grs".matches(regex));//true

    }
}
