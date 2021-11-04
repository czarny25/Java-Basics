package zoo;
// created by Marcin 
import java.util.ArrayList;
import java.util.Arrays;
public class MyAnimalsList {
    
        Animal[]animals = new Animal[4];
        int nextIndex = 0;
        
        
        // this method adds objects to an array
        public void add(Animal a){
            if(nextIndex < animals.length){
                animals[nextIndex] = a;
                System.out.println("Animal added at " + nextIndex);
                nextIndex++;
            }            
        }
        public void print(){
            System.out.println("this is my array " + Arrays.toString(animals));
        }

        
}


















