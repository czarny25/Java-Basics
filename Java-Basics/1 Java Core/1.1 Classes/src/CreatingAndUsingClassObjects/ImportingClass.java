package CreatingAndUsingClassObjects;

// created by Marcin 

import java.util.Calendar; // this is import statement


import java.util.Calendar;
import java.util.Scanner;

public class ImportingClass {
        public static void main(String args[]){

            // When you want to invoke methods from any package (except java.lang) you have to
            // import it and create and initialize object and then you can use it to invoke method
            
            Scanner cons;                     // this is an object that has not been initialized
            Scanner key = new Scanner("");    // this object has been initialized   
            boolean l = key.hasNext();        // this is the method invoked from class Scanner using object "key"  
        //  boolean i = cons.hasNext();       // object "i" cannot invoke any methods until is uninitialised  
            System.out.println(l);
        }

}

