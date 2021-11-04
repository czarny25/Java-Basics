package zoo;

// created by Marcin 

import java.util.ArrayList;
import zoo.Cat;
import zoo.Dog;
import zoo.MyAnimalsList;

public class CastingObjects {
        public static void main(String args[]){            
            
       // here I create a few object from its class   
            Dog wilczur = new Dog();     // object wilczur is created
            System.out.println("wilczur hashCode " + wilczur.hashCode());
            Dog doberman = new Dog();
            Cat kicia = new Cat();

       // now I create an arrayList that will store all these different objects     
             ArrayList<Object> myAnimalList = new ArrayList<Object>();
                myAnimalList.add(wilczur);  // wilczur is added to ArrayList of Objects amoungs others objects               
                myAnimalList.add(doberman);
                myAnimalList.add(kicia); 
       
       // 
                Object o = myAnimalList.get(0); // here we take out wilczur as the part of Object arrayIlt
                System.out.println("wilczur hashCode " + o.hashCode()); // it still the same object
                // o.makeNoise();// object o regards the fact is a dog object cannot implement methods form dog class
                Dog lol = (Dog)o;   // wilczur is being casted to newly created Dog object 
         
                // casting is allowed only Super class to subclass  "Animal to Dog" not allowed "Dog to Cat" 
                
                System.out.println("wilczur hashCode " + lol.hashCode());
                lol.makeNoise();// now after casting wilczur can use Dogs methods
                 
               

        }

}

