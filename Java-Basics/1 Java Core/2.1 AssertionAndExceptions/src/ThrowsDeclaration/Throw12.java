package ThrowsDeclaration;
import java.lang.Exception.*;
// created by Marcin 
public class Throw12 {
        public static void ziuta() { 
            throw new ArithmeticException();
        }
    
        public static void ziuta1() {              
            ziuta();           
        }    
        public static void main(String args[]){
           
            try{
            ziuta();
            }catch (ArithmeticException e){
                System.out.println("zlapane");
            }
            ziuta1();
            
            System.out.println("zlapane");
        }

}

