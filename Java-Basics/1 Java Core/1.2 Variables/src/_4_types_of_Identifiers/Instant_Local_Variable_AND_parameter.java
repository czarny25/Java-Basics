package _4_types_of_Identifiers;

// created by Marcin 
public class Instant_Local_Variable_AND_parameter {
        
        // these are instant varable which even if not initialized 
        // have initial value
        int num = 23; // non static instant variable of primitive type int with custom value 23
        int num2;     // non static instant variable of primitive type int with default value 0
        // these are static instant varible
        static char letter = 'q'; // static instant variable of primitive type char with custom value q 
        static boolean choice; // boolean instance variable are always "false" by default if not
                               // initialized
        
// 1) this is non static method thats returns nothing and takes no parameter    
    public void metoda11(){
            
            int x = 23;  // this is local variable x of type int initialized
            int c;       // this is local variable y of type int not initialized
            // local variable can be used only in the method that created them
            metoda12();  // this is method call to other method in this class
            //System.out.println(c + x); // here we can see that all local variables
                                       // must be initialzed becouse they dont have
                                       // initial value like instant variable has
        }
 // 2) this is static method thats returns nothing and takes no parameter   
     public static void metoda12(){
//           metoda11(); // static method cannot call non static method
//           System.out.println(num); // static method cannot use non static variables
     }
 // 3) this is static method thats returns int and takes int as a parameter
     public static int metoda13(int num){ // this is a parameter int in brackets
         num = 23;
     return 23;    
     }
        
     
     public static void main(String args[]){ //             
         
//         num = 23; // not valid
         
//         System.out.println(c + x);   // here you can see that local method cannot
                                        // be used outside method it was created in
             


        }

}

