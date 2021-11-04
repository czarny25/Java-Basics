package AlltoSort;
import java.io.File;

/** @author Marcin
 *  This application is about 
 **/
public class basicOperations {
    public static void main(String []args){
    // pseudocode
        File f = new File("hello world.txt");
        File d = new File("mania.txt");
        File c = new File("fred.txt");
        
        getRidOf(f);
        
        // file must be placed in the same folder where code is otherwise it is not visible
        
        String result = "" + d.exists() +"\n"          // find whether the file exists
                           + d.getAbsolutePath()+"\n"  // find the path of that file
                           + d.canRead()+"\n"
                           + d.length()+"\n" 
                           + d.renameTo(f)+"\n\n";
        
              result += "" + f.exists() +"\n"          // find whether the file exists
                           + f.getAbsolutePath()+"\n"  // find the path of that file
                           + f.canRead()+"\n"
                           + f.length()+"\n" 
                           + f.renameTo(f)+"\n ";
              			   	
        System.out.print(result);
  
    
    
                  result += "" + d.canRead()           //Whether or not this file exists and can be read
                               + d.delete()            //Deletes the given file
                               + d.exists()            //Whether or not this file exists on the system
                               + d.getAbsolutePath()   // The full path where this file is located
                               + d.getName()           // The name of this file as a String, without any path attached
                               + d.isDirectory()       // Whether this file represents a directory/folder on the system
                               + d.isFile()            // Whether this file represents a file (nonfolder) on the system
                               + d.length()            // The number of characters in this file
                               + d.renameTo(c);        // Changes this file’s name to the given file’s name
    }
                 
                  public static void getRidOf(File d){
                  d.delete();}            //Deletes the given file
    
    
    
    
    
    
    
    
    
    
}
