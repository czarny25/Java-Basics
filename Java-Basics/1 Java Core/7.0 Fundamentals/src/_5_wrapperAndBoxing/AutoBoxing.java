package _5_wrapperAndBoxing;

// created by Marcin 
public class AutoBoxing {
    
        public static void main(String args[]){

            char letter = 'a';
            Character let = letter; // boxing
 
            char l = let;			// unboxing
        
            Integer[]in  =  {4 , 45, 67 };
        
        System.out.println();
        
        
        Integer y = new Integer(567); 			// make it
        int x = y.intValue(); 					// unwrap it
        x++; 									// use it
        y = new Integer(x); 					// re-wrap it
        System.out.println("y = " + y); 		// print it
        
		}

}

