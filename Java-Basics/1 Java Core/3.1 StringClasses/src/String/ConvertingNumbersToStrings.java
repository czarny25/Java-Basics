package String;
/** @author Marcin
 *  This presents few ways to convert number into string
 **/
public class ConvertingNumbersToStrings {
    public static void main(String []args){
    
  // One simple way is to add empty string to any number
        
        String num1 = "" + 45;
        String num2 = "" + 4.56;
  
        String sum = num1 + " x " + num2;
        System.out.println(sum);


  // Another way is use toString() method
  // 
  //     METHOD VERY USEFULL IF WE HAVE RECIVE DATA INT VAR AND
  //     WE NEED TO TURN IT INTO STRING
  //           
        
        int i = 23;
        String s1 = Integer.toString(i);
        System.out.println(s1);
        
        float f = 2.656f;
        String s3 = Float.toString(f);
        System.out.println(s3);
        
        double d = 12.56;
        String s2 = Double.toString(d);
        System.out.println(s2);
 
     // Other way around is use parse() method
     // 
     //     METHOD VERY USEFULL IF WE HAVE RECIVE DATA String  AND
     //     WE NEED TO TURN IT INTO number(int or double)
     //        
        
       String tenString = "10";
      
       int result;
       double result1;
       
        //This will set result to 30
        result = 20 + Integer.parseInt(tenString); 
        System.out.println(result);
 
        result1 = 20 + Double.parseDouble(tenString); 
        System.out.println(result1);
        
        result1 = 20 + Float.parseFloat(tenString); 
        System.out.println(result1);
        
       
        //  This won't work since you can't add an integer and a string
        //  Integer result = 20 + tenString;
    
    
    
    
    
    
    
    
    }
}
