package numbers;
/** @author Marcin
 *  This application is about 
 **/
public class PrintingNumber {
    public static void main(String []args){
        
     
    // The best way to print numbers in our secify format is to use printf or 
    // format
        
        int num1 = 67823;
        double num2 = 6768723.89998709;
        float num3 = 2345453.3256f;
        
//        System.out.printf("%d \n  %.3f" ,num1,num2); // number 3 makes the num2 
                                                     // rounded to nearest thousand

        System.out.printf("%-2.2f\n" ,num2);
        System.out.printf("%2d\n" ,num1);
  }
}
