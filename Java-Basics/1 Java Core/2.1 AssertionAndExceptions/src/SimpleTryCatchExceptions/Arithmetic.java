package SimpleTryCatchExceptions;
// created by Marcin 
public class Arithmetic {
        public static void main(String args[]){
            int a = 23;
            int b = 0;
                    try{ // here I open try block everything that's inside will be tested for error
                        if(b == 0)throw new myBadException(); // now I throw exception prepered in diffrent class
                            System.out.println("a / b = " + a / b);
                    }catch(myBadException e){                

                    }            

        }

}

