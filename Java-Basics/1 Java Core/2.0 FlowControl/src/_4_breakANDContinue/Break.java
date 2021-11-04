package _4_breakANDContinue;

// The break keyword is used to stop the entire loop. The break keyword must 
// be used inside any loop or a switch statement.

// The break keyword will stop the execution of the innermost loop and start 
// executing the next line of code after the block.


public class Break {
   public static void main(String args[]){
      int [] numbers = {10, 20, 30, 40, 50};

      for(int x : numbers ){
         if( x == 40 ){
	    break;
         }
         System.out.print( x );
         System.out.print("\n");
      }
      System.out.print( "bye" );
   }
}

// break;