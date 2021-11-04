package Static_and_nonStatic_Variables;
/**
 * @author Marcin
 * Instance Variables (Non-Static Fields) Technically speaking, objects store their individual states in "non-static fields", that is,
 * fields declared without the static keyword. Non-static fields are also known as instance variables because their values are 
 * unique to each instance of a class (to each object, in other words); the currentSpeed of one bicycle is independent from the
 * currentSpeed of another.
 */
public class NonStatic {

    public NonStatic(int f) { // constructor
        this .fred += NUMOF;
        System.out.printf("Print me %d",fred);    }  
    
            public static final int NUMOF = 12;//constatnc variable
        
            int fred = 23; // non static or instant variable 
            static int mania; // static variable
    
        public static void main(String args[]){
            int numOfhelas = 0; // local variable numOfhelas
            hela(mania);
            hela(numOfhelas);
            NonStatic n = new NonStatic(NUMOF);
            
        }
        public static void hela(int helas){    //  static method        
            int marian = 33; // local variable marian
            marian += NUMOF;
          //  NUMOF += marian; // constant variable cannot be changed
            System.out.printf("Print me %d\n",marian);}
        
        double tellMe(int NUMOF){ // non static method
            return fred += NUMOF;}
       
}
