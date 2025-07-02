public class JavaStrings {
//    String is non primitive datatype but created in built
    // strings used to store block of text
    // we can comeback to the strings after some time
    // in references we we will comeback as string are very much used inside the java

    // code to find occurances of perticular string in another
    public static int printAllIndex(String data, String value){
        int count=0;
        if (!data.contains(value)){
            return 0;
        }
        int block=0;
        int currentLength=0;
        while (currentLength<data.length()){
            block=data.indexOf(value,block);

            if (block==-1){
                return count;
            }
            else {
                currentLength=block+1;
                block=currentLength;
                count++;
            }
        }
        return count;
    }

    public static int printAllIndex(String data, char value){
        int count=0;
        if (data.indexOf(value)==-1){
            return 0;
        }
        int block=0;
        while (block<data.length()){
            block=data.indexOf(value,block);

            if (block==-1){
                return count;
            }
            else {
                block=block+1;
                count++;
            }

        }
        return count;
    }


    public static void main(String[] args) {
        String abc="some string value said by samuaels";
        System.out.println(abc);
        System.out.println("length of abc : "+abc.length());
        // toUpperCase & toLowerCase can be used to change case of string literals
        System.out.println("JBVU bvjhaskaf".toLowerCase());
        System.out.println(abc.toUpperCase());

//        we can use indexOf function to find some character/string inside string
        System.out.println("index of string : "+abc.indexOf("string"));
        System.out.println("index of 'g' : "+abc.indexOf('g'));
        System.out.println(abc.indexOf("zzz")); // function will return index ==> -1 if not found

        String bcd="maybe now maybe later maybe never or maybe maybe someday";
//        will return first entry if present multiple times
        System.out.println(bcd.indexOf("maybe"));

//        we can start point
        System.out.println(bcd.indexOf("maybe",2));
//        System.out.println(bcd.indexOf("maybe",12,-1));// wrong index will throw error

        System.out.println(printAllIndex(bcd,"maybe"));
        System.out.println(printAllIndex(abc,'s'));


    }
}
