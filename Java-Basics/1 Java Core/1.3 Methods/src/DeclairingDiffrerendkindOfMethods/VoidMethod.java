package DeclairingDiffrerendkindOfMethods;
/** @author Marcin
 *  This application shows how to declare void method 
 **/
public class VoidMethod {
    public static void main(String []args){
        CountValue(); // to run the method we have to call method from the class that contains main method      
    } 
    /** void means that particular method doesn't return any value
     * it may or may not proceed through some algorithms
    **/        
        public static void CountValue(){ //this is method declaration             
            int value = 45 + 56;
            System.out.println("Print value " + value); // this is inside statement 
        }
        public static void Count(int b){ //this is method declaration             
            int value = 45 + 56;
            System.out.println("Print value " + value); // this is inside statement 
            return; // return statement can be included in void method but it can't return anything
//            return b; // not valid
            
        }

  
}
