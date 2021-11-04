package _5_ConditionalOperators;
 /** 
  * this is the practice use of ternary operator 
  * It is used instead of if statement
  *
  */

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
             System.out.println(x);
         
         // ternary(potrojny) operator in action
         String ans = ((t.equals(f))? racja : bzdura); // the same but with string
             System.out.print(ans);
     }
     
 }