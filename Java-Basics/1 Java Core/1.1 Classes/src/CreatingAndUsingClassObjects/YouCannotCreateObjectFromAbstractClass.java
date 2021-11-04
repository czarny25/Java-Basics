package CreatingAndUsingClassObjects;

// created by Marcin 

import java.util.Calendar;

public class YouCannotCreateObjectFromAbstractClass{
   
        public static void main(String args[]){

            
            Calendar day ; // -------- Calendar is an abstract class from API 
                                    // you can create object from abstract class   
           // day = new Calendar();// -- but you cannot initialised it
           // day.clone();
            
            
            Calendar d = null; 
            d.clone();            // this will produce runtime error  
            
            
            System.out.println(d.clone());  // this will produce runtime error
            

        }

}

