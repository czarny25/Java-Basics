package CreatingAndUsingClassObjects;
// created by Marcin 
import javax.swing.JOptionPane;

public class Object_from_LangClasses {
        public static void main(String args[]){

            Character letter = '6'; // when you create object from class that is part of lang package you don't have
                                    // to import this class or create any constractors
            
            try{                
                if(letter.isDigit(letter)){ // here I use method from lang package whitout importing it
                JOptionPane.showMessageDialog(null,"All in order");}
                else JOptionPane.showMessageDialog(null,"Its not");
            }catch(NullPointerException e){
                JOptionPane.showMessageDialog(null,"Something is wrong");
            }
            
            
            
        }

}

