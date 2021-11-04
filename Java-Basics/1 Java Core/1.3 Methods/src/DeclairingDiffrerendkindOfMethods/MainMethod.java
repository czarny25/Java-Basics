package DeclairingDiffrerendkindOfMethods;

// created by Marcin 
// we can have couple of "main" method but only one can have String[] as an 
// argument 
public class MainMethod {
    
        public static void main(String args){
            System.out.println("Main1");
            metoda();
            
        }
        public static void main(int args[]){
            System.out.println("Main5");
        }
        public static void main(String ... args){ // this one is main
            System.out.println("Main2");
        }
        public static void metoda(String ... um ){
            System.out.println("Main4");
        }
        public static void metoda(String[]args, String a ){
            System.out.println("Main8");
        }
}

