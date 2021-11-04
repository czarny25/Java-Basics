package _3_LoopsAndIterators;

// created by Marcin this class shows how to use each-for loop to traverse through array

public class EnchancedFor {
        public static void main(String args[]){

            char[]name 		= {'j','o','s','i','f'};
            int[]numbers 	= {1,8,5,6,8};
            
            String[]names = {"ala","nana","mina"}; 
	            for (int i : numbers) {         // array of ints
	                System.out.println(i);
	            }
	            for (String i : names) {        // array of strings
	                System.out.println(i);
	            }
	            for (char i : name) {           // array of chars
	                System.out.println(i);
	            }
        }

}

