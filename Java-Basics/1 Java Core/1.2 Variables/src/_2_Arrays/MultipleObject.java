package _2_Arrays;
import java.util.*;
/**
 * @author Marcin
 */
public class MultipleObject {
        public static void main(String args[]){

            String[]a = {"a","b","c","d"};         // array type string whit an object {"a","b","c","d"}

            String[]b = a;                         // now the same object "a","b","c","d" has two references a and b
         
            String[]e = null;
            
            System.out.println(Arrays.toString((e)));
            
            String c = "ala";
            
            String d = c;
            
            String f;
            
            System.out.println(d);
        }
}
