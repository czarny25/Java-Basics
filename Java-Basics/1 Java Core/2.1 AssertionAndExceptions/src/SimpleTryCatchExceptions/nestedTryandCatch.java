package SimpleTryCatchExceptions;

/** created by Marcin
 * 
 */ 
public class nestedTryandCatch {
        public static void main(String args[]){

            try{
                if((24 / 12) == 12)throw new ArithmeticException("from try 1 is printed");
                
                    try{
                        if((24 / 2) == 12)throw new ArithmeticException ("from try 2 is printed");
                      
                            try{
                                if((24 / 2) == 12)throw new ArithmeticException ("from try 3 is printed");
                        
                            }
                            catch (ArithmeticException ex){
                                System.out.println("from try3 is printed");
                            }
                        
                    }catch (ArithmeticException ex){
                        System.out.println("from try2 is printed");
                    }
                
            }catch (ArithmeticException e){
                System.out.println("from try1 is printed");
            }    

        }

}

