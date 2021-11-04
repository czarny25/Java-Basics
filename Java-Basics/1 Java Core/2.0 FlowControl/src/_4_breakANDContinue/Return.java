package _4_breakANDContinue;

// created by Marcin 
public class Return {
        public static void main(String args[]){

             int fee;
            System.out.println( age(34));
            printName();

        }

        public static int age(int a){
            int fee;                        
            if(a < 19) 
                fee = 3;
            if(a < 56)
                fee = 5;
            else
                fee = 4;
                         
                return fee;    // there can be only one return statement for one method

        }
        
        // return may be used like that - I don't know what for
        public static void printName(){
        	String name = "hela";
        	return;
        }
}

