package oldPackage;

import java.io.PrintStream;

/** @author Marcin
 *  This class is to be imported by the other 
 **/
public class ClassToBeImported1 {
    
    // Some constractor     
    public ClassToBeImported1(String name){
        System.out.format("I am constructor named %s%n",name);
    }
    // Some method    
    public static void MethodNum1(){
            System.out.println("I do nothing");           
            
        }
    // Some method
    public void MethodNum2(){
            System.out.println("I do nothing as well");
        }    
       



  
}
