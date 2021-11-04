package _1_if_ElseBranching;

import java.util.Scanner;

/**
 * @author Marcin
 * This code shows an IF statement that will make only one choice
 */
public class if_then_else {
	
        public static void main(String []args){
    // take user input
        Scanner key = new Scanner(System.in);
        System.out.print("Please put your age: ");
        int age = key.nextInt();
    // manipulate data
        if(age < 16){
            System.out.println("You are still kid");
        }else if(age >= 16 && age <= 21){
            System.out.println("You are an adult");
        }else{
            System.out.println("You are old");
        }
   
        
  }     
}
