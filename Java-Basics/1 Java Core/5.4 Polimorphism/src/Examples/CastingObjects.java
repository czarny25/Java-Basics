package Examples;


import java.util.ArrayList;

import zoo.Cat;
import zoo.Dog;

/** 
 * This class present object casting and situation when it is needed
 * @author Marcin
 */

public class CastingObjects {
        public static void main(String args[]){            
            
       // here I create a few object from its class   
            Dog wilczur = new Dog();     // object wilczur is created
            	System.out.println("wilczur hashCode " + wilczur.hashCode());
            Dog doberman = new Dog();
            	System.out.println("doberman hashCode " + doberman.hashCode());
            Cat kicia = new Cat();
            	System.out.println("kicia hashCode " + kicia.hashCode());
            	
       // now I create an arrayList that will store all these different objects     
             ArrayList<Object> myAnimalList = new ArrayList<Object>();
                myAnimalList.add(wilczur);  // wilczur is added to ArrayList of Objects amoungs others objects               
                myAnimalList.add(doberman); // doberman is added to ArrayList of Objects amoungs others objects 
                myAnimalList.add(kicia);    // kicia is added to ArrayList of Objects amoungs others objects 
       
       // 
                Object o = myAnimalList.get(0); // here we take out wilczur as the part of Object arrayIlt
                	System.out.println("wilczur hashCode " + o.hashCode()); // it still the same object
                	
//                 o.makeNoise();// object o regards the fact is a dog object cannot implement methods form dog class
                
                	Dog lol = (Dog)o;   // wilczur is being casted to newly created Dog object 
         
                // casting is allowed only Super class to subclass  "Animal to Dog" not allowed "Dog to Cat" 
                
                System.out.println("new wilczur hashCode " + lol.hashCode());
                
                	lol.makeNoise();// now after casting wilczur can use Dogs methods
                 
               

        }

}

