package String;
/** @author Marcin
 *  This application shows basic strings 
 **/
public class StringConcatanaton {
    public static void main(String []args){
    // pseudocode

        String marian = "My name is Marian";    // String can one or many sentences
        String maria = "Maria";                 // or single word
        String number = "234";                  // or number
        String intMade = "" + 34;               // using this trick we can turn an int into the String#
        int num1 = 34;
        float num2 = 45.3f;
        
 /**
 * Concatantion id adding string int double and other primitives to each other to create one string.
 */  
        marian = marian + " " + num2 + maria + " " + intMade;
        System.out.println(marian);
    
        System.out.println(marian.concat(" " + maria)); // this method will concatanate two strings 
        										      // but both will say the same
        
        System.out.println(marian.concat(" " + maria).concat(" " + number).concat(" " + intMade)); // here is used in chain so it's concatanate   
	      																						 // as many strings as we want 
        																						 // but they still stays unchanged
    
        ConcatExample();
    
    }
    
    
    public static void ConcatExample(){
    	String s1 = "spring ";
    	String s2 = s1 + "summer ";
    	s1.concat("fall ");
    	s2.concat(s1);
    	s1 += "winter ";
    	System.out.println(s1 + " " + s2);
    
    
    }
}
