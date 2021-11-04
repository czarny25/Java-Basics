package wiredExceptions;

// created by Marcin 
public class Test {
    public static void main(String[] args) {
        try {
            System.out.println(args[0]); 
            

        } finally {
            try{
            	
            }catch(Exception e){
            	System.out.println("An Exception was catch");
            }
        System.out.println("Out of Main");
        }
    }
}

