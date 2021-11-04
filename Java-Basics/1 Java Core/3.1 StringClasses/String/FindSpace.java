package String;
import javax.swing.JOptionPane;
import javax.swing.text.Position;
/** @author Marcin
 *  This code write method that will find white space in String 
 **/
public class FindSpace {
    public static void main(String []args){
        
// take user input
        String name = "fjsde wewe gfdgd gdfg gdfgdfg";
        char letter;
        char whiteSpace = ' ';
        int position = 0;
        String positionOfTheInitials = "";
        
//        name = JOptionPane.showInputDialog(null,args);
        
        for(int i = 0; i < name.length();i++){
              letter = name.charAt(i);              
              if(letter == whiteSpace)             
              positionOfTheInitials = positionOfTheInitials + i + " "; 
         }
System.out.print(positionOfTheInitials);
    }
 
  }

