package _1_if_ElseBranching;
import java.util.Scanner;
/** @author Marcin
 *  This class present an IF statement that picks more than one answer 
 **/
public class IfWhitMoreThanOneAnsw {
    public static void main(String []args){
    // take user input
        Scanner key = new Scanner(System.in);
        System.out.print("Please put your age: ");
        int data = key.nextInt();
    // manipulate data
        if(data < 16)
            System.out.println("You are still kid");
        if(data >= 16 && data > 16)
            System.out.println("You can get driving license");
        if(data >= 18 && data > 16)
            System.out.println("You can get married");
        if(data >= 21 && data > 16)
            System.out.println("You can vote");
        if(data >= 35 && data > 16)
            System.out.println("You are middle age");
        
  }
}
