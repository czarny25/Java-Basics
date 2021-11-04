package SimpleTryCatchExceptions;

// created by Marcin 

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

// some cases we can deal whit one exception in a few ways

public class Declairing {
        public static void main(String args[]) throws FileNotFoundException{ // here method declaire that it will
                                                                             // use exception in this method  
                Scanner f = new Scanner(new File("zenekx.txt")); 
                JOptionPane.showMessageDialog(null,"Witaj zenek");

                
                
        }
} 


 class decalringII{               
        public static void main(String args[]){        
            
            
            try{
                Scanner f = new Scanner(new File("zenekx.txt"));
                JOptionPane.showMessageDialog(null,"Witaj zenek");
            }catch(FileNotFoundException e){
                JOptionPane.showMessageDialog(null,"Such file does not exists");
            }

        }

}

