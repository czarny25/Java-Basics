package _2_Arrays;
// created by Marcin 
import java.util.Arrays;
public class SortingArray {
        public static void main(String args[]){
            
            int[]nums = {1,5,4,3,9,8,4,1,2,5,45,25};
            char[]lett = {'d','r','w','t','a','g','r'};
           
            Arrays.sort(nums);
             Arrays.sort(lett);  
             
            System.out.println( Arrays.toString(nums));            
            System.out.print( Arrays.toString(lett)); 
        /**
         * Using this you may build sorting class to search through data 
         * by letter or number.
         */
        
        
        }

}

