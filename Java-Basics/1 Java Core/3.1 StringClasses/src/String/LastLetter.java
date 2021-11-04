package String;

// created by Marcin 
public class LastLetter {
        public static void main(String args[]){

        	// simple convention from string to char
               String word = "kelan";               
               char[]wordInChar = new char[word.length()];
               
               for(int n = 0; n < word.length(); n++ ){                   
            	   wordInChar[n] = word.charAt(n);
               }
          ////////////////////////////////////////////////     
               
               for(char i: wordInChar){
            	   System.out.print(i);
            	   
               }
               System.out.print( " \n" + word);

        }

}

