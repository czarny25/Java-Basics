package Static_and_nonStatic_Variables;
/** @author Marcin
 *  This application is about 
 **/
public class BlockOfStatics {
    
	    private static String name;
		private static String marian;

		static{
	        int marian = 23;
	        String name;
	    }
	      
	   static String print(){
	        System.out.print(name + " " + marian);
	        return name;
	   }
	   
	   public static void main(String []args){
	       String s = name + print();
	   }
}
