package _6_1_SimpleTryCatchExceptions;
// created by Marcin 
import java.util.Scanner;

public class ExceptionInLoops {
        public static void main(String args[]){

        int num1 = 0;   
        int num2 = 0;                
               do{  
                    try{
                        Scanner key = new Scanner(System.in);
                        System.out.println("Put first num ");
                        num1 = key.nextInt();   
                        System.out.print("Put second num ");
                        num2 = key.nextInt(); 
                        System.out.println("a / b = " + num1 / num2);
                        
                    }catch(Exception e){                
                        System.out.println("Do not divide by zero ");
                    }
               }while(num2 == 0); 

        }

}

