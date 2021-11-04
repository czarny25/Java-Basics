package _1_if_ElseBranching;
import java.util.Scanner;

/** @author Marcin
 *  Nested if statement is about checking data against multiple conditions  
 **/
public class NestedIFStatement {
    public static void main(String []args){
    // take user input
        Scanner key = new Scanner(System.in);
        System.out.print("Please put your age: ");
        int age = key.nextInt();
    // manipulate data
        if(age > 18){

             if(age >= 22){
               
                   if(age >=60){
                       System.out.println("You are senior you pay \u20AC3");
                   }else{
                       System.out.println("You are an adult you pay \u20AC5");}
                   
              }else{     
              System.out.println("You are an student \u20AC4 ");}
     }else{     
     System.out.println("You are get in free"); }    
             
     // Generaly it is better to use Switch for that selection        
  }
}
