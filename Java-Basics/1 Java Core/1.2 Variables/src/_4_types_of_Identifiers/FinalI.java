package _4_types_of_Identifiers;

// created by Marcin 
public class FinalI {
    
        /**
         * keyword "final" means that something that was marked final 
         * cannot be changed
         */
         
        final static int NUMEREK = 23; // this is final instant variable which will 
                                // stay forever with value of 23;
        static final String SLOWA = "dupa"; // final can be static 
    
        
        public static void main(String args[]){
            System.out.println(SLOWA);
            Man(NUMEREK);
        }
    // here is final method that takes final parameter   
        public static final void Man(final int n){
        final int w = 45;
//        n = w; // you cannot change final
        System.out.println(w);
        }

}

