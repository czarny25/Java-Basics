package _4_arrays;
import java.util.*;
/**
 * @author Marcin
 */
public class SwapValues {
        public static void main(String args[]){

            int[]nums = {1,2,3,4,5,6};
            System.out.println(Arrays.toString(nums));
            

        for(int i = 0; i < nums.length / 3; i++){      // here end usre decide what needs to be changed
//            System.out.println(
                    Arrays.toString(swap(nums,i,nums.length - 1 - i));
//                    );
        }
        System.out.println(Arrays.toString(nums));
        
        
        }
        public static int[] swap(int[]nums, int x,int y){           // this method swap two values value chosen by the end user
                 int temp = nums[x];
                 nums[x] = nums[y];
                 nums[y] = temp;        
            return nums;
        }
        
}
