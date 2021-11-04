package _2_Arrays;
import java.lang.Math;
// created by Marcin 
public class SearchingArray {
        public static void main(String args[]){                      
            
            String[]cars = {"Audi","bmw","Fiat","Volvo","Skoda","BMW","Opel"};
            String target = "BMW";
            int counter = 0;
            int counter1 = 0;
            
        for(String n : cars){                                              // this loop finds out here how big is array             
            counter++;
            if((n.equalsIgnoreCase(target))&& (counter1 <= counter )){      // now it checks array for some specified value
                
                n = n.toUpperCase();                                        // bring all string to uppercase
                char charAt = n.charAt(0);                                  // extract first character from String
                
                System.out.println(charAt );
                counter1++;
            }
        }

        
        
        }
}

