package SimpleTryCatchExceptions;

// created by Marcin 

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CatchClauseWithParameter {
        public static void main(String args[]){

             try{
                Scanner f = new Scanner(new File("zenekx.txt"));
                JOptionPane.showMessageDialog(null,"Witaj zenek");
            }catch(FileNotFoundException e){
                JOptionPane.showMessageDialog(null,"Such file does not exists  ***" + e.getMessage() + " **** " + e.getStackTrace());
            }


        }

}

