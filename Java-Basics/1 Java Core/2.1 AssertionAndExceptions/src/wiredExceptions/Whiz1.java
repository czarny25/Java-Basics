package wiredExceptions;
// created by Marcin 
public class Whiz1 {    
        public static void main(String args[]){
            try{
                throw new ArithmeticException(); 
            }catch(Exception e){
            System.out.println("Exception 1 ");
            }finally{
                try{
                    new Whiz1().meth();
                }catch(Exception e){
                    System.out.print("Exception 2 ");
                }
            }
        }
        public void meth(){
            for(int x = 0; x<5; x++){
                int y = (int)5/x;
            }
        }
        

}

