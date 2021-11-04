package CreatingAndUsingClassObjects;

import java.util.Scanner;

/** @author Marcin
 *  This application is about 
 **/
public class Object_of_class_object {
    public static void main(String []args){
    // pseudocode
        
        // using object you can create a object from any other class
        
            Object y = new String();  // 
            Object rf = new int [4];
            Object f = new Scanner(System.in);
            rf = (Scanner) new Scanner(System.in) ;
            Scanner key;
            key = new Scanner(System.in);
            f = key.next();
            
            System.out.println(f);
  }
}
