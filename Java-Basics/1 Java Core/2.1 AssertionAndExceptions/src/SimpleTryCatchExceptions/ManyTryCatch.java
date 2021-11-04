package SimpleTryCatchExceptions;

// created by Marcin 
public class ManyTryCatch {
        public static void main(String args[]){

            try{
                if((24 / 2) == 12)throw new ArithmeticException("from try1 is printed");
//                System.out.println("from try is printed");
            }
            catch (ArithmeticException ex){
//                System.out.println("from try1 is printed");   
            }
             try{
                if((24 / 2) == 12)throw new ArithmeticException("from try2 is printed");
//                System.out.println("from try is printed");
            }catch (ArithmeticException ex){
//                System.out.println("from try2 is printed");
            }
//            try{
//                if((24 / 2) == 12)throw new ArithmeticException("from try3 is printed");
////                System.out.println("from try is printed");
//            }
//            catch (ArithmeticException ex){
//                System.out.println("from try3 is printed");
//            } 
            finally{
//                throw new ClassCastException("from finally is printed");
                System.out.println("from finally is printed");
            } 
             
             
             
        }
}

