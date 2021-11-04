package String;

import java.util.Scanner;
import javax.swing.JOptionPane;

/** @author Marcin
 *  This application is about 
 **/
public class FindSpaceWhitScanner {
    public static void main(String []args){
    // pseudocode

        String name;
        name = JOptionPane.showInputDialog(null,args);
        String result = "";        
        int numOfNames = 0;
        char initial;
        String initials ="";
        String word ="";
        
        Scanner key = new Scanner(name);
        Scanner key1 = new Scanner(name);
        while(key.hasNext()){
          result = result + key.next() + " ";
          numOfNames++;}
        System.out.println(numOfNames);
        for(int i = 0; i < numOfNames; i++){
           word = key1.next();
           System.out.println(word);
           initial =  word.charAt(0);
           initials = initials  + initial + ".";
            
        }System.out.print(initials);

        result = String.format("Hello %s\nYour initials are %s ",name, initials);
        JOptionPane.showMessageDialog(null, result);
        System.exit(0);
  }
}
