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
        System.out.print(marian);
    }
}
