package _4_arrays;
// created by Marcin  this
import java.util.Arrays;
public class SwitchValuesInTheArray {
        public static void main(String args[]){

                String[]cars1 = {"Audi","bmw","Fiat","Volvo","Skoda","BMW","Opel"};
                String[]cars2 = {"Wolga","moskwicz","Lada","Scoda","Tatra","ural","Trabant"};
                String[]memory = new String[7];
                String target = null,replacement = null;        
                
                System.out.println("Array 1 = " + Arrays.toString(cars1));
                System.out.println("Array 2 = " + Arrays.toString(cars2));

                System.out.print("\n"+replaceAll(cars1,cars2,memory, target, replacement));

        }
        public static String replaceAll(String[]cars1, String[] cars2, String[] memory,String target,String replacement){
              
            for(int n = 0;n <= cars1.length - 1;n++){                
                 target = cars1[n];
                 replacement = cars2[n];
                 if(cars1[n].equalsIgnoreCase(target)){
                     memory[n] = target;
                     cars1[n] = replacement;
                     cars2[n] = target;
                 }else{
                     System.out.print("fuck off");
                 }   
              }
            String result = Arrays.toString(cars1);
            result = "Array 1 = " + result + "\nArray 2 = " + Arrays.toString(cars2 ) + "\n";
            return result;
        }
        
        
}

