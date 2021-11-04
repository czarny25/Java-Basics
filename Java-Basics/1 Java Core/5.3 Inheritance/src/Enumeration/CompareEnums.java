package Enumeration;


//created by Marcin 
public class CompareEnums {
 
 enum State{ACTIVE, INACTIVE, DELETED}
 
     public static void main(String args[]){
         System.out.println(compareThis1(State.ACTIVE, State.INACTIVE));
         System.out.println(compareThis2(State.ACTIVE, State.INACTIVE));
         System.out.println(compareThis1(State.ACTIVE, State.ACTIVE));
         System.out.println(compareThis2(State.ACTIVE, State.ACTIVE));
     }
     public static boolean compareThis1(State arg1,State arg2){
     boolean result =  arg1.equals(arg2);           
     return result ;
     }
     public static boolean compareThis2(State arg1,State arg2){
     boolean result = (arg1 == arg2);           
     return result ;
     }
}

