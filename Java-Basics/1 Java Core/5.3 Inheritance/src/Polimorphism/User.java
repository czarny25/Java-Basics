package Polimorphism;

// created by Marcin 
public class User {
        public static void main(String args[]){

            ClassTop ct = new ClassTop();
//            ClassTop ctI = new ClassIlevel(false);

            ClassIlevel cI = new ClassIlevel();
            ClassIlevel cII = new ClassIlevel(true,"henia",23,"female");
            
//            ct.present();
            cII.present();
            
//            ((ClassIlevel)ct).extra();

        }

}

