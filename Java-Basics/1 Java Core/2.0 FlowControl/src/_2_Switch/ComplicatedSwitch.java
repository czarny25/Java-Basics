
package _2_Switch;

// created by Marcin 
public class ComplicatedSwitch {
    
        static int x;
        public static void main(String args[]){

            
            String s = "abc";
            String ss = "ABC";
            
            switch(s){
                case "fsd":x++;
                case "abc":x--;
                
                default:x--;
//                case sss :x++;
                break;
                    
            }
        System.out.println(x);

        }

}

