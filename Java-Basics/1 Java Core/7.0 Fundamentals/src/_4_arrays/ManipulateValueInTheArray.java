package _4_arrays;

// created by Marcin many different ways to manipulate arrays
public class ManipulateValueInTheArray {
        public static void main(String args[]){

            int nums[] = {2,5,7,12,98};
            int empty[] = new int[6];
            
            nums[3] = nums[3] * 4;// how to change one or few elements of the array
            nums[0] = nums[3];
//          printArray(nums);
//            increaseArrayII(nums);
//            fillArray(empty);
            fillArrayII(empty);
        }        
        public static void printArray(int[]nums){ // thats how to pass array as an argument to the method
            for(int i: nums){
            System.out.println(i);
        }}
        public static void increaseArray(int[]nums){ // thats how to increase each element inf array 
            for(int i: nums){ 
                i++; // the way how each element is presented in this version
            System.out.println(i);
        }}
        public static void increaseArrayII(int[]nums){ // thats how to increase each element inf array
            for(int i = 0; i < nums.length; i++){
                nums[i]++; // the way how each element is presented in this version
            System.out.println(++nums[i]);
        }}
        public static void fillArray(int[]empty){ // thats how to fill empty array 
            for(int i = 0; i < empty.length; i++){
                empty[i]+= 34 * i; // the way how each element is presented in this version
            System.out.println(empty[i]);
        }}
        public static void fillArrayII(int[]empty){ // each for loop doesn't work this way
            for(int i : empty){
                empty[i] += 34 * i; // the way how each element is presented in this version
            System.out.println(empty[i]);
        }}
         

}

