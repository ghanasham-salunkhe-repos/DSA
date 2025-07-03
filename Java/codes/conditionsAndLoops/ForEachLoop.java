package conditionsAndLoops;

import java.util.Arrays;
import java.util.List;

public class ForEachLoop {

//    for each loop is exclusivly used to traverse the arrays
    // there are break statement is there to break loop on specific condition
    public static void main(String[] args) {

        List<String> listOfStrings= Arrays.asList("abc","efg","hij","klm","opq");

        for(String word:listOfStrings){
            if (word=="hij"){
                continue;// skip following code and go to next execution
                // print for hij will not happen
            }
            if (word=="klm"){
                break;
                // break directly broke loop and go out of bound of loop
            }
            System.out.println(word);

        }

//        due to break full loop will not execute
        /*
            abc
            efg
        */
    }
}
