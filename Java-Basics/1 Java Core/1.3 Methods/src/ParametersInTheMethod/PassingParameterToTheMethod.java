package ParametersInTheMethod;
import java.io.File;
import java.io.PrintWriter;
/** @author Marcin
 *  This application is about 
 **/
public class PassingParameterToTheMethod {
    public static void main(String []args){
    // pseudocode
    // method(23); // this is an ACTUAL PARAMETER which declare real value for
                    // formal parameter     
        plik("Marcin Ziejewki");
    }
     public static void method(int mania){   // this is a FORMAL PARAMETER, a frame
                                             // to specify type of parameter for   
         int hela = mania;                   // method call    
         System.out.println(hela);
  }
     public static File plik(String name){                       // here we create         
         File f = new File("E:/Kody i programy z kursu/JavaEclipseCode/Learning the Java Language/3.Classes and Objects/Working with the Methods/" + name + ".txt");   // method that 
         try{
         PrintWriter pr = new PrintWriter(f);        
         pr.append(name);                                        // will add text
         }catch(Exception e){
              System.out.print("It didnt work");                 // to file plik
         }
     return f;
         }
}
