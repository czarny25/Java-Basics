package _4_arrays;

// created by Marcin 
public class BuildingAnArray {
        public static void main(String args[]){

            int[]data = buildArray(6);
            printArray(data);
               
        }
     // this method build an array   
        public static int[] buildArray(int length){
            int[]data = new int[length];
            for(int i = 0; i < data.length; i++){
                data[i] = 10 * i;
            }            
        return data;           
        }
        
     // this method print newly build array   
        public static void printArray(int[]nums){ // thats how to pass array as an argument to the method
            for(int i: nums){
            System.out.println(i);
        }}

}

