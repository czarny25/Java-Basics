package _2_Arrays;
// created by Marcin 
import java.util.Arrays;

public class PrintingArray {
        public static void main(String args[]){

                int nums[] = {4,8,6,9,3};
                
                System.out.println("This array contains: " + nums); // this is incorrect way to print an array 
                
                System.out.print("This array contains: " + Arrays.toString(nums)); // this is correct way to print an array
                                                                                   // but this way doesn't let you change 
                                                                                   // any value in the array                                 
                // to read and amend array use one of for loop
                

        }

}

