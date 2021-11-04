package String;
/** @author Marcin
 *  This presents few ways to create string 
 **/
public class DiffrentWaysToCreatString  {
    public static void main(String []args){    
        
  // Simple declaration
        String name = "Mina";
        
        String SecondName = new String("Mina");        
  // Building string from bunch of chars
        char[]Firstname = {'M','i','n','a'};
        String Fname = new String(Firstname);
        System.out.println(Fname);
  
  // Strings may be printed in a few differnt way
  // Beside common System.out.print() your can create 
  // multi string by conatanaton 
        
      String st = String.format("Ale " + "ladne " + "zdanie");  
      System.out.println(st);  
      
      
  }
}
