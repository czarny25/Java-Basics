package DeclairingDiffrerendkindOfMethods;
/** @author Marcin
 *  This application is about 
 **/
public class ReturnMethods {
    public static void main(String []args){
    
  }
    // method that takes no parameter and returns String value
    public String method(){         
    return "lolo";
    }
    // an overloaded version of that above method
    public String method(String name){
        return name;
    }
    // method whit multiplePrameters and string return value
    public static String method(String name, int age){
        return name;
    }
}
