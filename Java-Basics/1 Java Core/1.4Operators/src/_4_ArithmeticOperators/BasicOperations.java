package _4_ArithmeticOperators;
/** @author Marcin
 *  This application shows how basic calculations in java are proceeded  
 **/
public class BasicOperations {
    public static void main(String []args){
    
        String name;
        int age1 = 23;
        int age2 = 34;
        short age3 = 3;
        long age4 = 23434;
        float age5 = 34.56f;
        double age6 = 23.44;
        
        // addition
        name = "Arthur is adding " + (age2 + age1)+ "\n";               // we are able to add int, double, float, long, short
        
        name = name + "Arthur is substracting " + (age5 - age4)+ "\n" ; // we are able to add int, double, float, long, short
        
        System.out.format("%s%n",name);

  }
}
