package _1_Primitives;
/** @author Marcin
 *  This application is about 
 **/
public class CastingPrimitives {
    public static void main(String []args){
    // pseudocode

        int num1 = -12; 
        byte num2 =  -127;
        byte sum = (byte) (num1 + num2); // casting byte to int 
        System.out.println(num2);
        System.out.println(sum);
        
        int num12 = 34;
        char let = (char)num12;
        System.out.println(let);
        
        for(int i = 0; i < 2343;i++){ // using for loop through an arry of char 
            char let1 = (char)i;
            System.out.print(let1);
        }
        
  }
}
