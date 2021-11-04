package CreatingAndUsingClassObjects;
// created by Marcin 
// In this class I try to compare objects

import java.io.File;
import java.util.Scanner;
public class ComparingObjects {
        public static void main(String args[]){

       // here we create two diffrent objects of type Scanner            
            
            File f1 = new File("hela.txt");
            File f2 = new File("hela.txt");
            
            String word1 = new String("dupa");
            String word2 = new String("dupa");
            
            // two pointers are compared to each other
            if(f1 == f2){ 
                System.out.println("we are the same");
            }else{
                System.out.println("we are not");}
            // becouse they are point to diffrents objects "we are not" is printed
            
            
        // but if we use "equals()"?   
            if(f1.equals(f2)){
                System.out.println("we are the same");
            }else{
                System.out.println("we are not");}
            // becouse they compare contains of objects not the actual objects "we are the same" is printed
            
  // now check what happends if we do this to Strings      
          // two pointers are compared to each other
            if(word1 == word2){ 
                System.out.println("we are the same");
            }else{
                System.out.println("we are not");}
            // becouse they are point to diffrents objects "we are not" is printed
            
            
        // but if we use "equals()"?   
            if(word1.equals(word2)){
                System.out.println("we are the same");
            }else{
                System.out.println("we are not");}
            // becouse compare contains of objects is being compared not the actual objects "we are the same" is printed
            
        
        
        
        
        
        
        }

}

