package StringBuilder;
//import java.lang.StringBuilder;

import javax.swing.JOptionPane;

/** @author Marcin
 *  This application shows how to use String Builder class
 **/
public class StringBuilderPractice {
    public static void main(String []args){
    
        String empty = "dfsd";
        StringBuilder FromString = new StringBuilder(empty);
        System.out.println(FromString);
//        JOptionPane.showMessageDialog(null, FromString);
        double d = 45.56;
        char M = 'M';
        char i = 'i';
        StringBuilder FromChar = new StringBuilder();
        FromChar.append(M);
        FromChar.append(i);
        FromChar.append(empty);
        FromChar.append(d);
        System.out.println(FromChar);
        System.out.println(FromChar.reverse());
//        JOptionPane.showMessageDialog(null, FromChar);


  }

    

   
}
