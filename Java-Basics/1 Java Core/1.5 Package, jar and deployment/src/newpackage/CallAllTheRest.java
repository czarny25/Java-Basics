package newpackage;
import oldPackage.ClassToBeImported1;// here we are importing other package
import oldPackage.StaticFinalStuff;
/**
 * @author Marcin
 */
public class CallAllTheRest {    
    public static void main(String args[]){
        
// now we have start to place methods calls
        
//        MethodNum1();
       ClassToBeImported1 c1 = new ClassToBeImported1("Franek"); 
       c1.MethodNum2();
       
       oldPackage.ClassToBeImported2 c2 = new oldPackage.ClassToBeImported2("Heniek",4); // another way to import class
       
    
       TheClassToBeCalledFromTheSomePackage t1 = new TheClassToBeCalledFromTheSomePackage();
       t1.MethodNumer3();
       t1.MethodNum2();
    
        StaticFinalStuff stuff = new StaticFinalStuff();
    }

    

}
