package _4_arrays;
// created by Marcin 
import java.util.Arrays;
import java.util.Scanner;
public class MultiDimmentsionalArray {  
        public static void main(String args[]){

//      two dimmensional array
          
            int[][]nums = new int [3][4]; // this is the way how we create it
            
            nums[0][0] = 2;
            nums[0][1] = 2;
            nums[0][2] = 2;
            nums[0][3] = 2;
            nums[1][0] = 2;
            nums[1][1] = 2;
            nums[1][2] = 2;
            nums[1][3] = 2;
            nums[2][0] = 2;
            nums[2][1] = 2;
            nums[2][2] = 2;
            nums[2][3] = 2;
            
                for(int i = 0; i  < nums.length;i++){
                    for(int j = 0; j < nums[i].length;j++){
                        System.out.print(nums[i][j] + " ");
                    }System.out.println();
                }
            System.out.println(Arrays.deepToString(nums)); // 
            
            
            
           
                    
        }

}

