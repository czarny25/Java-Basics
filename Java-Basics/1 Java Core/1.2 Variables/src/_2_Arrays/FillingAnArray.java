package _2_Arrays;

// created by Marcin 

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

        

public class FillingAnArray {
        public static void main(String args[]){

            String[]address = new String[4];                // this method is a
            String word = "dupa",result = null;                    // part of class array
            result = Arrays.toString(address);              // in util package
            
            Arrays.fill(address, word);                     // takes one value
            result += "\n" + Arrays.toString(address);      // fill all array 
                                                            // whit it 
            JOptionPane.showMessageDialog(null, result);

            Arrays.fill(address, 0, 1, word);
            result += "\n" + Arrays.toString(address);      // takes one value
                                                            // and fill the specific 
            JOptionPane.showMessageDialog(null, result);    // range of array whit it
        
            String[]names = new String[4];
            System.out.println(Arrays.toString(fillMe(names)));
        
        }
        public static String[] fillMe(String[]names){
            Scanner console = new Scanner(System.in);       // this method fills
            for(int n = 0; n < names.length; n++){          // an existing array
                names[n] = console.next();                  // whit data provided
            }                                               // by end user
            return names;
        }
        

}

