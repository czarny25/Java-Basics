package ConditionalOperators;

 // this is the practic use of ternary operator 

 public class TernaryOperator{    
    
	 public static void main(String[]args){
         
		 boolean b = true;
         String t = "true";
         String f = "false";
         int a = 23;
         int c = 23;
         
         String racja = "racja";
         String bzdura = "bzdura";
         
         int x = ((a == c )? 10 : 12 ); // if true it will print 10 if false 12
            
         System.out.println("jestes glupia " + x);
         
	 
         
         String ans = ((t.equals(f))? racja : bzdura); // the same but with string
             System.out.print(ans);
     
	 }
 }