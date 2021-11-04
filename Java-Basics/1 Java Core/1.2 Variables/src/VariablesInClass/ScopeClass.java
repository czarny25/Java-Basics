package VariablesInClass;


// created by Marcin 
public class ScopeClass {
        private int i = 35;
           
        public static void main(String argv[]){
         
            ScopeClass s = new ScopeClass();
	            
            s.someMethod();
	            
            someMethod();
	            
            System.out.println(new ScopeClass());
            
        }
        
            public static int someMethod(){
	            
            	System.out.println();
	            
            	return 23;
            }
         }


