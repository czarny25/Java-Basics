package _5_ConditionalOperators;
/** @author Marcin
 *  This application is about conditions statement thats proceed only if one of
 *  conditions is true
 **/
public class ExclouseveOR {
    public static void main(String []args){
   
       boolean b1 = true;
       boolean b2 = false;
       
       if(b1 ^ b2)
           System.out.println("true");
       else           
           System.out.println("false");
               
       if(b1 ^ !b2)
           System.out.println("true"); // if both conditions are true 
       else                            // it produce false
           System.out.println("false");
               
  }
}
