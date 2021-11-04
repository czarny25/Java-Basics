package String;
/** @author Marcin
 *  This application shows different Java manipulations
 **/
public class StringProcedures {
    public static void main(String []args){
    
        
        // How to check the lenght of String        
        String CheckMyLength  = "I am fuckong long";        
        int StringsLength = CheckMyLength.length();
        System.out.println(StringsLength);

        //How to print it Specific character
        System.out.println(CheckMyLength.charAt(11));
        
        
        //How to print all character in diffrent ways 
        String space = null;
        for(int i = 0;i < CheckMyLength.length();i++){
            
            for(int j = 0 ;j < i * 2;j++){
                space += " ";
                System.out.print(" ");
                }            
                System.out.println("---");
            
            
            for(int j = 0;j < i * 2;j++){
                space += " ";
                System.out.print(" ");
                }            
                char c = CheckMyLength.charAt(i);
                System.out.println("|" + c +"|");
            for(int j = 0;j < i * 2;j++){
                space += " ";
                System.out.print(" ");
                }            
                System.out.println("---");
            
        }
    
    }
}
