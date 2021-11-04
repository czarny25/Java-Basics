package DeclairingDiffrerendkindOfMethods;
/**
 * @author Marcin
 */
public class StaticMethods {
    
    public String metoda1(){
        String name = "NADA";
        return name;
    }
    public static String metoda2(){                // 
        StaticMethods s = new StaticMethods();
        String ans = "ADA";
        String as = s.metoda1();   
        return ans + as;    
    }
    
    public static void main(String args){
        System.out.print(metoda2()); // static method cannot use nonstatic class members (fields, methods).
    }
}
