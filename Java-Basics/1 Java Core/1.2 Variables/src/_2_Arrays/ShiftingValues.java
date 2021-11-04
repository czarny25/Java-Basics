package _2_Arrays;
import java.util.*;
/** created by Marcin 
 *  This code shows how to shift values in arrays 
 **/  
import javax.swing.JOptionPane;
public class ShiftingValues {
        public static void main(String args[]){

            int[]arrayOfNums = {1,2,3,4,5,6,7};
            int spacesToMove;
            int counter = 0;
     // Present array and ask how many times to shift       
            spacesToMove = Integer.parseInt(JOptionPane.showInputDialog(null,"Array before " + Arrays.toString(arrayOfNums)+ "\nHow many times do you want shift?"));
     // call method for given num of times       
        while(counter < spacesToMove){            
            ShiftValue(arrayOfNums,2);
            counter++;            
        }
            JOptionPane.showMessageDialog(null,"Array after " + Arrays.toString(arrayOfNums));
        }
    // create method for shifting values
    // method shift value just once    
        public static int[] ShiftValue(int[]arrayOfNums,int spaciesToMove){
            int first = arrayOfNums[0];
            for(int i = 0; i < arrayOfNums.length - 1;i++)
                arrayOfNums[i] = arrayOfNums[i + 1];
            
            arrayOfNums[arrayOfNums.length - 1] = first;
        return arrayOfNums;
        }

}

