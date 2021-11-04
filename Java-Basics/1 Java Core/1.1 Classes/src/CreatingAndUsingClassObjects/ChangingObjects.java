package CreatingAndUsingClassObjects;

/** created by Marcin 
 *  This class explain the idea of object assigned to the pointer
 *  Using this class you can simply take object, change it and do this again and again
 **/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class ChangingObjects {
        public static void main(String args[]){

            
        // first we have to create object "file is good becouse we can change it easy
            File f2 = new File("hela.txt");            
            File f3 = f2;                   // now we point new varible to the object
                                            // they both point to one object
        
       // first read f2 to see what is inside    
            try{
                Scanner file  = new Scanner(f2);            
                while(file.hasNext()){ 
                    while(file.hasNext()){                 
                         System.out.print(file.next() + " "); 
                    }
                }System.out.println(); 
                }catch(Exception e){
                    System.out.print("File not found\n");
                    } 
           
        // here we atempt to change f3     
            try{   
                Formatter f = new Formatter(f3);
                f.format("%s%s%s", "tam ","jest ","ziuta\nNara");
                f.close();
            }catch(FileNotFoundException e){
             System.out.println("error");
            }
        
        // now lets see what has been changed    
                try{
                     Scanner file  = new Scanner(f2);            
                     while(file.hasNext()){ 
                         while(file.hasNext()){                 
                         System.out.print(file.next() + " "); 
                    }
                }System.out.println();
                }catch(Exception e){
                    System.out.print("File not found\n");
                    }
      /**
       *   The output is
       *        "to jest fredzik Nara 
       *         tam jest ziuta Nara"
       *   when one or many variables point to one object after changing only 
       *   one the rest will refer to this change
       */      
            
            

        }

}

