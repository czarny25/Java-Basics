package String;

// created by Marcin 
public class LastLetter {
        public static void main(String args[]){

               String word = "kelan";
               char lastlett = 0;
               
               for(int n = 0;n < word.length();n++ ){
                   
                   lastlett = word.charAt(n);
               }
               System.out.print(lastlett);

        }

}

