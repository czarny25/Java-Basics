package AnExampleOfEncapsulatedAplications;
import java.util.Random;
// created by Marcin 
    
public class GeneratePassword {
        
    private String password = "";

    public GeneratePassword() {
//        System.out.println(setPassWord());
    }    
    public String setPassWord(){
        Random rand = new Random();
        for(int i = 0;i < 7;i++){            
            password += rand.nextInt(10);           
        }
        return password;
    }
 }  
    

//     class CallGetSetConstructors{   
//        public static void main(String args[]){
//
//            GeneratePassword g = new GeneratePassword();
//            System.out.println(g);
//            g.password;       // private
//            g.setPassWord();  // private
//        }
//
//}

