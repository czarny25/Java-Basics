package ParametersInTheMethod;

// created by Marcin
// this code present passing final as the parameter to the method
// this process can be usefull if you want to conduct some calculations 
public class UsingFinalAsParameter {
    
        final static int NUMER = 34;
      
        public static int rata(final int a){ // here we define method with final
            int wynik = a / 8;               // parameter    
            return wynik;
        }
    
        public static void main(String args[]){
            
        	System.out.println(rata(NUMER));
        }

}

