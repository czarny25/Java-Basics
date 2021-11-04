package _2_Arrays;

// created by Marcin 

import java.util.Arrays;
//import sun.security.util.Length;

public class SwitchingSingleElementsOfArrays {
        public static void main(String args[]){

            String[]names = {"rob", "hela","mila", "kala"};
            System.out.println(Arrays.toString(names));
            
            
            String memory = null;
            
            int len = names.length;
            
            System.out.println();
            memory = names[len - 1];
            names[len - 1] = names[0];
            names[0] = memory;
            
            System.out.print(Arrays.toString(names));


        }

}

