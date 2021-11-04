package String;
/** @author Marcin
 *  This class compare Strings 
 **/
public class CompareStrings {
    public static void main(String []args){
    
        String s1 = "hela";
        String s2 = "Hela";
        boolean theyAreTheSame = true;
        
        // Simple comprasion
        
        if(s1.equals(s2)){
            theyAreTheSame = false;
            System.out.println(theyAreTheSame);}
        else if(s1.equalsIgnoreCase(s2)){

            System.out.println(theyAreTheSame+" characters");} 
        else{}
  }
}
