package CreatingAndUsingClassObjects;

/** created by Marcin 
 *  In this code I show how String object are different to class objects 
 *  by being immutable "unchangeable" 
 */
public class ChangingStringObjects {
        public static void main(String args[]){

               String word1 = new String("auto");
               String word2 = word1; // now a copy of String "auto" has been
                                     // created 

            // check whats inside
               System.out.println(word1);
               System.out.println(word2);
            // change word2;
               word2 = "lala";  // whatever we do to word2 only its String change
            // check whats inside now
               System.out.println(word1);
               System.out.println(word2);
        
   /*
    *  It's work diffrent way than with objects becouse with string 
    *  each reference create it's own object
    */
           
        
        }

}

