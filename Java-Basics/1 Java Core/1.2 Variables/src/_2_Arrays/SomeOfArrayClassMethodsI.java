package _2_Arrays;

// created by Marcin 

import java.util.Arrays;

public class SomeOfArrayClassMethodsI {
        public static void main(String args[]){

            int[]arra = {4,8,6,9,2,5};

            int[]newArra = Arrays.copyOf(arra, 2 * arra.length); // create twice biger array
            
             String ar = ("Old array - " + Arrays.toString(newArra));
             System.out.print(ar);
           
        }

}

