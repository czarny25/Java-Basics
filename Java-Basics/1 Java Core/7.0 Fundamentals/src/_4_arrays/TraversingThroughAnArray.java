package _4_arrays;
import java.util.Scanner;
/** @author Marcin
 *  This application shows how to print out every element of array
 **/
public class TraversingThroughAnArray {
    public static void main(String []args){
    
        // Take an array and print what it contains

        String[]names = {"rob", "hela","mila", "kala"};
        
        // one way
        for(int i = 0; i < names.length ;i++){
            String name = names[i];
            System.out.println(name);
        }
        // second way it is much quicker and more effient to use EACH FOR LOOP
        for(String i: names){
            System.out.println(i);
        }
                
  }
}
