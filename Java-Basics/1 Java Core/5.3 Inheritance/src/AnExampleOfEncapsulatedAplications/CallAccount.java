package AnExampleOfEncapsulatedAplications;

// created by Marcin 

import javax.swing.JOptionPane;

public class CallAccount {
        public static void main(String args[]){

            PersonalAccount pa = new PersonalAccount();
            String result = "Your Personal Account has been set up\n";
            
            pa.setFirstName("Marcin");
            result = result + pa.getFirstName();
            pa.setMiddleName("");
            result = result + " " + pa.getMiddleName();
            pa.setSurname("Ziejewski");
            result = result + " " + pa.getSurname();
            
            GeneratePassword g = new GeneratePassword();
            result = result + "\nAccount Password " + g.setPassWord();
            
            pa.setDataBirth("10/11/1977");
            result = result + "\n" + pa.getDataBirth();
        
            JOptionPane.showMessageDialog(null, result);
            
        }

}

