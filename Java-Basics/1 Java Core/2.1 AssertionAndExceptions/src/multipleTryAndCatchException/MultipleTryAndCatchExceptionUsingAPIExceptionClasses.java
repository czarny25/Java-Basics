package multipleTryAndCatchException;

// created by Marcin 

import java.util.IllegalFormatConversionException;
import java.util.Scanner;

public class MultipleTryAndCatchExceptionUsingAPIExceptionClasses {
        public static void main(String args[]){

            // Create scanner object for inputing values   
            Scanner cons = new Scanner(System.in);
            System.out.println("How many boxes do we have");
            
//        // open try catch block
//            try{
                // provide data for processing
                double numOfBoxes = cons.nextDouble();
                // first condition handled with custom constractor
                if(numOfBoxes < 0) ;
//                    throw new IllegalFormatConversionException(); 
                
                // second condition handled with custom constractor object which takes argumeter
//                if(numOfBoxes > 10000)throw new MyOwnException2(numOfBoxes);
                // third condition handled with custom constractor object which takes argumeter
//                if(((numOfBoxes * 10) % 10) != 0) throw new MyOwnException1(numOfBoxes);
                
                System.out.printf("We have %d boxes\n",numOfBoxes);  
                
//            } 
//            // here we catch the exception and handle the error
//            catch (IllegalFormatConversionException e){;}
//            // here we catch the exception and handle the error 
//            catch (MyOwnException2 e){;}



        }

}

