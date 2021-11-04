package VariablesInClass;

// created by Marcin 
public class LocalANDInstant {
    
          int hela = 34; // instant variable
          
          static int mela = 56;
    
        void metoda(int hela){      // class method
          hela = 45; // local variable
          System.out.println(hela); 
        }
        
        static void metoda2(int fela){
          System.out.println(fela);
          
        }
         public static void main(String args[]){// main method (runs all the code)
           
             LocalANDInstant l = new LocalANDInstant(); // becouse method "metoda" is not static 
                                                        // we have to create object of class to call it
             
             l.metoda(l.hela);        // here we call  non static method                        
            
             metoda2(mela);       //  static method doesn't need object 
                                  //  static variables don't need object too      
        }
        

}

