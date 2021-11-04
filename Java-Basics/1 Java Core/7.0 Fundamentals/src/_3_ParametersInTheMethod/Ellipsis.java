package _3_ParametersInTheMethod;
import java.util.*;
/** created by Marcin
 *  Ellipsis "..." are the way to make method able to take as many parameter of 
 *  as the same type user wants 
 */
public class Ellipsis {
        public static void main(String ... args){
            Scanner keyboard = new Scanner(System.in);
            System.out.println("enter the new word");
//            String word = ""; 
            
        	String [] words = new String[3];
        	for(String word: words){
        		System.out.println("enter the new word");
        		word = keyboard.next();
        	}
        	
            System.out.println(Arrays.toString( flexiMethod1(words)));  
        }
        public static String[] flexiMethod1(String ... words){ // here method takes as meny paramether as
//            String word = null;                              // it wants , it can't change type
            return words;
        }
        public static int flexiMethod3(String ... words){
            int num = 34;
            return num;
        }
        public static void flexiMethod2(String...words){
            System.out.println("words");
        }
        
}

